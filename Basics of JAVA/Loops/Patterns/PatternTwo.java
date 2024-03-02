package Loops.Patterns;

import java.util.Scanner;

public class PatternTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();

        //Logic
        int e = 0;
        for(int i = 1; i <= n; i++){

            //Space Loop
            for(int j = 1; j <= n-i; j++){
                System.out.print(" "+" ");
            }

            //Star Loop
            for(int k = 1; k <= i+e; k++){
                System.out.print("*"+" ");
            }

            e += 1;

            //Line Change
            System.out.println();
        }
        //Closing object of Scanner class
        sc.close();
    }
}
