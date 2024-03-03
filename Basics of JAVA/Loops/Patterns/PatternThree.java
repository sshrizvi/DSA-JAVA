package Loops.Patterns;

import java.util.Scanner;

public class PatternThree {

    public static void PatternThreeNoobApproach(int n){
        //Logic
        for(int i = 1; i <= n/2+1; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i = 1; i <= n/2; i++){
            for(int j = 1; j <= n/2+1-i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void PatternThreeChadApproach(int n){
        int stars = 1;

        for(int i = 1; i <= n; i++){

            //Printing stars for the current row
            for(int j = 1; j <= stars; j++){
                System.out.print("*"+" ");
            }

            //Preparation for next row

            //Changing the line
            System.out.println();
            //Incrementing or Decrementing the stars
            if(i <= n/2){
                stars++;
            }
            else{
                stars--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        PatternThreeChadApproach(n);
        sc.close();
    }
}
