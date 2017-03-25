
package solitairegame;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author lopsrfury
 */
public class Table {
    //need lists for colums, stack, pile, suit piles
    List<Card> Stack = new ArrayList<Card>();
    List<Card> Draw = new ArrayList<Card>();
    //List<Card> Cpile = new ArrayList<Card>();
    //List<Card> Dpile = new ArrayList<Card>();
    //List<Card> Hpile = new ArrayList<Card>();
    //List<Card> Spile = new ArrayList<Card>();

    List<List<Card>> Piles = new ArrayList<List<Card>>();
    List<List<Card>> Colums = new ArrayList<List<Card>>();

public Table(){

    Colums.add(new ArrayList<Card>());
    Colums.add(new ArrayList<Card>());
    Colums.add(new ArrayList<Card>());
    Colums.add(new ArrayList<Card>());
    Colums.add(new ArrayList<Card>());
    Colums.add(new ArrayList<Card>());
    Colums.add(new ArrayList<Card>());
    
    Piles.add(new ArrayList<Card>());
    Piles.add(new ArrayList<Card>());
    Piles.add(new ArrayList<Card>());
    Piles.add(new ArrayList<Card>());
    
    

   }
}
