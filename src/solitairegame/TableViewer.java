package solitairegame;



public class TableViewer {
   
    
    public void print(Table table){
       /*
        System.out.println(table.Colums.get(6));
        System.out.println(table.Colums.get(5));
        System.out.println(table.Colums.get(4));
        System.out.println(table.Colums.get(3));
        System.out.println(table.Colums.get(2));
        System.out.println(table.Colums.get(1));
        System.out.println(table.Colums.get(0));
        */
       // Print stack, draw and piles
       System.out.print("  ");
       System.out.print(table.Stack.get(table.Stack.size()-1));
       
       System.out.print(table.Draw);
       System.out.print("        ");
       System.out.print(table.Cpile);
       System.out.print("    ");
       System.out.print(table.Dpile);
       System.out.print("    ");
       System.out.print(table.Hpile);
       System.out.print("    ");
       System.out.println(table.Spile);
       System.out.println();
       

         // Print Cards in rows and columns 
        for(int rowcount = 0; rowcount < getRowSize(table); rowcount++){
        
            for(int columncount = 0; columncount < table.Colums.size(); columncount++){
                if(table.Colums.get(columncount).size() > rowcount)
                {
                     System.out.print(pad(table.Colums.get(columncount).get(rowcount).toString(), 4, ' '));
                }
                else
                {
                    System.out.print("____");
                }

            }
            System.out.println("");
            
        }
        
    }
   
    public String pad(String str, int size, char padChar)
    {
      String tmp = str;
      if( tmp.length() < size)
      {
          while( tmp.length() < size  )
              tmp += padChar;
      }
      return tmp;
    }
    
    public int getRowSize(Table table){
        int countSize = 0;
        for(int columncount = 0; columncount < table.Colums.size(); columncount++){
            if(countSize < table.Colums.get(columncount).size()){
                countSize = table.Colums.get(columncount).size();
                
            }
        }
        return countSize;
    }
            
}
