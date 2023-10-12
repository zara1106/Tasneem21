package org.tnsif.CustomerException;
//program to demonstrate the exception
public class Logincredential extends Exception{
	//private number 

	private String str;
	
    //getter and setter 	
	public String getStr() {
		return str;
	}


	public void setStr(String str) {
		this.str = str;
	}


	//Parameterised constructor
	public Logincredential(String str) {
		super();
		this.str = str;
	}


	@Override
	public String toString() {
		return "Logincredential [str=" + str + "]";
	}


	public static void main(String[] args) {
		

	}

	

}
