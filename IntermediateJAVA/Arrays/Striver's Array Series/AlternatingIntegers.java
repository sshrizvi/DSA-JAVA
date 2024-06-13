import java.util.Arrays;

public class AlternatingIntegers {

    public static int[] rearrangeArray(int[] nums, int length) {
        int[] ans = new int[length];
        int pos = 0;
        int neg = 1;
        for (int n : nums) {
            if (n > 0) {
                ans[pos] = n;
                pos += 2;
            } else {
                ans[neg] = n;
                neg += 2;
            }
        }
        return ans;
    }
    
    public static int[] rearrangeArray(int[] nums) {
        int[] p = new int[nums.length/2];
        int[] n = new int[nums.length/2];
        int pi = 0, ni = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                n[ni] = nums[i];
                ni++;
            }
            else{
                p[pi] = nums[i];
                pi++;
            }
        }
        int j = 0;
        for(int i = 0; i < nums.length; i += 2){
            nums[i] = p[j];
            nums[i+1] = n[j];
            j++;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }
}
