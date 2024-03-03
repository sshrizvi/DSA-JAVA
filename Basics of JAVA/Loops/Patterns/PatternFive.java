package Loops.Patterns;

import java.util.Scanner;

public class PatternFive {
    public static void PatternFiveNoobApproach(int n){
        int stars = n;
        int space = -1;
        for(int i = 1; i <= n; i++){
            //Printing Current Row
            for(int j = 1; j <= stars; j++){
                System.out.print("*"+" ");
            }
            for(int j = 1; j <= space; j++){
                System.out.print(" "+" ");
            }
            for(int j = 1; j <= stars; j++){
                if(j == n){
                    continue;
                }
                System.out.print("*"+" ");
            }
            stars--;
            space += 2;
            System.out.println();
        }
    }

    public static void PatternFiveChadApproach(int n){
        int stars = n*2;
        int space = -1;
        for(int i = 1; i <= n; i++){
            //Printing Current Row
            for(int j = 1; j <= stars; j++){

                //Space Loop
                if(j == stars/2+1){
                    for(int k = 1; k <= space; k++){
                        System.out.print(" "+" ");
                    }
                }

                //Skipping last star of first row
                if(j == n*2){
                    continue;
                }
                
                //Printing Stars
                System.out.print("*"+" ");
            }

            //Preparation for next row
            stars -= 2;
            space += 2;
            System.out.println();
        }
    }

    //Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        PatternFiveChadApproach(n);
        sc.close();
    }
}
