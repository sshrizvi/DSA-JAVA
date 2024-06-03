import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        int[] ans = new int[2];
        //Logic
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target && i != j){
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }

        //Return Statement
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
