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


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
