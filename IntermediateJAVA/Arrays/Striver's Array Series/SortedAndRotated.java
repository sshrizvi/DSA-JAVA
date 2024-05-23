public class SortedAndRotated{
    public static boolean check(int[] nums) {
        if (nums.length <= 1)
            return true;
        for (int x = 0; x < nums.length; x++) {
            for (int i = 0; i < nums.length - 1; i++) {
                int j = (i + x) % nums.length;
                int k = (j + 1) % nums.length;
                if (nums[j] > nums[k])
                    break;
                else {
                    if (i == nums.length - 2)
                        return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(check(arr));
    }
}