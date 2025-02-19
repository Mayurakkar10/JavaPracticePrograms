package Thread;

class OneThread extends Thread{
     public void run() {
    	 try {
			System.out.println("FirstThread");
			Thread.sleep(2000);
			System.out.println("excecute");
    	 }
    	 catch(Exception e) {
    		 System.out.println(e);
    	 }
		}
}
public class TestThread{
	public static void main(String[] args)throws Exception{
	    OneThread oth1 = new OneThread();
	    OneThread oth2 = new OneThread();
	    oth1.start();
	    oth1.join();
	    oth2.start();
	} 
}


//Runnable implements java.lang.Throwable (it is also a 
//Thread