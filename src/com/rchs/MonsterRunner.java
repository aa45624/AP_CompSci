package com.rchs;
//Arjun  Avinash

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
    public static void main( String args[] )
    {
        Scanner keyboard = new Scanner(System.in);
        String name = "";
        int size;

        System.out.println("What is the Monster's name?");
        name = keyboard.next();
        System.out.println("What is this Monster's size?");
        size = keyboard.nextInt();

        Monster first = new Skeleton(name, size);

        System.out.println("What is the 2 Monster's name?");
        name = keyboard.next();
        System.out.println("What is this Monster's size?");
        size = keyboard.nextInt();

        Monster second = new Skeleton(name, size);

        System.out.println("What is the 2 Monster's name?");
        name = keyboard.next();
        System.out.println("What is this Monster's size?");
        size = keyboard.nextInt();

        Monster third = new Skeleton(name, size);

        if(first.isBigger(second) == true)
        {
            System.out.println("Monster is bigger than 2");
        }

        if(first.isSmaller(second) == true)
        {
            System.out.println("Monster is smaller than 2");
        }

        if(first.namesTheSame(second) == true)
        {
            System.out.println("Monster has same name");
        }

    }
}
