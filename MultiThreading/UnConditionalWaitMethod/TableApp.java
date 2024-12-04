package UnConditionalWaitMethod;
import java.util.*;
public class TableApp {
    public static void main(String[] args) {
    	Table t1 = new Table();
    	Two tw = new Two();
    	tw.setTable(t1);
    	tw.start();
    	
    	Three th = new Three();
    	th.setTable(t1);
    	th.start();
    	
    	
    	do {
    		Scanner sc= new Scanner(System.in);
    		String msg  = sc.nextLine();
    		if(msg.equals("restart")) {
    			t1.rejoin();    		
    		}
    	}while(true);
    }
}
