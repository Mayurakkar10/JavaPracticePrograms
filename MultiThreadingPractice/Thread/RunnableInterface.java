package Thread;

class NewThread implements Runnable{

	@Override
	public void run(){
		System.out.println(Thread.currentThread());
	}
}

public class RunnableInterface {
   public static void main(String []args) {
	    NewThread nt = new NewThread();
	    Thread th = new Thread(nt);
	    th.start();
   }
} 
