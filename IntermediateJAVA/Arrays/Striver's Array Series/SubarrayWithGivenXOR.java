import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SubarrayWithGivenXOR {
    public static int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int XOR = 0, count = 0;
        for(int x : A){
            XOR ^= x;
            if(map.containsKey(XOR ^ B)){
                count += map.get(XOR ^ B);
            }
            map.put(XOR, map.getOrDefault(XOR, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(5,5,5,5,5));
        System.out.println(solve(A, 5));
    }
}
