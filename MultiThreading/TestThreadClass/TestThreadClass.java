package TestThreadClass;

public class TestThreadClass {
    public static void main(String[] args){
    	 Thread t = Thread.currentThread();
    	 String threadName = t.getName();
    	 System.out.println("ThreadName "+threadName);
    	 int priority = t.getPriority();
    	 System.out.println("Default priority of thread "+priority);
    }
}
