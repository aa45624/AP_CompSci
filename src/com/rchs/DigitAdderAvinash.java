//© A+ Computer Science  -  www.apluscompsci.com
//Name - Arjun Avinash
//Date - 10/23/17
//Class - AP Computer Science
//Lab  - Digit Adder

import java.util.Scanner;

public class DigitAdderAvinash
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number  ::");
        int num = sc.nextInt();
        int sum = 0;
        int ans = 0;
        int save = num;
        
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
            while(num>0) 
            {
                sum = sum + num % 10;
                num = num / 10;
                ans = sum + num;
            }
            System.out.println(ans +" is the sum of the digits of the number " + save);
        }

    }

}


