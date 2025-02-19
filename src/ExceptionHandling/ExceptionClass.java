package ExceptionHandling;

import java.util.*;

public class ExceptionClass {
	public static void main(String[] args) {
		try {
			int a = 10 / 0;
			System.out.println(a);
		} catch (Exception e) {
			System.out.println("Error is: " + e);
		}
	}
}

//Exception  helps to the programmer  to detect error at run time. 
//Skips the code where the exception occur and execute remaining code

//Types of Exception
//1.Checked Exception - Exception occur at program compile time
//2.UnChecked Exception - Exception occur at program run time
//3.Error - can't be handle by programmer

