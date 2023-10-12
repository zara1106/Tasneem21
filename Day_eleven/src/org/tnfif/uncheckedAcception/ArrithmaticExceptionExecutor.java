package org.tnfif.uncheckedAcception;
import java.util.Scanner;
//program is demonstrated on Arithmetic Exception
public class ArrithmaticExceptionExecutor {

		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter two values : ");
			int x=sc.nextInt();
			int y=sc.nextInt();
			/*try block contain exceptional code*/
			try 
			{
				System.out.println("ans="+x/y);
			}
			/*catch block is use to handle an exception*/
			catch(Exception e)
			{
				System.out.println("Exception handled "+e);
			}
			sc.close();
		}

	}
