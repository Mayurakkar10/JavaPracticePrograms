package ThreadMethods;

class MyThread3 extends Thread {

	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread() + "running");
				Thread.yield();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class YeildMethod {
	public static void main(String[] args) throws InterruptedException {
		MyThread3 mt1 = new MyThread3();
		MyThread3 mt2 = new MyThread3();
		mt1.start();
		mt2.start();
	}
}
