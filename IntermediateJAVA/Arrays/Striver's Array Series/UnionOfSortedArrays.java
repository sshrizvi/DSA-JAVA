import java.util.ArrayList;

public class UnionOfSortedArrays {
    private static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {
        ArrayList<Integer> union = new ArrayList<>();
        //Logic
        int i = 0;
        int j = 0;
        int prev = -1000000001;
        while(i < n && j < m){
            if(arr1[i] == arr2[j]){
                if(!(prev == arr1[i])){
                    union.add(arr1[i]);
                    prev = arr1[i];
                }
                i++;
                j++;
            }
            else{
                if(arr1[i] < arr2[j]){
                    if(!(prev == arr1[i])){
                        union.add(arr1[i]);
                        prev = arr1[i];
                    }
                    i++;
                }
                else{
                    if(!(prev == arr2[j])){
                        union.add(arr2[j]);
                        prev = arr2[j];
                    }
                    j++;
                }
            }
        }
        if(i == n){
            while(j < m){
                if(!(prev == arr2[j])){
                    union.add(arr2[j]);
                    prev = arr2[j];
                }
                j++;
            }
        }
        else{
            while(i < n){
                if(!(prev == arr1[i])){
                    union.add(arr1[i]);
                    prev = arr1[i];
                }
                i++;
            }
        }
        return union;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,1,1,1,1};
        int[] arr2 = {2,2,2,2};
        System.out.println(findUnion(arr1, arr2, arr1.length, arr2.length));
    }
}
