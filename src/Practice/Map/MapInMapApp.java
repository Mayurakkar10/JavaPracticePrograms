package Practice.Map;
import java.util.*;
public class MapInMapApp {
     public static void main(String[] args) {
    	  LinkedHashMap<String,LinkedHashMap<String,ArrayList<String>>> lmap = new LinkedHashMap<>();
    	  
    	  ArrayList boys = new ArrayList();
    	  boys.add("mahesh");
    	  boys.add("raja");
    	  boys.add("riya");
    	  
    	  ArrayList girls = new ArrayList();
    	  girls.add("rani");
    	  girls.add("pooja");
          girls.add("nikita");
          
          LinkedHashMap<String ,ArrayList<String>> stu =new LinkedHashMap<>();
          stu.put("girls", girls);
          
          LinkedHashMap<String,ArrayList<String>> stu1 = new LinkedHashMap<>();
          stu1.put("boys", boys);
          lmap.put("fe",stu);
          lmap.put("se",stu1);
          
          Set<Map.Entry<String, LinkedHashMap<String,ArrayList<String>>>> lset = lmap.entrySet();
          for(Map.Entry<String, LinkedHashMap<String,ArrayList<String>>> me: lmap.entrySet()) {
        	  
        	  System.out.println("========="+me.getKey()+"===========");
        	  
        	 LinkedHashMap<String,ArrayList<String>> students= me.getValue();
        	 
        	 Set<Map.Entry<String,ArrayList<String>>> aset = students.entrySet();
        	 for(Map.Entry<String, ArrayList<String>> ae : students.entrySet()) {
        		 System.out.println("====="+ae.getKey()+"======");
        		 ArrayList al = ae.getValue();
        		 for(Object obj: al) {
        			 System.out.println(obj+ " ");
        		 }
        	 }
        	  
          }
     }
}
