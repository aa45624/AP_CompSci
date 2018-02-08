package com.rchs;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
    private int xPos;
    private int yPos;
    private int width;
    private int height;

    private Color color;

    public Block()
    {
            xPos = 100;
            yPos = 150;
      		width = 10;
     		height = 10;
      		color = Color.BLACK;

    }

    public Block(int x, int y, int wid, int hei)
    {
        xPos = x;

        yPos = y;

        width = wid;

        height = hei;

        color = Color.BLACK;
    }

    public Block(int x, int y, int wid, int hei, Color col)
    {
        xPos = x;

        yPos = y;

        width = wid;

        height = hei;

        color = col;

    }



    public void setColor( Color col )
    {
        color = col;

    }

    public void setPos( int x, int y )
    {
        xPos = x;

        yPos = y;
    }

    public void setX( int x )
    {
        xPos = x;
    }

    public void setY( int y )
    {
        yPos = y;
    }

    public void setWidth(int wid)
    {
        width = wid;
    }

    public void setHeight(int hei)
    {
        height = hei;
    }



    public int getX()
    {
        return xPos;
    }

    public int getY()
    {
        return yPos;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public Color getColor()
    {
        return color;
    }


    public void draw(Graphics window, Color col)
    {
        window.setColor(col);
        window.fillRect(getX(), getY(), getWidth(), getHeight());

    }




    public boolean equals (Object obj)
    {
        Block s = (Block) obj;

        if( s.getX() != xPos)
        {
            return false;
        }

        else if(s.getY() != yPos)
        {
            return false;
        }

        else if(s.getWidth() != width)
        {
            return false;
        }

        else if(s.getHeight() != height)
        {
            return false;
        }

        else if(s.getColor() != color)
        {
            return false;
        }

        else
        {
            return true;
        }
    }

    public String toString()
    {
        return xPos + " " + yPos + " " + width + " " + height + " " + color;
    }

    //add a toString() method  - x , y , width, height, color
}



