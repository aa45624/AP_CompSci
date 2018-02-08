package com.rchs;//� A+ Computer Science  -  www.apluscompsci.com
//Name - Arjun Avinash
//Date - 09/5/17
//Class - AP Computer Science
//Lab  - OOP/Return

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHourAvinash
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHourAvinash()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHourAvinash(int dist, int hrs, int mins)
	{
		setNums(dist, hrs, mins);

	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;

	}

	public void calcMPH()
	{

		double hoursInDouble = (double) minutes/60 + hours;
			mph =distance/hoursInDouble;

	}

	public void print()
	{

			System.out.println(distance + " miles in " + hours + " hour and " + minutes + " minutes = "+mph+ "MPH");
	}
}