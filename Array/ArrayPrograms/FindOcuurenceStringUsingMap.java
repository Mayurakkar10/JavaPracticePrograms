package ArrayPrograms;
import java.util.*;
public class FindOcuurenceStringUsingMap {
    public static void main(String[] args) {
    	 HashMap<String, ArrayList<String>> hmap = new HashMap();
    	  ArrayList al  = new ArrayList();
          String str = "hello";
          for(int i=0;i<str.length();i++) {
        	  al.add(str.charAt(i));
          }
          System.out.println(al);
          
           ArrayList newList = new ArrayList();
           for(int i=0;i<str.length();i++) {
        	   for(Object obj:al) {
        		   if(str.charAt(i) == (char)obj) {
        			   newList.add((char)obj);
        		   }
        	   }
           }
           
           System.out.println(newList);
          hmap.put(str, al);
//    	 Set<HashMap.Entry<Character,ArrayList<Character>>> hset = hmap.entrySet();
//    	 for(HashMap.Entry<Character,ArrayList<Character>> h :hset) {
//    	          
//    		 
//    	 }
    }
}
