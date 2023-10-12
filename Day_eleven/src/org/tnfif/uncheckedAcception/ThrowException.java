package org.tnfif.uncheckedAcception;
import java.io.IOException;
//program to demonstrate on throw and throws keyword
public class ThrowException {
	//throws keyword is used to declare an exception
	static void isEligible (int age,int weight) throws IOException
	{
		if(age>18 && weight>50)
		{
			System.out.println("Eligible for blood donation");
		}
		else
		{
			throw new IOException("criteria is not fulfill");
		}
	}

	public static void main(String[] args) throws IOException 
	{
		isEligible(19,57);

	}

}
