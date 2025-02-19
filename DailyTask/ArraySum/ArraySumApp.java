package ArraySum;

import java.util.*;

class ArrayOperation {
	private int arr[];
	private int newArr[];

	ArrayOperation(int[] arr) {
		this.arr = arr;
	}

	void calSum() {
		newArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			while (arr[i] != 0) {
				int rem = arr[i] % 10;
				sum = sum + rem;
				arr[i] = arr[i] / 10;
			}
			newArr[i] = sum;
		}
	}

	int[] getSumArray() {
		return newArr;
	}
}

public class ArraySumApp {
	public static void main(String[] x) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[] { 5732, 8659, 2534, 9625, 7354 };

		ArrayOperation ap = new ArrayOperation(a);
		ap.calSum();
		int newArr[] = ap.getSumArray();

		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
	}
}
