package com.rchs;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;

public class GraphicsRunnerAvinash extends JFrame
{
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public GraphicsRunnerAvinash()
    {
        super("Graphics Runner");

        setSize(WIDTH,HEIGHT);

        getContentPane().add(new SmileyFaceAvinash());

        //add other classes to run them
        //BigHouse, Robot, or ShapePanel

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main( String args[] )
    {
        GraphicsRunnerAvinash run = new GraphicsRunnerAvinash();
    }
}