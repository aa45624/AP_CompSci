package com.rchs;//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;


public class HistogramRunner
{
    int[] numCount;
	public HistogramRunner(String data)
	{
		checkNums(data);
	}

	public void checkNums(String data)
	{

		numCount = new int[10];

		Scanner cool = new Scanner (data);

		while(cool.hasNextInt())
		{
			int count = cool.nextInt();
            numCount[count]++;

		}
	}
	public String ans(String data)
	{
		String answer = "";
		for (int i= 0; i< 10; i++)
		{
			answer += i + " - " + numCount[i] + "\n";
		}
		return answer;
	}

	public static  void main (String [] args)
	{
		HistogramRunner test = new HistogramRunner("1 2 3 4 5 6 7 8 9");
		System.out.println(test);
	}

}