package com.rchs;//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunnerAvinash
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		MilesPerHourAvinash test = new MilesPerHourAvinash(dist, hrs, mins);
		test.calcMPH();
		test.print();
		
		//add more test cases
		
		
	}
}