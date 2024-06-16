public class MaxSumInSubarrays {
    public static long pairWithMaxSum(long arr[], long N){
        long maxSum = 0;
        for(long i = 0; i < N - 1; i++){
            if(maxSum < arr[(int)i] + arr[(int)(i+1)]) maxSum = arr[(int)i] + arr[(int)(i+1)];
        }
        return maxSum;
    }
    public static void main(String[] args) {
        long[] arr = {8, 6, 1, 6, 2, 10, 10, 8, 3, 6, 4, 4, 7};
        System.out.println(pairWithMaxSum(arr, arr.length));
    }
}
