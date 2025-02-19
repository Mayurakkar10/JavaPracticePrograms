package Synchronization;

class Counter1 {
   int count = 0;
   synchronized void increment() {
	   count++;
   }
   synchronized void decrement() {
	   count--;
   }
}

public class WithSynchronization {
	public static void main(String[] args)throws Exception{
		Counter1 counter = new Counter1();
         Thread th1 = new Thread(()->counter.increment());
         Thread th2 = new Thread(()->counter.decrement());
        
         th1.start();
         th2.start();
         th1.join();
         th2.join();
         System.out.println("Final Count: "+counter.count);
	}
}
