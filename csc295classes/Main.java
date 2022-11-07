import java.time.LocalDate;

import javax.swing.event.SwingPropertyChangeSupport;

public class Main 
{
    
    public static void main(String[] args) 
    {
        //Abstraction = public or private
        /* 
        basketballplayer michaelJordan = new basketballplayer();
        michaelJordan.name = "Michael Jordan";
        michaelJordan.height = 6.6;
        michaelJordan.weight = 216;
        michaelJordan.graduated = false;

        basketballplayer player2 = new basketballplayer();
        player2.name = "Charles Barkley";
        player2.height = 6.6;
        player2.weight = 250;
        player2.graduated = true;

        car tonyCar = new car();
        tonyCar.setColor(Color.RED);
        tonyCar.setMake(Make.AUDI);
        tonyCar.setMileage(100);
        System.out.println(tonyCar.getMileage());
        tonyCar.setManufactureDate(LocalDate.parse("2022-01-10"));
        */
/* 
    Die d = new Die();
    d.Roll();
    System.out.println(d.value);
*/

        car myCar = new car();
        myCar.setManufactureDate(LocalDate.parse("2016-01-01"));
        System.out.println("The Car is: " + myCar.getAge() + " Year(s) old.");

        happyPerson alice = new happyPerson();
        alice.name = "Alice";
        alice.howHappy = HAPPYSCALE.Gleeful;
        alice.sing(); //calling sing method from happyPerson method on an instance.
        alice.sing(5); //method overloading from happyPerson method on an instance

        happyPerson cynthia = new happyPerson();
        cynthia.name = "Cynthia";
        cynthia.howHappy = HAPPYSCALE.Meh;
        cynthia.sing();
        cynthia.sing(7);

        //Scope example:
        int x = 100;
        if(x>0)
        {
            int y = 300;
            System.out.println(y); //needs to be within the scope.
        }
        //System.out.println(y); //doesnt work outside the scope.
        System.out.println(x);

        for (int i = 0; i < 10; i++) 
        {
            System.out.println(i);   
        }


        User admin = new User(); //calls the 'User' class.
        admin.username = "admin";
        admin.setPassword("password123");
        System.out.println(admin.login("admin", "password123")); //displays if login credentials match with true or false.
    }
  
}

