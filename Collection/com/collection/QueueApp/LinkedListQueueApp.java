package com.collection.QueueApp;

import java.util.*;

public class LinkedListQueueApp {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();

		// add method add element at the rear of the queue
		q.add(10);
		q.add(12);
		q.add(13);
		q.add(14);
		q.add(15);
		q.add(16);

		// remove method removes element at the rear of the queue
		// q.remove();

		// add element at rear of the queue
		// q.offer(17);

		// remove and return element at front
		// System.out.println(q.poll());

		// return element at front without removing it
		// q.element();
		// System.out.println(q.element());
		System.out.println(q.peek());
		System.out.println(q);

	}
}
