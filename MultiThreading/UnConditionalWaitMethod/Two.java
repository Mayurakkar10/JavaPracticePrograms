package UnConditionalWaitMethod;

public class Two extends Table {
     Table table;
     void setTable(Table table) {
    	 this.table =table;
     }
     
     public void run() {
    	 table.showTable(2);
     }
}
