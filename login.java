package User_Authentication;

import java.util.*;

public class login 
{
    Scanner sc = new Scanner(System.in);
    String username;
    int password;

    public void logedin()
    {
        signup sign_obj = new signup();
        sign_obj.getSignIn();

        System.out.println("            \n//Enter userName and password for --Login--// \n");

        System.out.print("                            Enter UserName : "+ "\t ");
        username = sc.nextLine();

        System.out.print("                            Enter password : "+ "\t ");
        password = sc.nextInt();

        if(password==sign_obj.confirm_Password && username.equals(sign_obj.name))
        {
            System.out.println("                   |Login Successfully| \n ");
        }
        // else if(password!=sign_obj.password || username.equals(sign_obj.name))
        else
        {
            System.out.println("                Invalid username and password");
        }

    }

    
}