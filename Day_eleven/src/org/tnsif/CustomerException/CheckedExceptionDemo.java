package org.tnsif.CustomerException;
//program to demonstrate on checked exception
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try
		{
			FileInputStream f=new FileInputStream ("C:\\Users\\tasne\\OneDrive\\Documents");
			System.out.println("file has found");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File is not exist:"+e);
		}

	}

}
