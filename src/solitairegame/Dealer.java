     
package solitairegame;

import java.util.*;
/**
 *
 * @author lopsrfury
 */
public class Dealer {
    Deck _deck = new Deck();
    Table _table = new Table();
    
    private void Init(){
        
        //deals from deck to colums
        _table.Colum1 = _deck.Cards().subList(1,1);
        _table.Colum2 = _deck.Cards().subList(1,2);
        _table.Colum3 = _deck.Cards().subList(1,3);
        _table.Colum4 = _deck.Cards().subList(1,4);
        _table.Colum5 = _deck.Cards().subList(1,5);
        _table.Colum6 = _deck.Cards().subList(1,6);
        _table.Colum7 = _deck.Cards().subList(1,7);
        
        //gives remaing cards to stack
        _table.Stack = _deck.Cards().subList(1,_deck.Cards().size()-1);
    
    }
}
