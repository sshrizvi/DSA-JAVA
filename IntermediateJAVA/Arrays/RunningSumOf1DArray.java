package IntermediateJAVA.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] runningSum = runningSumSyedApproach(nums);
        for(int val : runningSum){
            System.out.print(val + " ");
        }
    }

    public static int[] runningSumSyedApproach(int[] nums) {
        int[] runningSum = new int[nums.length];
        
        //Logic
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            runningSum[i] = sum;
        }
        return runningSum;
    }
}
