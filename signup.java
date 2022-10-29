package User_Authentication;

import java.util.*;

public class signup 
{
    Scanner sc = new Scanner(System.in);
    String name, gender, D_O_B;
    int age,  password, confirm_Password;
    int input;

    public void getSignIn()
    {
        do
        {
            System.out.println("            sign UP");

            System.out.print("    Name            : " + "\t ");
            name = sc.next();

            System.out.print("    Age             : "+ "\t ");
            age = sc.nextInt();

            System.out.print("    Date of Birth   : "+ "\t ");
            D_O_B = sc.next();

            System.out.print("    Gender\n(Male/Female/Others): "+ "\t ");
            gender = sc.next();

            System.out.print("    Password        : "+ "\t ");
            password = sc.nextInt();

            System.out.print("    Confirm Password: "+ "\t ");
            confirm_Password = sc.nextInt();
            if(password==confirm_Password)
            {
                System.out.println("               |successfully sign up| \n     ");
            }
            else
            {
                System.out.println("                Re Enter password \n     ");
            }	
            System.out.print("Enter 1 to Re Enter pasword : "+"\t");
            input = sc.nextInt();
        }
        while (input==1);

    }    
}