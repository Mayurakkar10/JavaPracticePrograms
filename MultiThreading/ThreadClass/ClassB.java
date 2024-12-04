package ThreadClass;

public class ClassB extends Thread{
    public void run() {
    
    	try {
    	for(int i=1;i<=5;i++)
    	{
    		System.out.println("Second Thread: "+i);
    		Thread.sleep(10000);
    		if(i==2) {
    			//stop() this method is deprected since java 1.2
    		}
    	}
    	}
    	catch(Exception e){
    		System.out.println("Error: "+e);
    	}
    }
}
