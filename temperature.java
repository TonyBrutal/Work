import java.util.Scanner;

public class temperature 
{
    public static double ConvertCtoF(double tempC)
    {
        double tempF = 9.0/5 * tempC + 32;
        return tempF;
    }

    public static void main(String[] args)
    {
        System.out.println("What temperature would you like to convert to Fahrenheit? ");
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();

        System.out.print("C to F conversion is: " + ConvertCtoF(number));
        //System.out.print(ConvertCtoF(number));

        input.close();
    }

}
