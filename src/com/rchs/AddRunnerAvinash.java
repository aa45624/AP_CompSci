package com.rchs;//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -m
//Class -
//Lab  -

import java.util.Scanner;

import static java.lang.System.*;

public class AddRunnerAvinash
{
	public static void main ( String[] args )
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the first string ::");
		String a = kb.nextLine();
		System.out.println("Enter the second string ::");
		String b = kb.nextLine();
		AddStringsAvinash fa = new AddStringsAvinash(a, b);
		System.out.println("The final string is:");
		fa.add();


		//add more test cases		
	}
}