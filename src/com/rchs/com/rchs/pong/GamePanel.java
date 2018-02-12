package com.rchs.com.rchs.pong;




import javax.swing.*;
import java.awt.*;
//import java.util.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.TimerTask;



public class GamePanel extends Component implements ActionListener, KeyListener {
    private int x=Pong.WINDOW_WIDTH / 2;
    private int y=Pong.WINDOW_HEIGHT / 2;
    private int paddle1Y = 100;
    private int paddle2Y = 100;
    private int paddleWidth = 20;
    private int paddleHeight = 175;
    private int paddle1X = 50;
    private int paddle2X = 925;
    private int paddle1Dir= 0;
    private int paddle2Dir= 0;
    private int paddleSpeed= 5;
    private int xVelocity = 3;
    private int yVelocity = 3;
    private int player1score = 0;
    private int player2score = 0;
    private boolean collied = false;
    public boolean leftTop = false;
    public boolean leftBottom = false;
    public boolean rightTop = false;
    public boolean rightBottom = false;


    public GamePanel() {

        setFocusable(true);
        addKeyListener(this);


        Timer time = new Timer(10, this);
        time.start();
    }




    public void paint(Graphics pc){

        //player1score = 0; player2score = 0;

        paddle1Y+=paddle1Dir*paddleSpeed;
        paddle2Y+=paddle2Dir*paddleSpeed;

        pc.setColor(Color.BLACK);
        pc.fillRect(0, 0, getWidth(), getHeight());

        pc.setColor(Color.RED);
        pc.fillRect(paddle1X, paddle1Y, 20, 175);

        pc.setColor(Color.GREEN);
        pc.fillRect(paddle2X, paddle2Y, 20, 175);


        pc.setColor(Color.YELLOW);
//        BlinkeyBall(pc);
        if(player2score >= 10 || player1score >=10)
        {

            pc.setColor(Color.WHITE);
            pc.drawString("GameOver " ,100, 100);
        }
        else
            pc.fillOval(x,y,25,25);

        pc.setColor(Color.WHITE);
        pc.drawLine(Pong.WINDOW_WIDTH / 2, 50, Pong.WINDOW_WIDTH / 2, Pong.WINDOW_HEIGHT);

        pc.setColor(Color.WHITE);
        pc.drawOval((Pong.WINDOW_WIDTH / 2) - 150, Pong.WINDOW_HEIGHT / 2 - 150, 300, 300);

        pc.setColor(Color.WHITE);
        pc.drawLine(960, 50, 960,Pong.WINDOW_HEIGHT);

        pc.setColor(Color.WHITE);
        pc.drawLine(40, 50, 40,Pong.WINDOW_HEIGHT);

        pc.setColor(Color.WHITE);
        pc.drawLine(0,50,Pong.WINDOW_WIDTH,50);

        pc.setColor(Color.YELLOW);
        pc.drawString("PLAYER 1 SCORE: " + player1score, 35, 35);

        pc.setColor(Color.YELLOW);
        pc.drawString("PLAYER 2 SCORE: " + player2score, 850, 35);



    }

//    private void BlinkeyBall(Graphics pc) {
//
//        if(x%10==0&&y%10==0)
//        {
//            pc.setColor(Color.WHITE);
//        }
//
//
//    }

    public void actionPerformed(ActionEvent e) {


        if( y+25 > this.getHeight()) {
            yVelocity =  -Math.abs(yVelocity);
            //y+=yVelocity;
        }
        if( y < 50) {
            yVelocity =  Math.abs(yVelocity);
            //y+=yVelocity;
        }
        if( x+25 > this.getWidth() && this.getWidth() > 0) {

            x = Pong.WINDOW_WIDTH/2;
            y=Pong.WINDOW_HEIGHT/2;
            player1score++;

        }
        if( x < 0) {
            x = Pong.WINDOW_WIDTH/2;
            y=Pong.WINDOW_HEIGHT/2;
            player2score++;

        }

        if (paddle1Y <=50){
            leftTop = true;
        }
        else
        {
            leftTop = false;
        }

        if (paddle1Y >= Pong.WINDOW_HEIGHT){
            leftBottom = true;
        }
        else
        {
            leftBottom = false;
        }

        if (paddle2Y <=50){
            rightTop = true;
        }
        else
        {
            rightTop = false;
        }

        if (paddle2Y >=Pong.WINDOW_HEIGHT){
            rightBottom = true;
        }
        else
        {
            rightBottom = false;
        }


        if((x >= paddle1X&&x<=paddle1X+paddleWidth)&&(y>=paddle1Y&&y<=paddle1Y+paddleHeight)){

            xVelocity=-xVelocity;
            collied= true;


        }

        if((x >= paddle2X-25&&x<=paddle2X+paddleWidth-25)&&(y>=paddle2Y&&y<=paddle2Y+paddleHeight)){
            xVelocity=-xVelocity;
            collied = true;

        }

        if (collied)
        {
            if(xVelocity>0 && yVelocity>0)
            {
                xVelocity++;
                yVelocity++;
            }
            if(xVelocity<0 && yVelocity<0)
            {
                xVelocity--;
                yVelocity--;
            }
            collied=false;
        }

        if(xVelocity>=8 && yVelocity>=8)
        {
            xVelocity=8;
            yVelocity=8;
        }


//        if(paddle1Y <= 50)
//        {
//            paddle1Dir=1;
//        }
//        if(paddle1Y>=320)
//        {
//            paddle1Dir=-1;
//        }
//
//        if(paddle2Y <= 50)
//        {
//            paddle2Dir=1;
//        }
//        if(paddle2Y>=320)
//        {
//            paddle2Dir=-1;
//        }




        x+=xVelocity;
        y+=yVelocity;

        repaint();
    }




    public void keyPressed(KeyEvent e){

        keyMethods(e);

    }

    private void keyMethods(KeyEvent e) {
       //Up arrow
        if(e.getKeyCode() == 38 && !rightTop){


            paddle2Dir=-1;
        }
        // Down arrow
        if(e.getKeyCode() == 40 && !rightBottom){

            paddle2Dir=1;
            //System.out.println("Down");

        }
        // W
        if(e.getKeyCode() == 87 && !leftTop){


            paddle1Dir=-1;
        }
        // S
        if(e.getKeyCode() == 83 && !leftBottom){

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