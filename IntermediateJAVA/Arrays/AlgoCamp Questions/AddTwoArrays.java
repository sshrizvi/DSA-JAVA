package IntermediateJAVA.Arrays;

import java.util.ArrayList;

public class AddTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {5,6,1,7};
        int[] arr2 = {9,3,0};
        System.out.println("Sum of given arrays is : " + sumOfTwoArraysChadApproach(arr1, arr2));
    }

    public static ArrayList<Integer> sumOfTwoArraysChadApproach(int[] arr1, int[] arr2){
        ArrayList<Integer> output = new ArrayList<>();
        int carry = 0;

        //Logic
        int l1 = arr1.length-1;
        int l2 = arr2.length-1;
        while(l1 >= 0 || l2 >= 0){
            int sum = 0;
            if(l1 >= 0){
                sum += arr1[l1];
            }
            if(l2 >= 0){
                sum += arr2[l2];
            }
            sum += carry;
            carry = sum / 10;
            output.addFirst(sum % 10);
            l1--;
            l2--;
        }
        if(carry != 0){
            output.addFirst(carry);
        }
        return output;
    }

    public static ArrayList<Integer> sumOfTwoArraysSyedApproach(int[] arr1, int[] arr2){
        int l1 = arr1.length-1;
        int l2 = arr2.length-1;
        ArrayList<Integer> output= new ArrayList<>();

        //Logic
        int fd = 0;
        while(l1 >= 0 && l2 >= 0){
            int sum = arr1[l1] + arr2[l2] + fd;
            fd = sum / 10;
            output.addFirst(sum % 10);
            l1--;
            l2--;
        }
        if(l1 >= 0){
            while(l1 >= 0){
                int sum = arr1[l1] + fd;
                fd = sum / 10;
                output.addFirst(sum % 10);
                l1--;
            }
        }
        else if(l2 >= 0){
            while(l2 >= 0){
                int sum = arr2[l2] + fd;
                fd = sum / 10;
                output.addFirst(sum % 10);
                l2--;
            }
        }
        if(fd != 0){
            output.addFirst(fd);
        }
        return output;
    }
}