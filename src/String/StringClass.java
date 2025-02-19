package String;
import java.util.*;
public class StringClass {
   public static void main(String[] args) {
	    //String is immutable class means if once intialize any value can't be change later
	    //String is final class that Means once we create object we can not modify it
	   
	    //when we create string using intialization "" then string object created in string pool constant section
	    //if create object using new keyword then the object is stored in heap section of memory
	    String str = "one Way";
	    String strS = new String("Second Way");
	    System.out.println(str);
	    System.out.println(strS);
	    
	    //if we create two string with same string value then there is only one object created;
	    String str1 ="hello";
	    String str2 = "hello";
	    System.out.println(System.identityHashCode(str1));
	    System.out.println(System.identityHashCode(str2));
	    
	    //Methods of String
	    //1.int length() - return length of string;
	    //2.char charAt(int index) return  char at index;
	   
	    //String[] split(String): this method is used for split data from string using some specified character
	    String string = "Good Morning India";
	    String[] newStrArr  = string.split(" ");
	    
	    for(String stri:newStrArr) {
	    	System.out.println(stri);
	    }
	    
	    
	    //toUpperCase();
	    //toLowerCase();
	    String string1 = "hello";
	    String string2 =string1.toUpperCase();
	    System.out.println(string2);
	    
	    //trim()
	    String newString1 = "   hello     this  ";
	    newString1 = newString1.trim();
	    System.out.println(newString1);
	     
	    //endsWith();
	    boolean b = newString1.endsWith("s");
	    System.out.println(b);
	    
	    //substring() - extract substring from string
	    String substr = newString1.substring(2,5);
	    System.out.println(substr);
	    
	    
	    //int indexOf(String) - it is used to return index 1 and -1 if not of particular data from  a string 
	    //we can used it for search data from a string
	    String newString = "This is word";
	    if(newString.indexOf("w")!= -1) {
	    	System.out.println("String found");
	    }
	    else
	    {
	    	System.out.println("not found");
	    }
	    
	    
	    //String concat(String) used to concate to string
	    String s1 = "hello ";
	    String s2 = "Welcome";
	    String s3  = s1.concat(s2);
	    System.out.println(s3);
	    
	    //boolean equals(Object) - this method can compare two string with each other using hashcode
	    String s4 = "good";
	    String s5 = "bad";
	    
	    boolean isEqual = s4.equals(s5);
	    if(isEqual)
	    {
	    	System.out.println("Equal");
	    }
	    else
	    {
	    	System.out.println("not equal");
	    }
	    
	    //int compareTo(String) - this method is used to compare two string using lexical order
	    //if all character are equal then it return 0 and if any one character is different it return ascii
	      int result = s4.compareTo(s5);
	      if(result == 0) {
	    	  System.out.println("Equal");
	      }
	      else
	      {
	    	  System.out.println("Not Equal");
	      }
	     //int compareToIgnoreCase(String) this method will ignore the case
	      int result1 = s4.compareToIgnoreCase(s5);
	      if(result1 == 0) {
	    	  System.out.println("Equal");
	      }
	      else
	      {
	    	  System.out.println("Not Equal");
	      }
	    
   }
}
