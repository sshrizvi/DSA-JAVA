package IntermediateJAVA.Arrays;

import java.util.ArrayList;

public class IntersectionArrays {
    public static void intersectionOfArraysSyedApproach(int[] arr1, int[] arr2){
        ArrayList<Integer> intersection = new ArrayList<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        if(arr1[n1-1] > arr2[0] && arr2[n2-1] > arr1[0]){
            int shortlength = n1 < n2 ? n1 : n2;
            if(shortlength == n1){
                for(int target : arr1){
                    if(isPresentBinarySearch(arr2, target)){
                        if(intersection.contains(target) == false){
                            intersection.add(target);
                        }
                    }
                }
            }
        }
        System.out.println(intersection);
    }
    public static void intersectionOfArraysChadApproach(int[] arr1, int[] arr2){
        ArrayList<Integer> intersection = new ArrayList<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        if(arr1[n1-1] > arr2[0] && arr2[n2-1] > arr1[0]){
            int a = 0;
            for(int target : arr1){
                for(int i = a; i < arr2.length; i++){
                    if(target == arr2[i]){
                        intersection.add(target);
                        a = i;   
                    }
                }   
            }
        }
        System.out.println(intersection);
    }
    public static boolean isPresentBinarySearch(int[] arr2, int target) {
        int l = 0;
        int r = arr2.length - 1;
        int mid = (l+r)/2;
        while(l <= r){
            if(arr2[mid] == target){
                return true;
            }
            else if(arr2[mid] > target){
                r = mid - 1;
                mid = (l+r)/2;
            }
            else{
                l = mid + 1;
                mid = (l+r)/2;
            }
        }
        return false;
    }
    //Driver Code
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10,11};
        int[] arr2 = {9,10,11,12,13};
        intersectionOfArraysChadApproach(arr1,arr2);
    }
}
