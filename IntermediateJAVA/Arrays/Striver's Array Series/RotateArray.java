import java.lang.reflect.Array;

public class RotateArray {
    public static void rotateArrayChadApproach(int[] nums, int k) {
        k = k % nums.length;
        reverseArray(nums,0,nums.length-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,nums.length-1);
    }
    public static void reverseArray(int[] nums, int start, int end) {
        int temp;
        while(start < end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotateArray(int[] arr, int k){
        //Reducing very large value of k to range between [0,arr.length-1]
        k = k % arr.length;
        if(k % arr.length != 0){
            k = (k < 0) ? (k + arr.length) : k;
            while(k > 0){
                int lastElement = arr[arr.length-1];
                for(int i = arr.length-2; i >= 0; i--){
                    arr[i+1] = arr[i];
                }
                arr[0] = lastElement;
                k--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {-1,-100,3,99};
        rotateArrayChadApproach(arr, 2);
        for (int val : arr) {
            System.out.println(val);
        }
    }
}
