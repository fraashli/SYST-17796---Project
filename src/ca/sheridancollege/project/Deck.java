/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author sonaldeep
 */
import java.util.Random;
public class Deck {
   private int _count;
   private Card[] _hand;
   private static final int Storage = 52;
   private static Random random = new Random();
   
   public Deck()
   {
      _hand = new Card[Storage];
      _count = 0;
   }
   
   public void fillDeck()
   {
      Card card;
      for(int i = 1; i <= 4; i++)
      {
         for(int j = 1; j <= 13; j++)
         {
            card = new Card(j,i);
            this.insertCard(card);
         }
      }
   }
   
   public void insertCard(Card card)
   {
      if(_count == _hand.length)
      {
         Card[] _temp = new Card[_count + Storage];
         for(int i = 0; i < _hand.length; i++)
         {
            _temp[i] = _hand[i];
         }
         _hand = _temp;
      } 
      _hand[_count] = card;
      _count++;
   }
}
