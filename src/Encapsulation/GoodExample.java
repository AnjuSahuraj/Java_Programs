package Encapsulation;

public class GoodExample
{
    public static void main(String[] args)
    {
        //Hidden
        vmlogin v=new vmlogin("admin","admin");
        boolean check=v.isloggedin("admin","admin");
        System.out.println(check);
        String s=v.getUsername();
        System.out.println("Username:" +s);
        //String p=v.getPassword();--->This is not possible since we have done encapsulation.This must be done for security.

    }
}

class vmlogin
{
    private String username;
    private String password;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public vmlogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
    boolean isloggedin(String username,String password)
    {
        if(this.username.toLowerCase().equals(username)&&this.password.toLowerCase().equals(password))
        {
            System.out.println("Logged In");
            return true;
        }
        else
        {
            System.out.println("Wrong credentials!!");
            return false;
        }
    }
}
