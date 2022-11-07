enum HAPPYSCALE{NotAtAll, ALittleBit, Meh, Hopeful, Excited, Gleeful, Exuberant}

public class happyPerson 
{
    //attributes
    public String name;
    public HAPPYSCALE howHappy;

    //actions/verbs/methods
    public void sing()
    {
        System.out.println(" My name is " + name + " and I feel " + howHappy);
    }

    public void sing(int count) //method overloading
    {
        if(count <= 0)
        {
            System.out.println("BOOM ... Fireworks!!!!");
        }
        else
        {
            System.out.println(count + " My name is " + name + " and I feel " + howHappy); //displays with a count on the side
            //System.out.println(" My name is " + name + " and I feel " + howHappy); //displays without the count number on the side.
            sing(count -1);
        }
    }

    public void smile()
    {

    }
}
