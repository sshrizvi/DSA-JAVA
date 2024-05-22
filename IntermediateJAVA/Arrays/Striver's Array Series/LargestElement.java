public class LargestElement {
    public static int largest(int arr[], int n){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]) max = arr[i];
        }
        return max;
    }
    //Driver Code
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(largest(arr,arr.length));
    }
}