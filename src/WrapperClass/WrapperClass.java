package WrapperClass;
import java.util.*;
public class WrapperClass {
   public static void main(String[] args) {
	    //Wrapper classes are inbuilt classes of java
	    //used to perform conversion of primitive to  reference type and reference type to primitive
	    //There are two types of conversion in java
	    //1.Primitive Type Conversion - when we perform conversion between simple type 
	    // There are two type of conversion in primitive type conversion
	    // 1. Implicit Conversion - those conversion performed automatically by compiler
	    //     when we put large type of data at left side and smaller type of data at right side
	          long a = 10;   int b =100;    a = b; System.out.println(a);
	          //long a is 8 byte and int b is 4 byte so implicit conversion
	   //  2. Explicit Conversion - those conversion - those conversion performed manually by developer
	          long c = 10;  int d = 100;    d = (int)c; System.out.println(d);
	          //we need to provide conversion manually here
	          
   }
}
