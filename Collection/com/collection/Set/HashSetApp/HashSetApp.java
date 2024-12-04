package com.collection.Set.HashSetApp;
import java.util.*;
public class HashSetApp {
  public static void main(String[] args) {
         HashSet h = new HashSet();
         h.add(40);
         h.add(10);
         h.add(5);
         h.add(60);
         h.add(70);
         h.add(70);
         for(Object obj:h) {
        	 System.out.println(obj);
         }
         
  }
}
