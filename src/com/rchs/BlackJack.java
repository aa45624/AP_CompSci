package com.rchs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class BlackJack implements ActionListener {

    ArrayList<Card> player2Hand = new ArrayList<Card>();
    ArrayList<Card> player1Hand = new ArrayList<Card>();
    int dealerpoints;
    int playerpoints;
    JPanel panel = new JPanel(); //Makes a new panel
    JLabel label; //Makes a new label
    JFrame frame = new JFrame("Black Jack");
    JButton b1 = new JButton();
    JButton standButton = new JButton();
    JButton hit2Button = new JButton();
    JButton stand2Button = new JButton();
    JLabel textLabel = new JLabel();
    JOptionPane pane = new JOptionPane();
    JLabel cardLabel2 = new JLabel();
    JLabel cardLabel1 = new JLabel();
    private ArrayList<Card> cards;


    /**
     *
     */
    public BlackJack() {
        cards = new ArrayList<Card>();

        for (int s = 0; s <= 3; s++) {
            for (int r = 0; r <= 12; r++) {
                Card card = new Card(r, s);
                cards.add(card);
            }
        }

    }

    public void shuffle() {
        Collections.shuffle(cards);

    }

    public void printCards() {
        for (int i = 0; i < cards.size(); i++) {
            System.out.println(cards.get(i));
        }
    }

    public int getCardCount() {
        return cards.size();
    }

    public void setPlayer2Hand() {
        Random gen = new Random();
        int index = gen.nextInt(cards.size());
        Card card = cards.get(index);
        player2Hand.add(card);
        cards.remove(index);
        Random gen2 = new Random();
        int index2 = gen2.nextInt(cards.size());
        Card card2 = cards.get(index2);
        player2Hand.add(card2);
        cards.remove(index2);


    }

    public void setPlayer1Hand() {
        Random gen = new Random();
        int index = gen.nextInt(cards.size());
        Card card = cards.get(index);
        player1Hand.add(card);
        cards.remove(index);
        Random gen2 = new Random();
        int index2 = gen2.nextInt(cards.size());
        Card card2 = cards.get(index2);
        player1Hand.add(card2);
        cards.remove(index2);


    }

    public void printPlayer2Hand() {
        String cardLabelText = "<html>";
        for (int i = 0; i < player2Hand.size(); i++) {
            cardLabelText = cardLabelText + "<br>" + player2Hand.get(i).toString();

        }
        cardLabel2.setText(cardLabelText + "<br>" + " Player 2 has " + dealerpoints + " points " + "</html>");
    }

    public void printPlayer1Hand() {
        String cardLabelText = "<html>";
        for (int i = 0; i < player1Hand.size(); i++) {
            cardLabelText = cardLabelText + "<br>" + player1Hand.get(i).toString();


        }
        cardLabel1.setText(cardLabelText + "<br>" + " Player 1 has " + playerpoints + " points " + "</html>");
    }


    public void findPoints() {
        Card Player2FirstCard = player2Hand.get(0);
        Card Player2SecondCard = player2Hand.get(1);
        Card Player1FirstCard = player1Hand.get(0);
        Card Player1SecondCard = player1Hand.get(1);

        setPlayerPoints(Player2FirstCard);
        setPlayerPoints(Player2SecondCard);
        setPlayerPoints(Player1FirstCard);
        setPlayerPoints(Player1SecondCard);
    }

    private void setPlayerPoints(Card playerCard) {
        switch (playerCard.getRank()) {

            case "2":
                dealerpoints += 2;
                break;
            case "3":
                dealerpoints += 3;
                break;
            case "4":
                dealerpoints += 4;
                break;
            case "5":
                dealerpoints += 5;
                break;
            case "6":
                dealerpoints += 6;
                break;
            case "7":
                dealerpoints += 7;
                break;
            case "8":
                dealerpoints += 8;
                break;
            case "9":
                dealerpoints += 9;
                break;
            case "10":
                dealerpoints += 10;
                break;
            case "Jack":
                dealerpoints += 10;
                break;
            case "Queen":
                dealerpoints += 10;
                break;
            case "King":
                dealerpoints += 10;
                break;
            case "Ace":
                dealerpoints += 11;
                break;

        }
    }


    public void findWinner() {
        if (dealerpoints == 21 || playerpoints > 21) {

            setWinnerText("PLAYER 2 WON!!!");

        } else if (playerpoints == 21 || dealerpoints > 21) {

            setWinnerText("PLAYER 1 WON!!!");

        } else if (cards.size() == 0) {
            if (dealerpoints > playerpoints) {

                setWinnerText("PLAYER 2 WON!!!");

            }
            if (dealerpoints < playerpoints) {

                setWinnerText("PLAYER 1 WON!!!");

            }
        }

    }

    private void setWinnerText(String winnerText) {
        b1.setEnabled(false);
        stand2Button.setEnabled(false);
        standButton.setEnabled(false);
        hit2Button.setEnabled(false);
        cardLabel1.setVisible(false);
        cardLabel2.setVisible(false);
        String textLabelText = "<html>";
        for (int i = 0; i < player1Hand.size(); i++) {
            textLabelText = textLabelText + "<br>" + player1Hand.get(i).toString();
        }
        textLabelText = textLabelText + "<br>" + "Player 1 had " + playerpoints + " points " + "<br>";
        for (int i = 0; i < player2Hand.size(); i++) {
            textLabelText = textLabelText + "<br>" + player2Hand.get(i).toString();
        }
        textLabelText = textLabelText + "<br>" + "Player 2 had " + dealerpoints + " points " + "<br>";
        textLabel.setText(textLabelText + "<br>" + winnerText + "</html>");
        panel.add(textLabel);
        frame.revalidate();
    }


    public void gamePlayPanel() //Code for the main panel itself
    {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Makes the Program stop when the JFrame is closed
        frame.setSize(500, 300); //Sets the size of the new JFrame
        frame.setBackground(Color.WHITE); //Sets the background color of the new JFrame
        frame.setResizable(false); //You cannot resize the frame anymore

        b1.setText("Player 1's turn: Hit");
        b1.setPreferredSize(new Dimension(475, 30));
        b1.addActionListener((ActionListener) this);
        b1.setActionCommand("Player 1's turn: Hit");

        standButton.setText("Player 1's turn: Stand");
        standButton.setPreferredSize(new Dimension(475, 30));
        standButton.addActionListener((ActionListener) this);
        standButton.setActionCommand("Player 1's turn: Stand");

        stand2Button.setText("Player 2's turn: Stand");
        stand2Button.setPreferredSize(new Dimension(475, 30));
        stand2Button.addActionListener((ActionListener) this);
        stand2Button.setActionCommand("Player 2's turn: Stand");

        hit2Button.setText("Player 2's turn: Hit");
        hit2Button.setPreferredSize(new Dimension(475, 30));
        hit2Button.addActionListener((ActionListener) this);
        hit2Button.setActionCommand("Player 2's turn: Hit");

        panel.add(b1);
        panel.add(standButton);
        panel.add(hit2Button);
        panel.add(stand2Button);
        hit2Button.setVisible(false);
        stand2Button.setVisible(false);
        panel.add(cardLabel1);
        panel.add(cardLabel2);
        cardLabel2.setVisible(false);

        frame.add(panel);
        printPlayer1Hand();

        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        Object game = e.getActionCommand();
        if (game.equals("Player 1's turn: Hit")) {
            Random gen = new Random();
            int index = gen.nextInt(cards.size());
            Card card = cards.get(index);
            player1Hand.add(card);
            setPlayerPoints(card);
            cards.remove(index);
            printPlayer1Hand();
            printPlayer2Hand();
            cardLabel1.setVisible(false);
            cardLabel2.setVisible(true);
            findWinner();
            b1.setVisible(false);
            standButton.setVisible(false);
            stand2Button.setVisible(true);
            hit2Button.setVisible(true);
            frame.add(panel);
            frame.revalidate();
        }
        if (game.equals("Player 1's turn: Stand")) {
            printPlayer1Hand();
            printPlayer2Hand();
            cardLabel1.setVisible(false);
            cardLabel2.setVisible(true);
            findWinner();
            b1.setVisible(false);
            standButton.setVisible(false);
            stand2Button.setVisible(true);
            hit2Button.setVisible(true);
            frame.add(panel);
            frame.revalidate();
        }
        if (game.equals("Player 2's turn: Hit")) {
            Random gen = new Random();
            int index = gen.nextInt(cards.size());
            Card card = cards.get(index);
            player2Hand.add(card);
            setPlayerPoints(card);
            cards.remove(index);
            printPlayer1Hand();
            printPlayer2Hand();
            cardLabel2.setVisible(false);
            cardLabel1.setVisible(true);
            findWinner();
            b1.setVisible(true);
            standButton.setVisible(true);
            stand2Button.setVisible(false);
            hit2Button.setVisible(false);
            frame.add(panel);
            frame.revalidate();
        }
        if (game.equals("Player 2's turn: Stand")) {
            printPlayer1Hand();
            printPlayer2Hand();
            cardLabel2.setVisible(false);
            cardLabel1.setVisible(true);
            findWinner();
            b1.setVisible(true);
            standButton.setVisible(true);
            stand2Button.setVisible(false);
            hit2Button.setVisible(false);
            frame.add(panel);
            frame.revalidate();
        }

    }

}