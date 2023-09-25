package com.tnsif.Assignment01;

public class SteelBero extends Bero
{
	private int beroHeight;
	public SteelBero(String beroType, String beroColour, int beroHeight) {
		super(beroType, beroColour);
		this.beroHeight = beroHeight;
	}
	
	public int getBeroHeight() {
		return beroHeight;
	}
	public void setBeroHeight(int beroHeight) {
		this.beroHeight = beroHeight;
	}
	
	@Override
	public void calculatePrice() {
		if(beroHeight == 3)
		{
			price=5000;
		}
		if(beroHeight == 5)
		{
			price=8000;
		}
		if(beroHeight == 7)
		{
			price=10000;
		}	
	}
	
}