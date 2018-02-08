package com.rchs;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Card {

    private int suit, rank;

    private static final String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
    private static final String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

    public Card(int r, int s)
    {
        rank = r;
        suit = s;
    }

    public String toString()
    {
        return ranks[rank] + " of " + suits[suit];
    }

    public String getSuit()
    {
        return suits[suit];
    }

    public String getRank()
    {
        return ranks[rank];
    }




}





