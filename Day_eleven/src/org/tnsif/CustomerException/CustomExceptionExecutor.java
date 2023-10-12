package org.tnsif.CustomerException;
import java.util.Scanner;
//program to demonstrate on user define exception
//derive class
public class CustomExceptionExecutor {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter an email id and password");
	String email=sc.nextLine();
	String password=sc.nextLine();
	try
	{
		if(email.equals("skumbhalkar@tnf.org")&& password.equals("das123"))
		{
			System.out.println("redential matched");
		}
		else
		{
		throw new Logincredential("Invalid credential");
	    }
	}
		catch(Logincredential e)
	    {
		System.out.println(e);
	    }
	}
}
