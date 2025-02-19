package ThreadMethods;

class MyThread9 extends Thread{

	public void run() {
		 System.out.println(Thread.currentThread());
	}
}
public class IsAliveMethod {
   public static void main(String []args)throws InterruptedException{
	    MyThread9 mt = new MyThread9();
	    System.out.println("Thread alive before start: "+mt.isAlive());
	    mt.start();
	    System.out.println("Thread alive after start: "+mt.isAlive());
   }
}
