import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) { // Using HashTable
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int x : nums){
            if(freq.get(x) == null) freq.put(x,1);
            else freq.put(x, freq.get(x) + 1);
        }
        Iterator<Map.Entry<Integer,Integer>> iterator = freq.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,Integer> entry = iterator.next();
            if(entry.getValue() > (nums.length/2)) return entry.getKey();
        }
        return Integer.MAX_VALUE;
    }
    public static int majorityElement2(int[] nums) { // Without HashTable - Most Optimal
        int res = 0;
        int majority = 0;
        for (int n : nums) {
            if (majority == 0) res = n;
            majority += n == res ? 1 : -1;
        }
        return res;        
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement2(nums));
    }
}
