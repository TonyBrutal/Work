import java.util.Random;
import java.util.Scanner;

public class rockpaperscissors
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String computerChoice;

        System.out.print("Enter Rock/Paper/Scissors: ");

        String userChoice = input.nextLine();

        int randomValue = (int)(3*Math.random()); //casting to integer, values between 0 and 3 but not including 3.

        if(randomValue == 0)
        {
            computerChoice = "rock";
        }
        else if(randomValue == 1)
        {
            computerChoice = "paper";
        }
        else
        {
            computerChoice = "scissors";
        }

        //compare and print result.

        if(userChoice.equals("scissors") && computerChoice.equals("paper"))
        {
            System.out.println("You Win!");
        }
        else if(userChoice.equals("paper") && computerChoice.equals("rock"))
        {
            System.out.println("You Win!");
        }
        else if(userChoice.equals("rock") && computerChoice.equals("scissors"))
        {
            System.out.println("You Win!");
        }

        //tie
        else if(userChoice.equals(computerChoice))
        {
            System.out.println("It's a Tie!");
        }
        else
        {
            System.out.println("Computer Wins! You Lose!");
        }

        //displays computers choice.
        System.out.println("Computer: " + computerChoice);

        //closes the input function.
        input.close();

    }
}
