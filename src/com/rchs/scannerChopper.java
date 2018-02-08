package com.rchs;

import java.util.Scanner;

public class scannerChopper {
    public static void main (String [] args)
    {
        Scanner chopper = new Scanner("1 2 3 4");
        //int count = chopper.nextInt();

        int sum = 0;
        while(chopper.hasNextInt())
        {
            sum = sum + chopper.nextInt();
        }
        System.out.println("total == " + sum);
    }
}
