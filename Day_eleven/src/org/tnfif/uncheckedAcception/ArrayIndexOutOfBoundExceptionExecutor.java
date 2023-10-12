package org.tnfif.uncheckedAcception;
/* program is demonstrate on ArrayindextOutOfBoundException Executor*/
public class ArrayIndexOutOfBoundExceptionExecutor {

	static void print (int arr[])
	{
		try
		{
			System.out.println(arr[4]);
		}
		catch(Exception e)
		{
			System.out.println("Exception hadle"+e);
		}
		finally
		{
			System.out.println("Finally block is always excecuted");
		}
	}
	public static void main(String[] args) {
		int arr[]= {12,3,5};
		print(arr);
	}
}
