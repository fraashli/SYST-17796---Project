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
    public boolean value, deletevalue; 
    public boolean deleteValue;
    private Object player;
    
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
            int value=input.nextInt();
        }
       
            
        }while(playerTurn.getCount(size)==0);
    {
    System.out.println("That card is not present in your deck" +"Please enter in another value");
        int value = input.nextInt();
            
    }
    int match=playerTurn.getCount(size);
    if(match==0){
        System.out.println("Go Fish");
        takeCard=Deck.deleteAnycard();
        if(takeCard.getValue()==value)
        {
            Card Card = null;
            playerTurn.insertCard(Card);
            retryUser=true;
            System.out.println("Card given:"+takeCard);
            System.out.println("Lucky Choice!");
               
        }
        else{
            System.out.println("Card Given");
            Card Card=null;
             playerTurn.insertCard(Card);
             
        
       }
        int afterDeckCount=playerTurn.getCount(takeCard.getValue);
        if(afterDeckCount==4){
            for(int i=0;i<4;i++){
                player.deleteValue(takeCard.getValue());
                
            }
            
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