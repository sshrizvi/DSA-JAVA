import java.util.HashMap;

public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums){
            if(map.get(x) == null) map.put(x,1);
            else return x;
        }
        return Integer.MIN_VALUE;
    }
    public static int findDuplicateOptimal(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Find the intersection point of the two pointers
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Find the entrance of the cycle
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,4};
        System.out.println(findDuplicateOptimal(nums));
    }
}