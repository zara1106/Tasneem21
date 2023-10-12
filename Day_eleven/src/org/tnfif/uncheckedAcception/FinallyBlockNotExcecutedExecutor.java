package org.tnfif.uncheckedAcception;
import java.util.Scanner;

public class FinallyBlockNotExcecutedExecutor {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		//try block contain exception code
		try
		{
			System.out.println(x/y);
			//when we use system.exit(0), then finally block doesnt executed
			System.out.println(0);
		}
		//catch block is use to handle Exception
		catch(Exception e)
		{
			System.out.println("Exeption handle"+e);
			//when we use system.exit(0), then finally block doesnt executed
			System.exit(0);
		}
		finally
		{
			System.out.println("Finally block is always executed");
		}

	}

}
