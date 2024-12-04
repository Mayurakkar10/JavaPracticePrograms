package com.VectorAssignment;

import java.util.*;

public class RemoveDuplicate {
     public static void main(String[] args) {
           Vector v = new Vector();
           v.add(10);
           v.add(20);
           v.add(30);
           v.add(40);
           v.add(50);
           v.add(50);
           
           System.out.println("Vector list: ");
           System.out.println(v);
           HashSet h =  new HashSet(v);
           System.out.println(h);
     }
}
