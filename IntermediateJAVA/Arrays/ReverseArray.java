package IntermediateJAVA.Arrays;

public class ReverseArray {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverseArray(int[] arr){
        int j = arr.length-1;
        for(int i = 0; i < (arr.length/2); i++){
            swap(arr,i,j);
            j--;
        }
    }
    //Driver Code
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        reverseArray(arr);
        for(int val : arr){
            System.out.println(val);
        }
    }
}
