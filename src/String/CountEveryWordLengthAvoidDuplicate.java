package String;
import java.util.*;
public class CountEveryWordLengthAvoidDuplicate {
     public static void main(String[] args){
    	   LinkedHashMap<String,Integer> lmap = new LinkedHashMap<>();
    	   String str= "Good Morning India Good";
    	   
    	   String[] words= str.split(" ");
    	   for(int i=0;i<words.length;i++) {
    		    Integer len = lmap.get(words[i]);
    		    if(len == null) {
    		    	len = new Integer(0);
    		    }
    		    len = words[i].length();
    		    lmap.put(words[i],len);
    	   }
    	   
    	   for(String key:lmap.keySet()) {
    		  System.out.println(key+"==>"+lmap.get(key)); 
    	   }
    	   
    	   
    	   //Display all words;
//    	   Set<Map.Entry<String, Integer>> lset = lmap.entrySet();
//    	   for(Map.Entry<String, Integer> h: lset) {
//    		   System.out.println(h.getKey()+"==>"+h.getValue());
//    	   }
     }
}
