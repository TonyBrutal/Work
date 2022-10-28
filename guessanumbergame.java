import java.util.Scanner;

public class guessanumbergame 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int randomValue = 1 + (int)(100*Math.random()); //shifts starting number from 0 to 1 then gives numbers between 1 and 100.

        System.out.print("Guess a number: ");
        int userValue = input.nextInt();
    
        while(userValue != randomValue)
        {
            if(userValue < randomValue)
            {
                System.out.println("Too low.");
            }
            else
            {
                System.out.println("Too high.");
            }
    
            System.out.print("Guess a number: ");
            userValue = input.nextInt();
        
        }
    
        System.out.println("You Win! The number was: " + randomValue);
    
        input.close();
    }
        
}

