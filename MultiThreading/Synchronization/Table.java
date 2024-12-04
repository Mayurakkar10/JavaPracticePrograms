package Synchronization;

public class Table extends Thread {
    synchronized void showTable(int no) {
    	try {
    		for(int i=1;i<=10;i++)
    		{
    			System.out.printf("%d X %d is %d \n", no,i,(no*i));
    			Thread.sleep(1000);
    		}
    	}
    	catch(Exception e) {
    		System.out.println("Error: "+ e);
    	}
    }
}
 