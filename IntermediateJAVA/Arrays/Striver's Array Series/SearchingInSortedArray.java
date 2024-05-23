public class SearchingInSortedArray {
    public static int searchInSorted(int arr[], int N, int K){
        int l = 0;
        int r = N-1;
        int mid = (l+r)/2;
        
        while(l <= r){

            if(arr[mid] == K) return 1;

            else if(arr[mid] < K){
                l = mid+1;
                mid = (l+r)/2;
            }
            else{
                r = mid-1;
                mid = (l+r)/2;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        System.out.println(searchInSorted(arr, arr.length, 6));
    }
}
