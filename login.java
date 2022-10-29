package User_Authentication;

import java.util.*;

public class login 
{
    Scanner sc = new Scanner(System.in);
    String username;
    int password;
    int input;

    public void logedin()
    {
        signup sign_obj = new signup();
        sign_obj.getSignIn();

        System.out.println("            \n//Enter userName and password for --Login--// \n");

        do
        {
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
                System.out.print("Enter 1 to ReEnter username and password : "+"\t");
                input = sc.nextInt();
            }
            
        }
        while (input==1);


    }

    
}