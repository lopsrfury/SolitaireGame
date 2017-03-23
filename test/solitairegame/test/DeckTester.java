/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitairegame.test;



import solitairegame.Deck;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lopsrfury
 */
public class DeckTester {
    
    public DeckTester() {
    }
    
   

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
        Deck deck = new Deck();
        assertEquals(52, deck.Cards().size());
     }
     @Test
     public void checkRandomDeck(){
         Deck a = new Deck();
         Deck b = new Deck();
         
         assertNotEquals(a.Cards().get(5), b.Cards().get(5));
     }
}
