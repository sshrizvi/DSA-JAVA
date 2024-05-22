package IntermediateJAVA.Arrays;

public class MinimumElement {
    public static int minElement(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    //Driver Code
    public static void main(String[] args) {
        int[] arr = {10,20,41,0,-3,100};
        System.out.println("Minimum Element is " + minElement(arr));
    }
}
