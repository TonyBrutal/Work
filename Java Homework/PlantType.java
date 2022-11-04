enum Plants{TREE, FLOWER, CACTUS, HERBS, SHRUBS, CREEPERS}

enum Color{RED, BLUE, SILVER, WHITE, BLACK, PURPLE, GREEN, BROWN}

public class PlantType 
{
   
        //characteristics - instance fields/instance variables
        public double size;
        public String name;
        public boolean isTree = false;
    
        //instance variables/fields
        private Color color;
        //getter
        public Color getColor()
        {return color;}
        public void setColor(Color newColor)
        {this.color = newColor;}


        //instance variables/fields
        private Plants plantName;
        //getter
        public Plants getName()
        {return plantName;}
        //setter
        public void setName(Plants newPlants)
        {this.plantName = newPlants;}
    ////////////////////////////////////////////////////
    private double plantSize;
    //getters (accessor to get the value)
    public double getSize()
    {return plantSize;}

    //setter (mutator of value) //change the value
    public void setSize(double newSize)
    {
        if(newSize >= newSize)
        {plantSize = newSize;}
    }
    ////////////////////////////////////////////////////
        


}
