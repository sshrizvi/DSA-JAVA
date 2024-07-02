import java.util.Arrays;

public class MergeSort {
    public static void merge(int arr[], int l, int m, int r){
        int i = l;
        int j = m + 1;
        int k = 0;
        int[] temp = new int[r - l + 1];
        
        while(i <= m && j <= r){
            if(arr[i] < arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }
        while(i <= m) temp[k++] = arr[i++];
        while(j <= r) temp[k++] = arr[j++];
        
        for(i = l; i <= r; i++){
            arr[i] = temp[i - l];
        }
    }
    public static void mergeSort(int arr[], int l, int r){
        if(l >= r) return;
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,1,5,2,6,4};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
