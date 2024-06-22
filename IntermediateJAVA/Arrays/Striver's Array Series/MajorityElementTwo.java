import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MajorityElementTwo {
    public static List<Integer> majorityElement(int[] nums) { // Using HashMap
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int x : nums){
            if(freq.get(x) == null) freq.put(x,1);
            else freq.put(x, freq.get(x) + 1);
        }
        Iterator<Map.Entry<Integer,Integer>> iterator = freq.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,Integer> entry = iterator.next();
            if(entry.getValue() > (nums.length/3)) ans.add(entry.getKey());
        }
        return ans;
    }
    public static List<Integer> majorityElement2(int[] nums) { // Using Sorting
        ArrayList<Integer> ans = new ArrayList<>();
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++) arr[i] = nums[i];
        Arrays.sort(arr);
        int count = 0;
        int candidate = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == candidate){
                count++;
            }
            if(arr[i] != candidate){
                if(count > nums.length/3) ans.add(candidate);
                count = 1;
                candidate = arr[i];
            }
            if(i == nums.length-1){
                if(count > nums.length/3) ans.add(candidate);
                count = 1;
                candidate = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {3,3,3,3,2,2,2,2,1,1,1};
        System.out.println(majorityElement2(nums));
    }
}
