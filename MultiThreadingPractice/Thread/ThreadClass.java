package Thread;
//we can create new thread using Thread class 
class MyThread extends Thread{
     public void run(){
    	 System.out.println(Thread.currentThread());
     }
}

public class ThreadClass {
    public static void main(String []args){
    	MyThread mt = new MyThread();
    	mt.start();
    }
}
