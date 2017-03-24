     
package solitairegame;

import java.util.*;
/**
 *
 * @author lopsrfury
 */
public class Dealer {
    
    Table _table;
    public void Init(Table table, Deck deck){
        //modular link
        _table = table;
       //deals from deck to colums
       table.Colums.set(0, new ArrayList<Card>(deck.Cards().subList(0,1)));
       table.Colums.get(0).get(table.Colums.get(0).size()-1).flip();
        
       table.Colums.set(1, new ArrayList<Card>(deck.Cards().subList(1,3)));
       table.Colums.get(1).get(table.Colums.get(1).size()-1).flip();
         
       table.Colums.set(2, new ArrayList<Card>(deck.Cards().subList(3,6)));
       table.Colums.get(2).get(table.Colums.get(2).size()-1).flip();
        
       table.Colums.set(3, new ArrayList<Card>(deck.Cards().subList(6,10)));
       table.Colums.get(3).get(table.Colums.get(3).size()-1).flip();
      
       table.Colums.set(4, new ArrayList<Card>(deck.Cards().subList(10,15)));
       table.Colums.get(4).get(table.Colums.get(4).size()-1).flip();
        
       table.Colums.set(5, new ArrayList<Card>(deck.Cards().subList(15,21)));
       table.Colums.get(5).get(table.Colums.get(5).size()-1).flip();
        
       table.Colums.set(6, new ArrayList<Card>(deck.Cards().subList(21,28)));
       table.Colums.get(6).get(table.Colums.get(6).size()-1).flip();
        
       
       //gives remaing cards to stack
       table.Stack = deck.Cards().subList(28,deck.Cards().size());
    
    }
    
    public void move(int from, int to){
        
       List<Card> fromCol = _table.Colums.get(from);
       Card fromCard = fromCol.remove(fromCol.size()-1);
       fromCol.get(fromCol.size()-1).flip();
       List<Card> toCol = _table.Colums.get(to);
       toCol.add(fromCard);
    }
    
    public void flipCardsInList(List<Card> List){
        for (Card c : List) {
            c.flip();
        }
    }
    public void Draw(){
       
       if(_table.Stack.size() == 0){
           Collections.reverse(_table.Draw);
           _table.Stack = new ArrayList(_table.Draw);
           _table.Draw = new ArrayList();
           
           flipCardsInList(_table.Stack);
       }
       else{
                 
       Card stackCard = _table.Stack.remove(_table.Stack.size()-1);
       _table.Draw.add(stackCard);
       stackCard.flip();
       }
    }
}
