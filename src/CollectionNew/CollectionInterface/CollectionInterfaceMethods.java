package CollectionNew.CollectionInterface;

import java.util.*;

public class CollectionInterfaceMethods {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(20);
		al.add(30);
		al.add(40);

		// int size() - return size of the collection
		int size = al.size();
		System.out.println("Size of Collection is: " + size);

		// boolean isEmpty() is checks the collection is empty or not
		boolean b = al.isEmpty();
		if (!b) {
			System.out.println("contain data");
		} else {
			System.out.println("empty");
		}

		// boolean contains() return true if the element present in collection otherwise
		// false
		boolean b1 = al.contains(10);
		if (b1) {
			System.out.println("present");
		} else {
			System.out.println("not present");
		}

		// boolean add(E) using this method you can add element in a collection
		boolean b2 = al.add(50);
		if (b2) {
			System.out.println("Element added");
		} else {
			System.out.println("Element not added");
		}

		// boolean remove() using this method you can remove element from collection
		boolean removed = al.remove(Integer.valueOf(20));
		if (removed) {
			System.out.println("Removed ..");
		} else {
			System.out.println("Not removeed ");
		}
		
		//boolean  containAll() =  return multiple element is present or not
		//boolean addAll() - add more than on element
	}
}
