package PriorityOfThreads;

public class TableApp {
    public static void main(String[] args) {
    	Table t1 = new Table();
    	Two tw = new Two();
    	Three th = new Three();
    	tw.setTable(t1);
    	tw.start();
    	
    	th.setPriority(Thread.MAX_PRIORITY);
    	th.setPriority(Thread.MIN_PRIORITY);
    	
    	th.setTable(t1);
    	th.start();
    }
}
