
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
        for (int i = 1; i < 14; i++){
                _cards.add(new Card(suit, i));
        }
    }
    
    int seed = new Random().nextInt();
    System.out.println("seed=" + seed );
    Random rand = new Random(seed );

    // Shuffle cards
    Collections.shuffle(_cards, rand);

    } 
    public List<Card> Cards(){
        return _cards;
    }
}