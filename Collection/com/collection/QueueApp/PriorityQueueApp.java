package com.collection.QueueApp;

import java.util.*;
public class PriorityQueueApp {
    public static void main(String[] args) {
    	    Queue<Integer> pqueue = new PriorityQueue<Integer>();
            pqueue.offer(12);
            pqueue.offer(14);
            System.out.println(pqueue);
            System.out.println(pqueue.size());
            
    }
}
