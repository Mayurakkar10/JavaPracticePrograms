package Thread;

class NewThreadClass implements Runnable{

	@Override
	public void run() {
		try {
			System.out.println("hello");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
}
public class TestThreadingUsingRunnableInterface {
	 public static void main(String[] args) throws Exception {
	     NewThreadClass nthread = new NewThreadClass();
		 Thread th1 = new Thread(nthread);
         th1.start();
	 }
}
