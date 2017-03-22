     
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
        table.Colum1.get(table.Colum1.size()-1).flip();
        
        table.Colum2 = deck.Cards().subList(2,4);
        table.Colum2.get(table.Colum2.size()-1).flip();
        
        table.Colum3 = deck.Cards().subList(4,7);
        table.Colum3.get(table.Colum3.size()-1).flip();
        
        table.Colum4 = deck.Cards().subList(7,11);
        table.Colum4.get(table.Colum4.size()-1).flip();
        
        table.Colum5 = deck.Cards().subList(11,16);
        table.Colum5.get(table.Colum5.size()-1).flip();
        
        table.Colum6 = deck.Cards().subList(16,22);
        table.Colum6.get(table.Colum6.size()-1).flip();
        
        table.Colum7 = deck.Cards().subList(22,29);
        table.Colum7.get(table.Colum7.size()-1).flip();
        
        //gives remaing cards to stack
        table.Stack = deck.Cards().subList(1,deck.Cards().size()-1);
    
    }
}
