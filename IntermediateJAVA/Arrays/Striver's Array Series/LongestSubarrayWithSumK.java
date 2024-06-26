import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumK {
    // Brute - Force
    public static int lenOfLongSubarr (int A[], int N, int K) {
        int sum = 0, currL = 0, maxL = 0;
        for(int i = 0; i < N; i++){
            for(int j = i; j < N; j++){
                sum += A[j];
                currL++;
                if(sum == K){
                    maxL = Math.max(maxL, currL);
                }
            }
            sum = 0;
            currL = 0;
        }
        return maxL;
    }
    
    public static int lenOfLongSubarr2 (int A[], int N, int K) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0, maxL = 0;
        for(int i = 0; i < N; i++){
            prefixSum += A[i];
            map.putIfAbsent(prefixSum, i);
            if(prefixSum == K) maxL = Math.max(maxL,map.get(prefixSum)+1);
            else maxL = Math.max(maxL, i - map.getOrDefault(prefixSum-K, Integer.MAX_VALUE));
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        return maxL;
    }
    public static void main(String[] args) {
        int[] arr = {-13,0,6,15,16,2,15,-12,17,-16,0,-3,19,-3,2,-9,-6};
        System.out.println(lenOfLongSubarr2(arr, arr.length, 15));
    }
}
