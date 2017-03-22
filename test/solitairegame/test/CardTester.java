package solitairegame.test;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import solitairegame.Suit;
import solitairegame.Card;


/**
 *
 * @author lopsrfury
 */
public class CardTester {
    
    @Test
    public void smokeTest(){
        
        Card myCard = new Card(Suit.D, 4);
    
         assertEquals( "D4", myCard.toString() );
    }
    
}
