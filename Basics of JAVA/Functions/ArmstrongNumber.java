import java.util.Scanner;

public class ArmstrongNumber {

    public static boolean isArmstrong(int num){
        int power = countDigits(num);
        int temp = num;
        int sum = 0;
        while(temp > 0){
            sum += Math.pow(temp % 10, power);
            temp /= 10;
        }
        if(sum == num)
            return true;
        else
            return false;
    }

    public static int countDigits(int num){
        int count = 0;
        while(num > 0){
            count++;
            num /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println(isArmstrong(num));
        sc.close();
    }
}