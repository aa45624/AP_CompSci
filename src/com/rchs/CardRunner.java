package com.rchs;

public class CardRunner {

    public static void main( String[] args )
    {
        BlackJack test = new BlackJack();

        test.shuffle();
        //test.printCards();
        //System.out.println("PRINTED THE WHOLE DECK OF CARDS");
        test.setPlayer2Hand();
        test.setPlayer1Hand();
        //test.printDealarHand();
        //System.out.println("Printed dealer deck");
        test.findPoints();
       // test.printPlayerHand();
       // System.out.println("Printed player deck");

       test.gamePlayPanel();
       //test.dealerTurn();

        int size = test.getCardCount();





        //System.out.println("Total Card Count = " + size);


    }


}
