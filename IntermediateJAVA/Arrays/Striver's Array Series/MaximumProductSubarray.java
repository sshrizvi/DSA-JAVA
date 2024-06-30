public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        int n = nums.length;
        long max = Integer.MIN_VALUE;
        long prefix = 1, suffix = 1;
        for(int i = 0; i < n; i++){
            if(prefix == 0 || prefix < Integer.MIN_VALUE) prefix = 1;
            if(suffix == 0 || suffix < Integer.MIN_VALUE) suffix = 1;
            prefix *= nums[i];
            suffix *= nums[n-i-1];
            max = Math.max(max, Math.max(prefix, suffix));
        }
        return (int) max;
    }
    public static void main(String[] args) {
        int[] nums = {0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
        System.out.println(maxProduct(nums));
    }
}
