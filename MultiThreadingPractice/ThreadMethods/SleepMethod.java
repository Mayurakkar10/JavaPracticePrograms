package ThreadMethods;

//sleep method pauses the current thread for specified time
class NewThread implements Runnable{

	@Override
	public void run() {
		try {
		System.out.println("hello");
		Thread.sleep(5000);
		System.out.println("Welcome");
		}
		catch(Exception e) {
		  System.out.println("Error"+e);
		}
	}
	
}
public class SleepMethod {
    public static void main(String [] args) {
         NewThread nt = new NewThread();
         Thread th = new Thread(nt);
         th.start();
    }
}
