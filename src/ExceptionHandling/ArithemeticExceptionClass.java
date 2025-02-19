package ExceptionHandling;
import java.util.*;
public class ArithemeticExceptionClass {
	public static void main(String[] args)throws ArithmeticException{
		try {
			int a = 10 / 0;
			System.out.println(a);
		} catch (ArithmeticException ex) {
			System.out.println("Error is: " + ex);
		}
	}
}
