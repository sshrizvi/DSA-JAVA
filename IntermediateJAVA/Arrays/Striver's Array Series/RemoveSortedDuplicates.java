import java.util.Arrays;

public class RemoveSortedDuplicates {
    private static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] != nums[k]){
                k++;
                nums[k] = nums[i];
            }
        }
        return k+1;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
}
