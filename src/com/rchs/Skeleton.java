package com.rchs;

public class Skeleton implements Monster {

    private String name;
    private int howBig;


    public Skeleton()
    {
        name= "no name";
        howBig = 0;

    }

    public Skeleton(String n, int size)
    {
        name = n;
        howBig = size;

    }

    public  String getName()
    {
        return name;
    }

    public int getHowBig()
    {
        return howBig;
    }

    public boolean isSmaller(Monster other)
    {
        return howBig<other.getHowBig();
    }

    public boolean isBigger(Monster other)
    {
        return howBig>other.getHowBig();
    }

    public boolean namesTheSame(Monster other)
    {
        return name.equals(other.getName());
    }

    public String toString()
    {
        return name + " " + howBig;
    }
}
