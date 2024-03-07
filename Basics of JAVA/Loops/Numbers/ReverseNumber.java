import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int num, rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        num = sc.nextInt();
        
        //Logic
        while(num > 0){
            rev = (rev * 10) + (num % 10);
            num = num / 10;
        }

        System.out.println("Reverse of given number is " + rev);

        //Closing object of Scanner class
        sc.close();
    }
}
