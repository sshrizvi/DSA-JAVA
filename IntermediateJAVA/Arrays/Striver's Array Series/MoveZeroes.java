import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        while(l <= r){
            if(nums[l] == 0){
                //Shifting
                for(int i = l; i < r; i++){
                    nums[i] = nums[i+1];
                }
                //Placing Zero at the end
                nums[r] = 0;
                r--;
            }
            else{
                l++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
