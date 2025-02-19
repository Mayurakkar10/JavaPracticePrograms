package ThreadMethods;

//join() allows one thread to wait until another thread has completed execution
class MyThread1 extends Thread{

	@Override
	public void run() {
	   System.out.println(Thread.currentThread());
	} 
}

public class JoinMethod {
   public static void main(String []args)throws InterruptedException{
	    MyThread1 mt1 = new MyThread1();
	    MyThread1 mt2 = new MyThread1();
        
	    mt1.start();
	    mt1.join();
	    mt2.start();
	    mt2.join();
   }
}
