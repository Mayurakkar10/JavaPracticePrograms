package ThreadClass;
import java.util.*;
public class ThreadClassApp {
    public static void main(String[] args) throws InterruptedException{
           ClassA ca = new ClassA();
           ca.start();
           ca.join();
           System.out.println("Status of thread"+ca.isAlive());
           ClassB cb = new ClassB();
           cb.start();
           System.out.println("Status of thread"+cb.isAlive());
    }
}


//run() it is method of runnable interface and thread is implemenclass of runnable interface
//join() it will first print first thread complete then the second thread 
//start() it is used start the thread when we start() method internally run() get executed
//sleep() this method can hold the thread execution some specified time
//stop() this method is used to terminate the execution thread
//isAlive() this method return the status of the thread return true if thread is exection or false if not