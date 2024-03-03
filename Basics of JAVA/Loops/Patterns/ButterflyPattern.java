package Loops.Patterns;
import java.util.Scanner;
public class ButterflyPattern {
    public static void ButterflyPatternChadApproach(int n){
        int stars = 2;
        int space = n-2;
        //Logic
        for(int i = 1; i <= n; i++){

            //Printing Current Row
            for(int j = 1; j <= stars; j++){

                //Space condition and loop
                if(j == stars/2+1){
                    for(int k = 1; k <= space; k++){
                        System.out.print(" "+" ");
                    }
                }

                if(j == n+1){
                    continue;
                }
                System.out.print("*"+" ");
            }

            //Preparation for next row

            //Line Change
            System.out.println();

            //Incrementing or Decrementing space and stars
            if(i <= n/2){
                stars += 2;
                space -= 2;
            }
            else{
                stars -= 2;
                space += 2;
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows (ODD) : ");
        int n = sc.nextInt();
        ButterflyPatternChadApproach(n);
        sc.close();
    }
}