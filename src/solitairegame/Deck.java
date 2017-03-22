
package solitairegame;

import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Deck
{
    // Initialize private Cardlist
    private List<Card> _cards = new ArrayList<Card>();
        
    public Deck(){
        
        // Create list of cards
          for (Suit suit : Suit.values()) {
                for (int i = 0; i < 13; i++){
                    _cards.add(new Card(suit, i));
                }
            }
 
            

    Random rand = new Random(52);

        // Shuffle cards
    Collections.shuffle(_cards, rand);

    } 
    public List<Card> Cards(){
        return _cards;
    }
}