import java.util.Scanner;
//import java.math.MathContext;
import java.util.Random;

public class dice 
{

    public static void main(String[] args) 
    {
        //asks for user input
        System.out.println("Hello, what is your name?");
        //allows the user to actually enter an input
        Scanner userName = new Scanner(System.in);
        //holds the input variable
        String name = userName.nextLine();
        //displays hello message and the user input variable
        //System.out.println("Hello "+name);

        //displays hello message and user input in capitilized format.
        System.out.println("Hello " + name.toUpperCase());  
    /*--------------------------------------------------------------------------*/
        System.out.print("Enter the number of Dice to be rolled: ");
        //Read number of dice to roll from user input.     
        Scanner userInput = new Scanner(System.in);

        //Reading the number of Dice to roll.
        int numberOfDice = userInput.nextInt();
      
        //Creating Random class object to generate random numbers.
        Random randomNum = new Random();

        //int dieRandom = randomNum.nextInt(6)+1;

        //empty variable then takes user input compares it to the empty variable, then gives you an output up to the number that you input. y++ adds 1 to y=0 variable until y is no longer less than number of dice.
        for(int y=0;y < numberOfDice; y++)
        {
            //variable that holds the random number generated.
            int dieRandom = randomNum.nextInt(6)+1;

            //takes the random number for generated for each number of the user input and displays it.
            System.out.print(dieRandom);
            //spaces out the dice rolls.
            System.out.print(" ");
            
        }

  
    
        userInput.close();
        userName.close();


    }  


    
}
