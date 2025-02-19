package String;
import java.util.*;
public class CountRepetativeWordFromStringUsingMap {
     public static void main(String[] arg) {
    	 LinkedHashMap<Character,Integer> lmap = new LinkedHashMap<>();
    	 String str = "abcmnopqrabc";
    	 for(int i=0;i<str.length();i++) {
    		 Integer count = lmap.get(str.charAt(i));
    		 if(count == null) {
    			 count = new Integer(0);
    		 }
    		 ++count;
    		 lmap.put(str.charAt(i),count);
    	 }
    	 
    	 
    	 Set<Map.Entry<Character,Integer>> lset  = lmap.entrySet();
    	 for(Map.Entry<Character, Integer> l:lset) {
    		 if(l.getValue()>1) {
    			 System.out.printf("%c ==> %d",l.getKey(),l.getValue());
    		 }
    		 System.out.println("\n");
    	 }
    	 
    	 
    	 
     }
}
