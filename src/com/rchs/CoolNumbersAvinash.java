package com.rchs;

import static java.lang.System.*;
import java.util.Scanner;

public class CoolNumbersAvinash
{
    int numbNumbers = 0;

    public int isCoolNumbers(int x)
    {
        for(int works = 6; works <= x; works++)
        {
            if((works%3) == 1 && (works%4) == 1 && (works%5) == 1 && (works%6) == 1)
            {
                numbNumbers++;
            }
        }
        return numbNumbers;
    }
    public static void main (String[]args)
    {
        Scanner kb = new Scanner(System.in);
        CoolNumbersAvinash coolNumbs = new CoolNumbersAvinash();
        System.out.print("Enter Number : ");
        int userChoice = kb.nextInt();
        int cool = coolNumbs.isCoolNumbers(userChoice);
        System.out.println("There are " + cool + " cool numbers between 6 -" + userChoice);
    }
}
