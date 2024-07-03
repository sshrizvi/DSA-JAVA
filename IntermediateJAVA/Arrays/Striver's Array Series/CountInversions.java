public class CountInversions {
    public static long inversionCount(long arr[], int n) {
        return mergeSort(arr, 0, n-1);
    }
    public static long merge(long arr[], int l, int m, int r){
        int i = l;
        int j = m + 1;
        int k = 0;
        long[] temp = new long[r - l + 1];
        long inversions = 0;
        
        while(i <= m && j <= r){
            if(arr[i] <= arr[j]) temp[k++] = arr[i++];
            else{
                temp[k++] = arr[j++];
                inversions += (m - i + 1); // Counting Inversions inside Merge Logic
            }
        }
        while(i <= m) temp[k++] = arr[i++];
        while(j <= r) temp[k++] = arr[j++];
        
        for(i = l; i <= r; i++){
            arr[i] = temp[i - l];
        }
        
        return inversions;
    }
    public static long mergeSort(long arr[], int l, int r){
        long inversions = 0;
        if(l >= r) return inversions;
        int mid = (l + r) / 2;
        inversions += mergeSort(arr, mid + 1, r);
        inversions += mergeSort(arr, l, mid);
        inversions += merge(arr, l, mid, r);
        return inversions;
    }
    public static void main(String[] args) {
        long[] arr = {57,38,91,10,38,28,79,41};
        System.out.println(inversionCount(arr, arr.length));
    }
}
