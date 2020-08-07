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
}
