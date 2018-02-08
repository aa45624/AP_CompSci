package com.rchs;

import static java.lang.System.*;
import java.util.*;

public class DecreasingWordAvinash
{
    public static String word ;
    public String enterWord()
    {
        Scanner reader = new Scanner(System.in);
        word = reader.next();
        return word;
    }

    public void decreaseWord(String word)
    {
        int lenght = word.length();
        for(int i = -1; i <= word.length(); i++)
        {
            word = word.substring(0, word.length()-1);
            System.out.println(word);
        }
    }

    public static void main ( String[] args )
    {
        DecreasingWordAvinash test = new DecreasingWordAvinash();
        test.enterWord();
        test.decreaseWord(word);
    }
}