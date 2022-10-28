import java.util.Scanner;

public class nameinput 
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
    
        //closes the input function
        userName.close();
    }
}
