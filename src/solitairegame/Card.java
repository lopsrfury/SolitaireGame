
package solitairegame;

import java.awt.image.BufferedImage;

/**
 *
 * @author John
 */
public class Card {
    //Creating card peramiters
    private String suit;
    private String face;
    private int value;
    
    
    /**
     * The constructor for card class
     * @param suit (spades, clubs ...)
     * @param face (2,3,4,5... Ace)
     * @param value (2,3,4...) 
     */
public Card(String suit, String face, int value){
    this. suit = suit;
    this.face = face;
    this.value = value;
    }    

}
