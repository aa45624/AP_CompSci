package com.rchs.com.rchs.pong;



import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Pong extends JFrame {
    public final static int WINDOW_WIDTH = 1000;
    public final static int WINDOW_HEIGHT = 500;

    public Pong()
    {
        GamePanel panel = new GamePanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        setBackground(Color.BLACK);
        setResizable(false);


        add(panel);

        setVisible(true);
    }


    public static void main( String args[] )
    {
        Pong pong = new Pong();

    }




}
