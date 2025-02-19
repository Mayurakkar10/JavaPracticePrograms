package ExceptionHandling;

public class UnCheckedException {
	public static void main(String[] args) {
		try {
			int a = 10 / 0;
		} catch (ArithmeticException ex) {
			System.out.println("Error is: "+ex);
		}
	}
}

//UnCheckedException
//1.ArithmeticException
//2.NullPointerExcpetion
//3.NumberFormatExeption
//4.ArrayIndexOutOfBoundsException
//5.StringIndexOutOfBoundsException
//6.ClassCastExeption


