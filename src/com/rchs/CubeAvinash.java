package com.rchs;//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class CubeAvinash
{
	private int side;
	private int surfaceArea;

	public void setSide(int s)
	{
		side = s;
	}

	public void calculateSurfaceArea( )
	{
		surfaceArea = (side * side) * 6;
	}

	public void print( )
	{
		//The surface area is :: 75264
		System.out.println("The surface area is :: " + surfaceArea);

	}
}