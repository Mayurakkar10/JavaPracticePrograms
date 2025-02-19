package Inheritance;

interface A{
	 void show();
}

interface B{
	  void show();
}

class C{
	void show() {
		System.out.println("C show");
	}
}

class D extends C implements A,B{
	public void show() {
		System.out.println("D show method");
	}
}

public class MultipleInheritance {
   public static void main(String[] args){
	   D d1 = new D();
	   d1.show();
   }
}
