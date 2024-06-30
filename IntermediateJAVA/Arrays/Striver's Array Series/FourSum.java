import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    // Optimal - Sorting - Two Pointers - T.C. -> O(n^3) - S.C. -> O(1)
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-3; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j < nums.length-2; j++){
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int k = j+1;
                int l = nums.length-1;
                while(k < l){
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum == target){
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                        while(k < l && nums[k] == nums[k-1]) k++;
                        while(k < l && nums[l] == nums[l+1]) l--;
                    }
                    else if(sum < target){
                        k++;
                    }
                    else{
                        l--;
                    }
                }
            }
        }
        // Return Statement
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {-2,-1,-1,1,1,2,2};
        int target = 0;
        System.out.println(fourSum(nums, target));
    }
}
