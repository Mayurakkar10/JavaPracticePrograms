package CollectionNew.TypesOfCollection.List;

import java.util.*;

public class ListIteratorApp {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		// E subList() - this method is used retrive data between specified index using
		// list collection
		List li = al.subList(2, 5);
		System.out.println(li);

		// boolean hasNext() -check element present or not in forward direction fetching
		// Object next() -fetch element from collection and move cursor to the next
		System.out.println("Forward Direction");
		ListIterator li1 = al.listIterator();
		while (li1.hasNext()) {
			System.out.println(li1.next());
		}

		// boolean hasPrevious() -check element present or not in backward direction
		// Object previous()
		System.out.println("Backward Direction: ");
		ListIterator li2 = al.listIterator(al.size());
		while (li2.hasPrevious()) {
			System.out.println(li2.previous());
		}
		
		//void remove() - used to remove element while iterating 
		//void add(E) - used to add element at the time of fetching
		//void set(E) - this method can replace data in collection
		}
}

//ListIterator listiterator() is used fetch data from list collection in backward as
//well as forward direction
