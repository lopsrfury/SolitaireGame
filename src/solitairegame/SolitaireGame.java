

package solitairegame;
import java.util.Scanner;
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
        Scanner userInput = new Scanner(System.in);
        String input = "";
         while(!input.equals("q")){
             tableView.print(_table);
             System.out.println("press q to quit, m to move, d to draw");
             input = userInput.next();
             System.out.println("user input=" + input);
             
             if(input.equals("m")){
                 System.out.print("from,to");
                 input = userInput.next();
                 String[] colums = input.split(",");
                 dealer.move(Integer.parseInt(colums[0])-1, Integer.parseInt(colums[1])-1);
             }
             else if(input.equals("d")){
                dealer.Draw();
             }
         }
        
    }
    
    
}
