package ConditionalWaitMethod;

public class TableApp {
    public static void main(String[] args) {
    	Table t1 = new Table();
    	Two tw = new Two();
    	tw.setTable(t1);
    	tw.start();
    	
    	Three th = new Three();
    	th.setTable(t1);
    	th.start();
    }
}
