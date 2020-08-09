/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author Sivagama
 * @author Noora Naz Patel
 */
public class GoFish {

    public static Scanner input = new Scanner(System.in);
    private Deck playerTurn;
    private Object declareWinner;
    private Deck takeCardD;//from deck
    private Card takeCardH;//from hand
    private Deck takeCardcpD;// pov of the computer - from deck
    private Card takeCardcpH;//pov of the computer - from hand
    private boolean GameOver;
    private Object computerTurn;
    private Object Card;
    private int Value;

    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;
    private int size;//the size of the grouping
    private boolean playerHand;
    public boolean value, deletevalue;
    public boolean deleteValue;
    private Deck player;
    private Object Win;

    public GoFish(int givenSize) {
        size = givenSize;
        takeCardD = new Deck();
        playerTurn = new Deck();
        computerTurn = new Object();

    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> showCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    public void playerTurn() {
        boolean retryUser = false;
        do {
            retryUser = false;
            boolean win = false;
            if (!win) {
                Card takecardH = null;
                System.out.println(playerHand);
                System.out.println("");
                int value = input.nextInt();
            }

        } while (playerTurn.getCount(size) == 0);
        {
            System.out.println("That card is not present in your deck" + "Please enter in another value");
            int value = input.nextInt();

        }
        int match = playerTurn.getCount(size);
        if (match == 0) {
            System.out.println("Go Fish");
            Card takeCard = takeCardD.deleteAnyCard();
            if (takeCardH.getValue() == Value) {
                Card Card = null;
                playerTurn.insertCard(Card);
                retryUser = true;
                System.out.println("Card given:" + takeCard);
                System.out.println("Lucky Choice!");

            } else {
                System.out.println("Card Given");
                Card Card = null;
                playerTurn.insertCard(Card);

            }
            int afterDeckCount = playerTurn.getCount(takeCardH.getValue());
            if (afterDeckCount == 4) {
                for (int i = 0; i < 4; i++) {
                    player.deleteValue(takeCard.getValue());

                }
                if (retryUser) {
                    checkforGameOver();
                } else if (!retryUser && match >= 1) {

                    {
                        for (int i = 0; i < match; i++) {

                            player.deleteAnyCard(playerTurn.deleteValue(Value));
                        }
                        System.out.println("The computer had:" + match);
                        retryUser = false;
                    }

                }
            }
       }

    }

    public void computerTurn() {

        boolean retrycomp = false;
        do {
            retrycomp = false;
            boolean Win = false;
            if (!Win) {

                Card takeCardcp = null;
                Card random = player.deleteAnyCard();
                player.insertCard(random);
                int type = random.getValue();
                int cpMatch = player.getCount(type);
                if (cpMatch == 0) {
                    takeCardcp = takeCardcpD.deleteAnyCard();
                    retrycomp = true;
                    System.out.println("Lucky match");

                } else {
                    System.out.println("Lucky pick for the computer, plase pick again");
                    player.insertCard(takeCardcpD.getValue(Card));

                }
                int cpafterDeckCount = cpHand.getCount(takeCardcp.getValue());
                if (cpafterDeckCount == 4) {
                    System.out.println();
                    for (int i = 0; i < 4; i++) {
                        cpHand.deleteValue(takeCardcp.getValue());

                    }
                }
                if (retrycomp) {
                    checkForGameOver(0);
                } else if (!retrycomp && cpMatch >= 1) {
                    for (int i = 0; i < cpMatch; i++) {
                        cpHand.deleteAnyCard();

                    }
                    System.out.println("The computer took the turn");
                    retrycomp = false;

                }
            }

        } while (retrycomp);

    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }

    public void playGOFish() {

    }

    public void checkforGameOver() {
       Win=(takeCardD.getSize()==0 || takeCardH.getSize()==0 || takeCardcpH()==0 );
    

   
    }

    private void checkForGameOver(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int takeCardcpH() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

/*
        
 */

class cpHand {

    static int getSize;

    static int getCount(int value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void deleteValue(int value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void deleteAnyCard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public cpHand() {
    }
}



        
//end of class