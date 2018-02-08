package com.rchs;

import java.util.Scanner;

public class WhileLoopEx
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number  ::");
        int num = sc.nextInt();
        int sum = 0;
        int ans = 0;
        if(num<9)
        {
            System.out.println("The sum of the digits is " + num);
        }
        if(num == 10)
        {
            System.out.println("The sum of the digits is 1");
        }
        if(num>10)
        {
            while(num>0) {
                sum = sum + num % 10;
                num = num / 10;
                ans = sum + num;
            }
            System.out.println("The sum of the digits is " + ans);
        }

    }

}


