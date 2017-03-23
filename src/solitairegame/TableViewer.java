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
        int count = 0 ;
        for(int i = 0; i < table.Colums.size() * table.Colums.get(6).size(); i++){
                      
            
            //for(int j = 0; j < table.Colums.get(6).size(); j++){
                if(table.Colums.get(i).size() > count){
                     System.out.print(table.Colums.get(i).get(count) + " ");
                }
                count++;

            //}
             System.out.println("");
            
        }
        
    }
   
}
