     
package solitairegame;

import java.util.*;
/**
 *
 * @author lopsrfury
 */
public class Dealer {
    
    
    public void Init(Table table, Deck deck){
        
       //deals from deck to colums
       table.Colums.set(0, deck.Cards().subList(1,2));
       table.Colums.get(0).get(table.Colums.get(0).size()-1).flip();
        
       table.Colums.set(1, deck.Cards().subList(2,4));
       table.Colums.get(1).get(table.Colums.get(1).size()-1).flip();
         
       table.Colums.set(2, deck.Cards().subList(4,7));
       table.Colums.get(2).get(table.Colums.get(2).size()-1).flip();
        
       table.Colums.set(3, deck.Cards().subList(7,11));
       table.Colums.get(3).get(table.Colums.get(3).size()-1).flip();
      
       table.Colums.set(4, deck.Cards().subList(11,16));
       table.Colums.get(4).get(table.Colums.get(4).size()-1).flip();
        
       table.Colums.set(5, deck.Cards().subList(16,22));
       table.Colums.get(5).get(table.Colums.get(5).size()-1).flip();
        
       table.Colums.set(6, deck.Cards().subList(22,29));
       table.Colums.get(6).get(table.Colums.get(6).size()-1).flip();
        
       //gives remaing cards to stack
       table.Stack = deck.Cards().subList(1,deck.Cards().size()-1);
    
    }
}
