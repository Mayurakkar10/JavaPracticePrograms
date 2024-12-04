package com.collection;
import java.util.*;
public class ObjectClass {
   public static void main(String[] args) {
	   Object[] obj = new Object[4];
	   obj[0] = 1;
	   obj[1] = 1.2;
	   obj[2] = "hello";
	   obj[3] = new java.util.Date();
	   
	   for(Object object: obj) {
		   System.out.println(object);
	   }
	   
   }
}
