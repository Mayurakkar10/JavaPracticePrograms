package Generics;
import java.util.*;
public class GenericsApp {
      public static void main(String[] args) {
    	   ArrayList al  = new ArrayList();
    	   al.add(10);
    	   al.add(20);
    	   al.add(30);
    	   al.add(20.5f);
    	   al.add(new java.util.Date());
    	   int sum = 0;
    	   for(Object obj:al) {
    		   if(obj instanceof Integer) {
    		   sum = sum+ (int)obj;
    		   }
    	   }
    	   System.out.println("Sum is: "+sum);
      }
}
