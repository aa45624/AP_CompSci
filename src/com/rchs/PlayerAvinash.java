package com.rchs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PlayerAvinash implements ActionListener {
    public int player = 0; //Creates the player variable
    JFrame frame = new JFrame("Rock Paper Scissors"); //Creates the actual frame where the game will be played
    JFrame exitf = new JFrame ("Thanks for Playing");
    JButton b1 = new JButton(); //Creates the Rock Button
    JButton b2 = new JButton(); //Creates the Paper Button
    JButton b3 = new JButton(); //Creates the Scissors Button
    JButton b4 = new JButton(); //Creates the Stats Button
    JButton b5 = new JButton();
    JPanel panel = new JPanel(); //Creates a panel so you can add text to a frame
    int computer = 0; //Creates the computer variable
    String computerPick; //Creates the computerPick variable
    String userPicked; //Creates the userPicked variable
    JLabel label; //Creates a label to add text
    JLabel win = new JLabel(); //Makes a new JLabel
    JLabel userPick = new JLabel(); //Makes a new JLabel
    JLabel userPick1 = new JLabel(); //Makes a new JLabel
    JLabel userPick2 = new JLabel(); //Makes a new JLabel
    JPanel exitp = new JPanel(); //Makes a new panel
    JLabel exitl = new JLabel(); //Makes a new label
    int games; //Makes a new instance variable (For stats)
    int wins; //Makes a new instance variable (For stats)
    int losses; //Makes a new instance variable (For stats)
    int ties; //Makes a new instance variable (For stats)
    private String name; //Creates a name variable



    public void introductionPanel(){ // give the instruction to the game
        String text= "How to play:\n -Rock beats Scissors\n -Scissors beats Paper\n -Paper beats Rock " +
                "\n Have fun, and Good Luck!";
        JOptionPane.showMessageDialog(null,text, "How to play!", 0);
    }


    public void setName() //Creates a frame where you can input a value for "name"

    {
        name = JOptionPane.showInputDialog("Please enter your name::");
    }


    public void gamePlayPanel() //Code for the main panel itself
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Stops the runner when you close out of the Jframe
        frame.setSize(1000, 275); //Sets size of the Jframe
        frame.setBackground(Color.BLUE); //Sets background color of Jframe
        frame.setResizable(false); //Disables fullscreen for the frame, you cannot change the length and width
        label = new JLabel("<html> &nbsp;&nbsp;&nbsp;Hi " + name + ". Please click on a button below:" +
                "<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Choose Rock, Paper or Scissors" +
                "<br> Click 'stats' to view the statistics of the game"); //The text that will appear on the Jframe
        label.setFont(new Font("Baskerville", Font.BOLD, 35)); //Sets the size and font of text
        label.setForeground(Color.WHITE); //Sets color of text
        panel.add(win);   //Adds the JLabels to the panel();
        panel.add(userPick);
        panel.add(userPick1);
        panel.add(userPick2);
        panel.add(label);


        button(); //Calls the button method

        frame.add(panel);   //Adds everything added to the panel to the frame
        frame.setVisible(true); //Allows the buttons & text to be visible


    }


    public void button() { //Sets the text, size, and action command for each button

        b1.setText("Rock");
        b1.setPreferredSize(new Dimension(475, 30));
        b1.addActionListener((ActionListener) this);
        b1.setActionCommand("Rock");
        b2.setText("Paper");
        b2.setPreferredSize(new Dimension(475, 30));
        b2.addActionListener((ActionListener) this);
        b2.setActionCommand("Paper");
        b3.setText("Scissors");
        b3.setPreferredSize(new Dimension(475, 30));
        b3.addActionListener((ActionListener) this);
        b3.setActionCommand("Scissors");
        b4.setText("Stats");
        b4.setPreferredSize(new Dimension(475, 30));
        b4.addActionListener((ActionListener) this);
        b4.setActionCommand("Stats");
        b5.setText("Quit");
        b5.setPreferredSize(new Dimension(475, 30));
        b5.addActionListener((ActionListener) this);
        b5.setActionCommand("Quit");


        panel.add(b1); //Adds the buttons to the panel (Which will get added to the frame)
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);


    }

    public void actionPerformed(ActionEvent e) {    //Sets the action for each button

        userPick.setVisible(false); //Hides the JLabels
        userPick1.setVisible(false);
        userPick2.setVisible(false);
        Object game = e.getActionCommand();

        if (game.equals("Rock")) {
            player = 1; //Changes value for player (from null)
            userPicked = "Rock"; //Changes the value for userPick (from null)

            mathRandom();   //Calls the mathRandom Method

            frame.setSize(1000, 200); //changes size of frame
            userPick.setText(name + " Picked " + userPicked + " while" +
                    " Computer picked " + computerPick + "!"); //Sets the text
            userPick.setFont(new Font("Courier New", Font.BOLD, 30)); //Sets the font, and font size
            userPick.setForeground(Color.WHITE); //Sets the text color
            userPick.setVisible(true); //Makes the label appear

            winner(); //Calls the winner method

            win.setVisible(true); //Allows the win label to appear
            label.setVisible(false); //Does not win label to appear



        } else if (game.equals("Paper")) {
            player = 2; //Changes value for player (from null)
            userPicked = "Paper";  //Changes the value for userPick (from null)

            mathRandom(); //Calls the mathRandom Method

            frame.setSize(1000, 200); //changes size of frame
            userPick1.setText(name + " Picked " + userPicked + " while" +
                    " Computer picked " + computerPick + "!"); //Sets the text
            userPick1.setFont(new Font("Courier New", Font.BOLD, 30)); //Sets the font, and font size
            userPick1.setForeground(Color.WHITE); //Sets the text color
            userPick1.setVisible(true); //Makes the label appear

            winner(); //Calls the winner method

            label.setVisible(false); //Allows the win label to appear
            win.setVisible(true); //Does not win label to appear


        } else if (game.equals("Scissors")) {
            player = 3; //Changes value for player (from null)
            userPicked = "Scissors"; //Changes the value for userPick (from null)

            mathRandom(); //Calls the mathRandom Method

            frame.setSize(1000, 200);
            userPick2.setText(name + " Picked " + userPicked + " while" +
                    " Computer picked " + computerPick + "!"); //Sets the text
            userPick2.setFont(new Font("Courier New", Font.BOLD, 30)); //Sets the font, and font size
            userPick2.setForeground(Color.WHITE); //Sets the text color
            userPick2.setVisible(true); //Makes the label appear

            winner(); //Calls the winner method

            label.setVisible(false); //Allows the win label to appear
            win.setVisible(true); //Does not win label to appear


        } else if (game.equals("Stats")) {
            label.setVisible(false);    //hides all the Jlabels
            userPick.setVisible(false);
            userPick2.setVisible(false);
            userPick1.setVisible(false);
            win.setVisible(false);
            frame.setSize(650, 200); //Changes the JFrame size

            JOptionPane.showMessageDialog(null,
                    "<html> You have won " + wins + " games" +
                            "<br> You have Lost " + losses + " games" +
                            "<br> You have tied " + ties + " games" +
                            "<br> You have played " + games + " games"); //Creates a JOptionPane, when you click the stats button

        } else if (game.equals("Quit")){
            exitf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Makes the Program stop when the JFrame is closed
            exitf.setSize(500, 300); //Sets the size of the new JFrame
            exitf.setBackground( new Color(73, 176, 255) ); //Sets the background color of the new JFrame
            exitf.setResizable(false); //You cannot resize the frame anymore
            exitl.setText("<html> Thanks for playing!");
            exitl.setFont(new Font("Times New Roman", Font.BOLD, 50)); //Sets the size and font of text
            exitl.setForeground(Color.BLUE); //Sets color of text
            frame.dispose(); //Closes the original frame when button is clicked

            exitp.add(new JLabel(new ImageIcon(getClass().getResource("java.jpg")))); //Adds images to the frame

            exitp.add(new JLabel(new ImageIcon(getClass().getResource("java2.jpg"))));

            exitp.add(exitl); //Puts everything on the frame
            exitf.add(exitp);

            exitp.setVisible(true); //Allows everything to appear
            exitl.setVisible(true);
            exitf.setVisible(true);
        }

    }

    public void mathRandom() {  //Allows the computer to choose a random number (1 for rock 2 for paper and 3 for scissors)
        double x;
        x = Math.random();


        double R = 1.0 / 3;

        double P = 2.0 / 3;

        if (x <= R) {
            computer = 1;
            computerPick = "Rock";
        } else if (x > R && x <= P) {
            computer = 2;
            computerPick = "Paper";
        } else {
            computer = 3;
            computerPick = "Scissors";
        }


    }

    public void winner() { //Finds the winner of the game
        //1 = Rock
        //2 = Paper
        //3 = Scissors

        if (computer == 1 && player == 2) {
            wins++;
            games++;
            win.setText(name + " Wins!" + " Good Job, Pick Again!");
            win.setFont(new Font("Courier New", Font.BOLD, 20));
            win.setForeground(Color.WHITE);
            frame.setBackground(Color.RED); //Changes the background color and the text color
            userPick.setForeground(Color.WHITE);
            userPick1.setForeground(Color.WHITE);
            userPick2.setForeground(Color.WHITE);

        }
        if (computer == 1 && player == 3) {
            games++;
            losses++;
            win.setText(" Computer Wins!" + " Pick Again Loser!");
            win.setFont(new Font("Courier New", Font.BOLD, 20));
            win.setForeground(Color.GREEN);
            frame.setBackground(Color.MAGENTA); //Changes the background color and the text color
            userPick.setForeground(Color.GREEN);
            userPick1.setForeground(Color.GREEN);
            userPick2.setForeground(Color.GREEN);


        }
        if (computer == 1 && player == 1) {
            games++;
            ties++;
            win.setText(" Its a Tie!" + " Pick Again!");
            win.setFont(new Font("Courier New", Font.BOLD, 20));
            win.setForeground(Color.BLUE);
            frame.setBackground(Color.ORANGE); //Changes the background color and the text color
            userPick.setForeground(Color.BLUE);
            userPick1.setForeground(Color.BLUE);
            userPick2.setForeground(Color.BLUE);

        }
        if (computer == 2 && player == 2) {
            games++;
            ties++;
            win.setText(" Its a Tie!" + " Pick Again!");
            win.setFont(new Font("Courier New", Font.BOLD, 20));
            win.setForeground(Color.BLACK);
            frame.setBackground(Color.YELLOW); //Changes the background color and the text color
            userPick.setForeground(Color.BLACK);
            userPick1.setForeground(Color.BLACK);
            userPick2.setForeground(Color.BLACK);

        }
        if (computer == 2 && player == 3) {
            wins++;
            games++;
            win.setText(name + " Wins!" + " Good Job, Pick Again!");
            win.setFont(new Font("Courier New", Font.BOLD, 20));
            win.setForeground(Color.RED);
            frame.setBackground(Color.CYAN); //Changes the background color and the text color
            userPick.setForeground(Color.RED);
            userPick1.setForeground(Color.RED);
            userPick2.setForeground(Color.RED);

        }
        if (computer == 2 && player == 1) {
            games++;
            losses++;
            win.setText("  Computer Wins!" + " Pick Again Loser!");
            win.setFont(new Font("Courier New", Font.BOLD, 20));
            win.setForeground(Color.WHITE);
            frame.setBackground(new Color (0,191,255)); //Changes the background color and the text color
            userPick.setForeground(Color.WHITE);
            userPick1.setForeground(Color.WHITE);
            userPick2.setForeground(Color.WHITE);

        }
        if (computer == 3 && player == 2) {
            games++;
            losses++;
            win.setText(" Computer Wins!" + " Pick Again Loser!");
            win.setFont(new Font("Courier New", Font.BOLD, 20));
            win.setForeground(Color.WHITE);
            frame.setBackground(new Color(255,105,180)); //Changes the background color and the text color
            userPick.setForeground(Color.WHITE);
            userPick1.setForeground(Color.WHITE);
            userPick2.setForeground(Color.WHITE);


        }
        if (computer == 3 && player == 3) {
            games++;
            ties++;
            win.setText(" It's a tie!" + " Pick Again!");
            win.setFont(new Font("Courier New", Font.BOLD, 20));
            win.setForeground(Color.WHITE);
            frame.setBackground( new Color(153, 51, 255) ); //Changes the background color and the text color
            userPick.setForeground(Color.WHITE);
            userPick1.setForeground(Color.WHITE);
            userPick2.setForeground(Color.WHITE);


        }

        if (computer == 3 && player == 1) {
            wins++;
            games++;
            win.setText(name + " Wins!" + " Good Job, Pick Again!");
            win.setFont(new Font("Courier New", Font.BOLD, 20));
            win.setForeground(Color.WHITE);
            frame.setBackground(Color.BLACK); //Sets background color of Jframe
            userPick.setForeground(Color.WHITE); //Changes the background color and the text color
            userPick1.setForeground(Color.WHITE);
            userPick2.setForeground(Color.WHITE);
        }


    }


}

