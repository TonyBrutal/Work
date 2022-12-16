/**
 * This is a coding challenge to practice and understand how to compare arrays and if the
 * items in the arrays are the same or not. Even if the only difference is a changed letter
 * it will display that they are not the same.
 */
public class Main 
{
    public static void main(String[] args) 
    {   
        String[] nemoArray = {"Nemo, Marlin, Bruce, Krush"};
        String[] nemoArray2 = {"Dory, Marlin, Hank, Fred"};
        String[] nemoArray3 = {"Nemo, Marlin, Bruce, Krush"};
        String[] nemoArray4 = {"Dory, Marlin, Hank, Fred"};


        //here we call the method 'equals' and fill in what arrays we want to compare.
        //these two arrays entered, replace the a and b for the method 'equals'.
        if(equals(nemoArray, nemoArray3))
        {
            //if the compared arrays are the same, display this.
            System.out.println("They are the same");
        }
        else
        {
            //if the arrays are not the same, display this.
            System.out.println("They are not the same");
        }


    }

    //create a method to use, because we will be calling this method to be used with variables that are specified
    //later on, we can use anything we want as variables because they are only in the scope of this method, which
    //will be replaced when called from another function. 

    //We are looking for a boolean of true or false, so we create a method and insert the two types we want two
    //compare.
    public static boolean equals(String[] a, String [] b)
        {
            //if they are not the same length it will return false, that they are not the same.
            if(a.length != b.length)
                return false;
            //for loop that continually adds 1 to 'int i = 0', then within the for loop it continually adds
            //1 to i and compares the two arrays. until i is no longer less than a.length. 
            //once i is no longer than a.length it will compare the two arrays and if they are not equal
            //it will display false.    
            for(int i = 0; i < a.length; i++)
            {
                if(a[i] != b[i])
                return false;
            }
            //if the for loop does show the two arrays are equal length it will return true that they are equal.
            return true;
        }       
}