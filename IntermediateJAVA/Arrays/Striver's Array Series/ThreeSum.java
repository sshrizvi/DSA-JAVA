import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {

    // Brute - Force Approach T.C. -> O(n^3) 
    public static List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                for(int k = j+1; k < nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == 0)
                        set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        // Return Statement
        return ans;
    }

    // Better - Using Hashing - T.C. -> O(n^2) - S.C. -> O(n)
    public static List<List<Integer>> threeSum2(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        HashSet<Integer> map = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                int rem = -(nums[i] + nums[j]);
                if(map.contains(rem)){
                    int[] triplet = {nums[i], nums[j], rem};
                    Arrays.sort(triplet);
                    set.add(Arrays.asList(triplet[0], triplet[1], triplet[2]));
                }
                map.add(nums[j]);
            }
            map.clear();
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        // Return Statement
        return ans;
    }

    // Optimal - Two Pointers - T.C. -> O(n^2) - S.C. -> O(1)
    public static List<List<Integer>> threeSum3(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicates for i
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    // Skip duplicates for j
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    j++;
                    // Skip duplicates for k
                    while (j < k && nums[k] == nums[k - 1]) k--;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum3(nums));
    }
}
