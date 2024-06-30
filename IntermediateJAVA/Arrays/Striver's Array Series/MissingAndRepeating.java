import java.util.Arrays;

public class MissingAndRepeating {

    // Brute - Force - Sorting - Basic Maths - T.C. -> O(n log n) - S.C. -> O(1)
    public static int[] findTwoElement(int[] arr, int n) {
        Arrays.sort(arr);
        int a = 0;
        int b = 0;
        for(int i = 0; i < n-1; i++){
            // Missing Number
            if(arr[0] != 1) a = 1;
            else if(arr[i+1] - arr[i] == 2) a = arr[i] + 1;
            // Repeating Number
            if(arr[i] == arr[i+1]) b = arr[i];
        }
        if(a == 0) a = n;
        // Return Statement
        return new int[]{b,a};
    }

    // Optimal - Using Mathematics - T.C. -> O(n) - S.C. -> O(1)
    public static int[] findTwoElement2(int[] arr, int n) {
        long sum = 0;
        long actualSum = (n * (n + 1L)) / 2;
        long sumOfSquares = 0;
        long actualSumOfSquares = (n * (n + 1L) * (2L * n + 1)) / 6;
        
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            sumOfSquares += (long) arr[i] * arr[i];
        }
        
        long XminusY = sum - actualSum;
        long XplusY = (sumOfSquares - actualSumOfSquares) / XminusY;
        
        long x = (XplusY + XminusY) / 2;
        long y = x - XminusY;
        
        return new int[] {(int) x, (int) y};
    }
    public static void main(String[] args) {
        int[] arr = {1,3,3};
        System.out.println(Arrays.toString(findTwoElement2(arr, arr.length)));
    }
}
