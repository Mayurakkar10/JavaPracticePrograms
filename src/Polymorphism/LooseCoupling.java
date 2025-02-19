package Polymorphism;
import java.util.*;
abstract class Value1{
	 int a,b;
	 void setValue(int a,int b) {
		 this.a = a;
		 this.b = b;
	 }
	 abstract int getResult();
}
class Add1 extends Value1{
	int getResult() {
		return a+b;
	}
}
class Mul1 extends Value1{
	int getResult() {
		return a*b;
	}
}
class Calculator1{
	void  performOperation(Value1 v) {
	    int result  = v.getResult();
	    System.out.println("Result is: "+result);   	
	}
}
public class LooseCoupling {
     public static void main(String[] args) {
    	 Calculator1 c1 = new Calculator1();
    	 Value1 v = new Add1();
    	 v.setValue(10,20);
    	 c1.performOperation(v);
    	 v = new Mul1();
    	 v.setValue(20, 30);
    	 c1.performOperation(v);
    	 
     }
}
