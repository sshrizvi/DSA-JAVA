package IntermediateJAVA.Arrays;

import java.util.Scanner;

public class RotateArray {
    public static void rotateArraySyedApproach(int[] arr, int k){
        if(k < 0){
            while(k < 0){
                int firstElement = arr[0];
                for(int i = 0; i <= arr.length-2; i++){
                    arr[i] = arr[i+1];
                }
                arr[arr.length-1] = firstElement;
                k++;
            }
        }
        else{
            while(k > 0){
                int lastElement = arr[arr.length-1];
                for(int i = arr.length-2; i >= 0; i--){
                    arr[i+1] = arr[i];
                }
                arr[0] = lastElement;
                k--;
            }
        }
    }
    public static void rotateArrayChadApproach(int[] arr, int k){
        //Reducing very large value of k to range between [0,arr.length-1]
        k = k % arr.length;
        if(k % arr.length != 0){
            k = (k < 0) ? (k + arr.length) : k;
            while(k > 0){
                int lastElement = arr[arr.length-1];
                for(int i = arr.length-2; i >= 0; i--){
                    arr[i+1] = arr[i];
                }
                arr[0] = lastElement;
                k--;
            }
        }
    }
    //Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rotating factor (k) : ");
        int k = sc.nextInt();
        int[] arr = {1,2,3,4,5};
        rotateArrayChadApproach(arr, k);
        for(int val:arr){
            System.out.print(val + " ");
        }
        sc.close();
    }
}
