package ThreadClass;

public class ClassA extends Thread {
   public void run() {
	   try {
           for(int i=1;i<=5;i++) {
        	   System.out.println("First Thread: "+i);
        	   Thread.sleep(1000);
           }
	   }
	   catch(Exception e) {
		   System.out.println("Error: "+e);
	   }
   }
}
