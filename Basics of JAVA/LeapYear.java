import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.print("Enter a year : ");
        year = sc.nextInt();

        //Logic
        if(year % 4 == 0 && year % 100 != 0){
            System.out.println("A leap year");
        }
        else if(year % 4 == 0 && year % 400 == 0){
            System.out.println("A leap year");
        }
        else{
            System.out.println("Not a leap year");
        }

        //Closing object of Scanner class
        sc.close();
    }
}
