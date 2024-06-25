import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {

    // Using Sorting
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int maxLength = 1, currentLength = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) continue;
            if (nums[i] == nums[i - 1] + 1) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }
        return Math.max(maxLength, currentLength);
    }

    // Using HashSet
    public static int longestConsecutive2(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        int maxLength = 1, currentLength = 0;
        for(int x : set){
            if(set.contains(x-1)) continue;
            int y = x;
            while(set.contains(y++)) currentLength++;
            maxLength = Math.max(maxLength, currentLength);
            currentLength = 0;
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive2(nums));
    }
}
