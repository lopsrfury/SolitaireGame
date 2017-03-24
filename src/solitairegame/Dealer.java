     
package solitairegame;

import java.util.*;
/**
 *
 * @author lopsrfury
 */
public class Dealer {
    
    
    public void Init(Table table, Deck deck){
        
       //deals from deck to colums
       table.Colums.set(0, deck.Cards().subList(0,1));
       table.Colums.get(0).get(table.Colums.get(0).size()-1).flip();
        
       table.Colums.set(1, deck.Cards().subList(1,3));
       table.Colums.get(1).get(table.Colums.get(1).size()-1).flip();
         
       table.Colums.set(2, deck.Cards().subList(3,6));
       table.Colums.get(2).get(table.Colums.get(2).size()-1).flip();
        
       table.Colums.set(3, deck.Cards().subList(6,10));
       table.Colums.get(3).get(table.Colums.get(3).size()-1).flip();
      
       table.Colums.set(4, deck.Cards().subList(10,15));
       table.Colums.get(4).get(table.Colums.get(4).size()-1).flip();
        
       table.Colums.set(5, deck.Cards().subList(15,21));
       table.Colums.get(5).get(table.Colums.get(5).size()-1).flip();
        
       table.Colums.set(6, deck.Cards().subList(21,28));
       table.Colums.get(6).get(table.Colums.get(6).size()-1).flip();
        
       
       //gives remaing cards to stack
       table.Stack = deck.Cards().subList(28,deck.Cards().size());
    
    }
}
