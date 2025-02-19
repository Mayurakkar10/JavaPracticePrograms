package Polymorphism;

abstract class Value {
	int a, b;

	void setValue(int a, int b) {
		this.a = a;
		this.a = b;
	}

	abstract int getResult();
}

class Add extends Value {
	int getResult() {
		return a + b;
	}
}

class Mul extends Value {

	int getResult() {
		return a * b;
	}
}

class Calculator {
	void performOperation(Add add) {
		int result = add.getResult();
		System.out.println("Sum is: " + result);
	}
}

public class TightCoupling {
	public static void main(String[] x) {
		Calculator c = new Calculator();
		Add ad = new Add();
		ad.setValue(10, 20);
		c.performOperation(ad);
	}
}
