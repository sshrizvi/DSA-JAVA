public class SecondLargest {
    public static int print2largest(int arr[], int n) {
        int max1 = arr[0];
        int max2 = -1;
        for (int i = 1; i < arr.length; i++){
            if(max1 < arr[i]){
                max2 = max1;
                max1 = arr[i];
            }
            if(arr[i] < max1 && arr[i] > max2) max2 = arr[i];
        }
        return max2;
    }
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(print2largest(arr, arr.length));
    }
}
