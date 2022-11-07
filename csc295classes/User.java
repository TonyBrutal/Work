public class User 
{
    //attributes
    public String username;
    public int passwordHash;

    //methods
    //setpassword
    public void setPassword(String newPassword) //void when code does something but doesn't need to return anything.
    {
        passwordHash = newPassword.hashCode();
    }
    //login
    public boolean login(String username, String password)
    {
        /* 
        if(username.equals(this.username) && passwordHash == password.hashCode())
        {
            return true;
        }
        else
        {
            return false;
        }
        */
        return username.equals(this.username) && passwordHash == password.hashCode(); //replaces the code above with one line.
    }
    //changepassword


}

