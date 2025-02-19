package WrapperClass.NumberClass;
import java.util.*;
public class NumberClass {
	 static Integer a;
	 static int b;
    public static void main(String[] args) {
    	 //Number is parent of all numeric class
    	 //Number is abstract class it contains some abstract method
    	 //xxxValue()- which is help to convert numeric reference value to primitive type value 
    	 //public abstract intValue() -  used to convert any numeric reference value to integer value
    	 //public abstract long longValue() - used to  convert any numeric reference value to long value
    	 //public abstract float floatValue() - used to convert any numeric value to float value
    	 //public abstract double doubleValue() - used to convert any numeric reference value to primitive type double value
    	 //public byte byteValue() - used to convert any numeric reference to byte primitive value
    	 //public short shortValue() - used to convert any numeric reference to short primitive value
    	
    	 //here A is null because a is reference and b is 0 because b is int
    	 System.out.println("A is: "+a);
    	 System.out.println("B is: "+b); 
    }
}
