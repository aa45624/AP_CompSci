package com.rchs;

import java.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class RockPaperScissorsAvinash
{
    public static void main(String[] args)
    {

        introductionPanel(); // launches Instruction GameGraphics
    }

    private static void introductionPanel() //Gives Instruction to Game
    {
        String text = " \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tRock, Paper, Scissors!  \n\nHow to play: \n\nSimply click any button you desire (Either Rock, Paper, or Scissors) \n-Rock beats Scissors \n-Scissors beat Paper \n-Paper beats Rock";
        JOptionPane.showMessageDialog(null, text, "How to play!", 0);
    }
}
