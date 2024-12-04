package com.collection.Set.TreeSet;
import java.util.*;
public class TreeSetApp {
     public static void main(String[] args){
    	  TreeSet ts = new TreeSet();
    	  ts.add(50);
    	  ts.add(10);
    	  ts.add(30);
    	  ts.add(20);
    	  ts.add(20);
    	  for(Object obj:ts) {
    		  System.out.println(obj);
    	  }
     }
}
