package com.rchs;//� A+ Computer Science  -  www.apluscompsci.com
//Name - Arjun Avinash
//Date - 09/11/17
//Class - AP Computer Science
//Lab  - String/Return

import static java.lang.System.*;

public class FirstAndLastAvinash
{
	private String word;

	public FirstAndLastAvinash(String s)
	{
		 word = s;
		System.out.println("Word :: "  + word);
	}

	public void setString(String s)
	{

	}

	public String getFirst()
	{
		return word.substring(0,1);
	}
	
	public String getLast()
	{
		int length = word.length();
		int start = length-1;
		//System.out.println(length);
		return word.substring(start,length);
	}

 	public String toString()
 	{
 		String output="";
 		return output;
	}
}