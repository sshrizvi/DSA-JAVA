import java.util.Scanner;
public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Enter number 1 : ");
        num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        num2 = sc.nextInt();
        System.out.print("Enter number 3 : ");
        num3 = sc.nextInt();

        //Logic
        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is largest");
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println(num2 + " is largest");
        }
        else{
            System.out.println(num3 + " is largest");
        }
        //Closing object of Scanner class
        sc.close();
    }
}
