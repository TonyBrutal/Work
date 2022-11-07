public class Die {
    int value;

    public void Roll()
    {
        value = (int)(Math.random()*6)+1;
    }

}
