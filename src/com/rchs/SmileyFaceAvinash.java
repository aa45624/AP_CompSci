package com.rchs;

//© A+ Computer Science  -  www.apluscompsci.com
//Name - Arjun Avinash
//Date - 08-29-17
//Class - Ap Comp Science
//Lab  - Graphics

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFaceAvinash extends Canvas
{
    public SmileyFaceAvinash()    //constructor - sets up the class
    {
        setSize(800,600);
        setBackground(Color.WHITE);
        setVisible(true);
    }

    public void paint( Graphics window )
    {
        smileyFace(window);
    }

    public void smileyFace( Graphics window )
    {
        window.setColor(Color.BLUE);
        window.drawString("SMILEY FACE LAB ", 35, 35);

        window.setColor(Color.YELLOW);
        window.fillOval( 210, 100, 400, 400 );



        window.setColor(Color.BLACK);
        window.fillOval( 300,200,50,50 );
        window.fillOval( 460, 200, 50, 50);
        window.setColor(Color.BLACK);
        window.fillOval(375, 300, 75,25);
        window.setColor(Color.RED);

        window.fillArc(350,325,100,100,180, 180);

        //add more code here


    }
}
