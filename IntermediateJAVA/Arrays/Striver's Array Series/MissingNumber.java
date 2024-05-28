public class MissingNumber{
    private static int findMissing(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return ((n*(n+1))/2 - sum);
    }
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println("Missing Number is : " + findMissing(nums));
    }
}