import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        int fi = -1;
        int si = Integer.MIN_VALUE;
        for(int i = nums.length-2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                fi = i;
                break;
            }
        }
        if(fi != -1){
            for(int i = nums.length-1; i > fi; i--){
                if(nums[i] > nums[fi]){
                    si = i;
                    break;
                }
            }
            int temp = nums[fi];
            nums[fi] = nums[si];
            nums[si] = temp;
        }
        int l = fi + 1, r = nums.length-1;
            while(l < r){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }
    }
    public static void main(String[] args) {
        int[] nums = {3,1,2};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
