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
public class GoFish 
{
    public static Scanner input = new Scanner(System.in);
    private Deck playerTurn;
    private Deck declareWinner;
    private Deck takeCard;
    private boolean GameOver;
    private Deck computerTurn;
    
   
   
    //The group of cards, stored in an ArrayList
    private ArrayList <Card> cards;
    private int size;//the size of the grouping
    private boolean playerHand;
    
    public GoFish(int givenSize)
    {
        size = givenSize;
        takeCard=new Deck();
        playerTurn=new Deck();
        computerTurn= new Deck();
        
    }
    
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<Card> showCards()
    {
        return cards;
    }
    
    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }
public void playerTurn(){
    boolean retryUser=false;
    do{
        retryUser=false;
        boolean win = false;
        if(!win)
        {
            Card takecard=null;
            System.out.println(playerHand);
            System.out.println("");
        }
    }
    
}
    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }

   public void playGOFish()
   {
       
   }
    
}//end class
