package Synchronization;

class Counter {
   int count = 0;
   void increment() {
	   count++;
   }
   void decrement() {
	   count--;
   }
}

public class WithoutSynchronization {
	public static void main(String[] args)throws Exception{
		Counter counter = new Counter();
         Thread th1 = new Thread(()->counter.increment());
         Thread th2 = new Thread(()->counter.decrement());
        
         th1.start();
         th2.start();
         th1.join();
         th2.join();
         System.out.println("Final Count: "+counter.count);
	}
}
