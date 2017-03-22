

package solitairegame;

/**
 *
 * @author lopsrfury
 */
public class SolitaireGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating dealer
        Dealer dealer = new Dealer();
        
        //creating deck
        Deck _deck = new Deck();
        
        //creating tablev values
        Table _table = new Table();
        
        //displaying table
        TableViewer tableView = new TableViewer();
        
        //dealing the initial card setup
        dealer.Init(_table, _deck);
        
        tableView.print(_table);
    }
    
}
