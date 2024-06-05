import java.util.ArrayList;
import java.util.Collections;

public class LeaderInAnArray {
    public static ArrayList<Integer> leaders(int[] arr, int n){
        ArrayList<Integer> leaders = new ArrayList<>();
        int leader = arr[n-1];
        leaders.add(leader);
        for(int i = n-2; i >= 0; i--){
            if(arr[i] < leader) continue;
            leader = arr[i];
            leaders.add(leader);
        }
        Collections.reverse(leaders);
        return leaders;
    }
    public static ArrayList<Integer> findleaders(int arr[], int n){
        ArrayList<Integer> leaders = new ArrayList<>();
        int flag = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] < arr[j]){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) leaders.add(arr[i]);
            flag = 0;
        }
        return leaders;
    }
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        System.out.println(leaders(arr, arr.length));
    }
}
