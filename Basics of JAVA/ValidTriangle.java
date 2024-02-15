import java.util.*;
public class ValidTriangle {
    public static void main(String[] args) {

        //Creating object of Scanner class for input
        Scanner sc = new Scanner(System.in);

        //Declaring input variables for storing angles
        int angle1, angle2, angle3;

        //Taking input from user
        System.out.print("Enter Angle Number 1 : ");
        angle1 = sc.nextInt();
        System.out.print("Enter Angle Number 2 : ");
        angle2 = sc.nextInt();
        System.out.print("Enter Angle Number 3 : ");
        angle3 = sc.nextInt();

        //Implementing Logic for ValidTriangle
        if(angle1 != 0 && angle2 != 0 && angle3 != 0){
            if(angle1 + angle2 + angle3 == 180){
                System.out.println("Valid Triangle");
            }
            else{
                System.out.println("Invalid Triangle");
            }
        }
        else{
            System.out.println("Invalid Triangle");
        }

        //Closing the Scanner class object
        sc.close();
    }
}
