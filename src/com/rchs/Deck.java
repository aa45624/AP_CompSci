package com.rchs;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class Deck {

    private ArrayList<Card> cards;

    public Deck()
    {
        cards = new ArrayList<Card>();

        for(int s = 0; s <= 3; s++)
        {
            for(int r = 0; r <= 12; r++)
            {
                Card card = new Card(r, s);
                cards.add(card);
            }
        }

    }

    public void shuffle()
    {
        Collections.shuffle(cards);

    }

    public void printCards()
    {
        for(int i = 0; i<cards.size(); i++)
        {
            System.out.println(cards.get(i));
        }
    }

    public int getCardCount()
    {
        return cards.size();
    }

    public Card drawFromCard()
    {
        Random gen = new Random();
        int index = gen.nextInt(cards.size());
        Card card = cards.get(index);
        cards.remove(index);
        return card;
    }
    public Card drawFromCard2()
    {
        Random gen = new Random();
        int index = gen.nextInt(cards.size());
        Card card = cards.get(index);
        cards.remove(index);
        return card;
    }







}
