public class MaximumSubarray {

    // Valid Logic but Time Limit Exceeded - Brute Force
    public static int maxSubArray(int[] nums) {
        int currentSum = 0, maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                currentSum += nums[j];
                if(currentSum > maxSum) maxSum = currentSum;
            }
            currentSum = 0;
        }
        return maxSum;
    }
    //Kadane's Algorithm - Tracking maxSum at each position
    public static int maxSubArray2(int[] nums) {
        int maxCurrent = nums[0], maxGlobal = nums[0];
        for(int i = 1; i < nums.length; i++){
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
            if(maxCurrent > maxGlobal) maxGlobal = maxCurrent;
        }
        return maxGlobal;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray2(nums));
    }
}
