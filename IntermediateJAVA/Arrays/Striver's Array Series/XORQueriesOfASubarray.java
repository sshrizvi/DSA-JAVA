import java.util.Arrays;
import java.util.HashMap;

public class XORQueriesOfASubarray {
    // Brute - Force
    public static int[] xorQueries(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            for(int j = queries[i][0]; j <= queries[i][1]; j++){
                answer[i] ^= arr[j];
            }
        }
        return answer;
    }

    // Using HashMap
    public static int[] xorQueries2(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixXOR = 0;
        for(int i = 0; i < arr.length; i++){
            prefixXOR ^= arr[i];
            map.put(i, prefixXOR);
        }
        for(int i = 0; i < queries.length; i++){
            int left = queries[i][0];
            int right = queries[i][1];
            answer[i] = arr[left] ^ map.get(right) ^ map.get(left);
        }
        return answer;
    }

    // Using Array Instead of Hashmap for fast processing
    public static int[] xorQueries3(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int[] prefixXOR = new int[arr.length];
        
        // Step 1: Calculate prefix XOR array
        prefixXOR[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefixXOR[i] = prefixXOR[i-1] ^ arr[i];
        }
        
        // Step 2: Process each query using prefix XOR array
        for(int i = 0; i < queries.length; i++){
            int left = queries[i][0];
            int right = queries[i][1];
            if(left == 0){
                answer[i] = prefixXOR[right];
            } else {
                answer[i] = prefixXOR[right] ^ prefixXOR[left-1];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,8};
        int[][] queries = {{0,1},{1,2},{0,3},{3,3}};
        System.out.println(Arrays.toString(xorQueries3(arr, queries)));;
    }
}
