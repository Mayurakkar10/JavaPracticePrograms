package com.comparator;
import java.util.*;
public class SortProductByName implements Comparator{
     public int compare(Object o1,Object o2) {
    	 Product p1 = (Product)o1;
    	 Product p2 = (Product)o2;
    	 return p1.getName().compareTo(p2.getName());
     }
}
