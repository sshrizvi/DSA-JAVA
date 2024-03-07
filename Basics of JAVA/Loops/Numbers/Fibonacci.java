import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, f = 0, s = 1, t = 0, i = 3;
        System.out.print("Enter the position of number : ");
        n = sc.nextInt();

        //Logic
        if(n == 1){
            System.out.println(n + "th Fibonacci number is " + f);
        }
        else if(n == 2){
            System.out.println(n + "th Fibonacci number is " + s);
        }
        else{
            while(i <= n){
                t = f + s;
                f = s;
                s = t;
    
                i++;
            }
            System.out.println(n + "th Fibonacci number is " + t);
        }

        //Closing object of Scanner class
        sc.close();
    }
}
