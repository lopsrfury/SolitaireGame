     
package solitairegame;

import java.util.*;
/**
 *
 * @author lopsrfury
 */
public class Dealer {
    
    
    public void Init(Table table, Deck deck){
        
        //deals from deck to colums
        table.Colum1 = deck.Cards().subList(1,2);
        table.Colum2 = deck.Cards().subList(1,3);
        table.Colum3 = deck.Cards().subList(1,4);
        table.Colum4 = deck.Cards().subList(1,5);
        table.Colum5 = deck.Cards().subList(1,6);
        table.Colum6 = deck.Cards().subList(1,7);
        table.Colum7 = deck.Cards().subList(1,8);
        
        //gives remaing cards to stack
        table.Stack = deck.Cards().subList(1,deck.Cards().size()-1);
    
    }
}
