import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, flag = 0;

        System.out.println("Enter a number : ");
        num = sc.nextInt();

        //Logic
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                flag = 1;
                break;
            }
        }
        if(flag == 1 || num == 1)
            System.out.println("Not a prime number.");
        else
            System.out.println("It is a prime number.");

        //Closing object of Scanner class
        sc.close();
    }
}
