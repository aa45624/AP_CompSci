package com.rchs.com.rchs.pong;



import javax.swing.*;
import java.awt.*;
//import java.util.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.TimerTask;

import static java.lang.Math.abs;

public class PongPanel extends Component implements ActionListener, KeyListener {
    private int x=50;
    private int y=50;
    private int paddle1Y = 100;
    private int paddle2Y = 100;
    private int paddle1X = 45;
    private int paddle2X = 950;
    private int paddle1Dir= 0;
    private int paddle2Dir= 0;
    private int paddleSpeed= 3;
    private int xVelocity = 3;
    private int yVelocity = 3;
    private int size = 5;

    public PongPanel() {
/*        Timer t=new Timer("animation");
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                repaint();
            }
        }, 0, (int)(1000/60.0));*/
        setFocusable(true);
        addKeyListener(this);


        Timer time = new Timer(10, this);
        time.start();
    }

    public void MathRandom()
    {
        int r1 = (int) (Math.random()*15);


        int r2 = (int) (Math.random()*15);

    }



    public void paint(Graphics pc){
        // Perform frame calculations
        paddle1Y+=paddle1Dir*paddleSpeed;
        paddle2Y+=paddle2Dir*paddleSpeed;

        pc.setColor(Color.BLACK);
        pc.fillRect(0, 0, getWidth(), getHeight());

        pc.setColor(Color.WHITE);
        pc.fillRect(paddle1X, paddle1Y, 20, 175);

        pc.setColor(Color.WHITE);
        pc.fillRect(paddle2X, paddle2Y, 20, 175);

        pc.setColor(Color.YELLOW);
        pc.fillOval(x,y,25,25);

        //MathRandom();

    }

    public void actionPerformed(ActionEvent e) {



        if( y+25 > this.getHeight()) {
            yVelocity =  -yVelocity;
            //y+=yVelocity;
        }
        if( y < 0) {
            yVelocity =  -yVelocity;
            //y+=yVelocity;
        }
        if( x+25 > this.getWidth()) {
            xVelocity =  -xVelocity;
            //y+=yVelocity;
        }
        if( x < 0) {
            xVelocity = -xVelocity;
            //y+=yVelocity;
        }

//        if (y == paddle2Y )
//        {
//            yVelocity = -yVelocity;
//
//        }









        x+=xVelocity;
        y+=yVelocity;




        repaint();
    }

    public void keyPressed(KeyEvent e){
        // Up arrow
        if(e.getKeyCode() == 38){


            paddle2Dir=-1;
        }
        // Down arrow
        if(e.getKeyCode() == 40){

            paddle2Dir=1;
            //System.out.println("Down");

        }
        // W
        if(e.getKeyCode() == 87){


            paddle1Dir=-1;
        }
        // S
        if(e.getKeyCode() == 83){

            paddle1Dir=1;
            //System.out.println("Down");

        }

    }

    public void keyReleased(KeyEvent e)
    {
        // Up arrow
        if(e.getKeyCode() == 38){


            paddle2Dir=0;
        }
        // Down arrow
        if(e.getKeyCode() == 40){

            paddle2Dir=0;
            //System.out.println("Down");

        }
        // W
        if(e.getKeyCode() == 87){


            paddle1Dir=0;
        }
        // S
        if(e.getKeyCode() == 83){

            paddle1Dir=0;
            //System.out.println("Down");

        }
    }

    public void keyTyped(KeyEvent e)
    {

    }
}
