/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author Sivagama
 * @modifier Ashli Francis
 */
public abstract class Card {
    private int numValue;
    private int numSuit;
    
    public Card(int n_value, int n_suit){
        numValue = n_value;
        numSuit = n_suit;
    }
    
    public int getValue(){
        return numSuit;
    }
    
    public int getSuit(){
        return numValue;
    }
    
    //default modifier for child classes
    
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    
    @Override
    public String toString(){
        String value = "";
        String suit = "";
        
        if(numValue == 1){
            value = "Ace of";
        }else if (numValue > 10 ){
            switch(numValue){
                case 11:
                    value = "Jack of ";
                    break;
                case 12:
                    value = "Queen of ";
                    break;
                case 13:
                    value = "King of ";
                    break;
            }
        }else{
            value = ""+numValue+"of ";
        }
        
        if(numValue > 13 || numValue <= 0){
            System.out.println("Invalid card value");
        }
        
        
        if(numSuit >= 1 && numSuit <= 4){
            switch(numSuit){
                case 1:
                    suit = "Clubs";
                    break;
                case 2:
                    suit = "Diamonds";
                    break;
                case 3:
                    suit = "Hearts";
                    break;
                case 4:
                    suit = "Spades";
                    break;                 
            }
        }else{
            System.out.println("Invalid suit number.");
        }
        
        return value + suit;
    }
    //Maybe the suit should be an array, holding all the suits that they 
    //have in hand(for both player and ai)
    //Array version
    public void compareSuitA(int[] playerSuit , int[] aiSuit){
       int size1 = playerSuit.length;
       int size2 = aiSuit.length;
       for(int i = 0; i < size1; i++ ){
           for(int j = 0; j < size2; j++){
               if(playerSuit[i] == aiSuit[j]){
                   
               }
           }
           
       }
    }
    
    //Non - Array Version
    public void compareSuit(int playerSuit, int aiSuit){
        if(playerSuit == aiSuit){
            System.out.println("Yay! is a match ");
            
            //getPlayer would be the player who asks for a match 
            //System.out.println(getPlayer()+"has: "+toString()+"");
        }
    }
    
} 
