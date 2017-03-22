
package solitairegame;

/**
 *
 * @author lopsrfury
 */
public class Card {
 
 private final int rank;
 private final Suit suit;
 private Boolean faceUp = false;
 
 
 
 public Card(Suit suit, int rank){
     this.suit = suit;
     this.rank = rank;
 }
 //if up put down if down up
 public Boolean flip(){
     if (faceUp == false){
         return faceUp = true;
     }
     else{
         return faceUp = false;     
     }
 }
 public  String toString(){
     if (faceUp == true){
         return rank + suit.toString(); 
     }
     else{
         return "X";
     }
    
 }

}
