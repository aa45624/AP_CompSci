package com.rchs;

public class InstanceVars {

    private int one = 100, two = 3;   //instance variables / fields
    private int addAnswer = 0, subAnswer = 0;	//exist throughout the class

    public void add(){
        addAnswer = one + two;
    }

    public void subtract(){
        subAnswer = one - two;
    }

    public void print(){
        System.out.println(addAnswer);
        System.out.println(subAnswer);
    }

    public static void main(String args[])
    {
        InstanceVars test = new InstanceVars();
        test.add();
        test.subtract();
        test.print();


    }


}
