package Loops.Patterns;

import java.util.Scanner;

public class DiamondPattern {
    public static void DiamondPatternNoobApproach(int n){
        //Initializing Space and Stars
        int space = n/2;
        int stars = 1;
        //Logic
        for(int i = 1; i <= n; i++){
            
            //Printing space for current row
            for(int j = 1; j <= space; j++){
                System.out.print(" "+" ");
            }
            //Printing stars for current row
            for(int j = 1; j <= stars; j++){
                System.out.print("*"+" ");
            }

            //Preparation for the next row
            //Line Change
            System.out.println();
            
            //Incrementing or Decrementing space and stars
            if(i <= n/2){
                space--;
                stars += 2;
            }
            else{
                space++;
                stars -= 2;
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows (ODD) : ");
        int n = sc.nextInt();
        DiamondPatternNoobApproach(n);
        sc.close();
    }
}
