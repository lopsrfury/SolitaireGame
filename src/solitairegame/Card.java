/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitairegame;

/**
 *
 * @author John
 */
public class Card {
    //Creating card peramiters
    private String suit;
    private String rank;
    private String value;
    
    //sets up code for what the card contains
    public card(String cRank, String cSuit, String cValue){
        rank = cRank;
        suit = cSuit;
        value = cValue;
    }
    
    //shows rank
    public String rank(){
        return rank;
    }
    
    //shows suit
    public String suit(){
        return suit;
    }
    
    //shows value
    public String value(){
        return value;
    }
    
    System.out.println suit;
    System.out.println rank;
    System.out.println value;
}
