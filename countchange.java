package countchange;
import java.util.Scanner;
//import java.lang.Math;

public class countchange 
{
    public static void main(String[] args) 
    {
        Scanner myObject = new Scanner(System.in);

        //asks for input variable.
        System.out.println("How many quarters? ");
        //holds the first variable input (quarters).
        int quarters = myObject.nextInt();
        System.out.println("How many dimes? ");
        int dimes = myObject.nextInt();
        System.out.println("How many nickels? ");
        int nickels = myObject.nextInt();
        System.out.println("How many pennies? ");
        int pennies = myObject.nextInt();

        //converts user input into the proper math value.
        double money = (0.25 * quarters) + (0.10 * dimes) + (0.05 * nickels) + (0.01 * pennies);

        //displays the value after it has been converted into the proper values from the (double money).
        System.out.println("Total: $" + money);

        myObject.close();

    }
}
