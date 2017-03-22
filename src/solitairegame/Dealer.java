     
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
        table.Colum2 = deck.Cards().subList(2,4);
        table.Colum3 = deck.Cards().subList(4,7);
        table.Colum4 = deck.Cards().subList(7,11);
        table.Colum5 = deck.Cards().subList(11,16);
        table.Colum6 = deck.Cards().subList(16,22);
        table.Colum7 = deck.Cards().subList(22,29);
        
        //gives remaing cards to stack
        table.Stack = deck.Cards().subList(1,deck.Cards().size()-1);
    
    }
}
