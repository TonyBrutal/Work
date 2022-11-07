import java.time.LocalDate;
import java.time.Period;

enum Make{TESLA, TOYOTA, AUDI, HONDA, SUBARU, MCLAREN}

enum Color{RED, BLUE, SILVER, WHITE, BLACK, PURPLE, GREEN}

public class car
{
    //instance variables/fields
    private Color color;
    //getter
    //public Color getColor;
    public Color getColor()
    {return color;}
    public void setColor(Color newColor)
    {this.color = newColor;}

    private double mileage;
    //getters (accessor to get the value)
    public double getMileage()
    {return mileage;}

    //setter (mutator of value) //change the value
    public void setMileage(double newMileage)
    {
        if(newMileage >= newMileage)
        {mileage = newMileage;}
    }

    private Make make;

    public Make getMake()
    {return make;}

    public void setMake(Make newMake)
    {make = newMake;}

    private LocalDate manufactureDate;
    public LocalDate getManufactureDate()
    {return manufactureDate;}
    //setter (mutator of value) //change the value
    public void setManufactureDate(LocalDate newManufactureDate)
    {manufactureDate = newManufactureDate;}


    public int getAge()
    {
        return Period.between(manufactureDate, LocalDate.now()).getYears();
    }


}