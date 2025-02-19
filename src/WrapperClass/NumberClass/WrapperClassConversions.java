package WrapperClass.NumberClass;
import java.util.*;
public class WrapperClassConversions {
     public static void main(String[] args) {
    	 //There are two types of conversion wrapper classes
    	 //1.auto boxing - when we convert primitive to reference value is called auto boxing
    	   int a  = 100;
    	   Integer b  = a;
    	   System.out.println(b);
    	   
    	 //2.auto unboxing - whe we convert reference value to primitive value is called auto unboxing
    	   Integer c = 100;
    	   int d = c;
    	   System.out.println(d);
     
    	   //autoboxing and autounboxing when we have different type of reference and different type of primitive
    	   //in this Number come into picture 
    	   //Number class has inbuilt method to perform conversion
    	   Float f = 52.1f;
    	   int e = f.intValue();
    	   System.out.println(e);
    	   
    	   //valueOf() is a method is used to convert primitive type to referential value
    	   int i = 10;
    	   Integer h = Integer.valueOf(i);
    	   System.out.println(h);
    	   
    	   int  x = 1234;
    	   String s = String.valueOf(x);
    	   System.out.println(s);
    	   
    	   //parseXXX()  -it used to convert string data into primitive type of data
    	   String str = "1234";
    	   int z = Integer.parseInt(str);
    	   System.out.println(z);
    	   
    	   
    	   
     }
}
