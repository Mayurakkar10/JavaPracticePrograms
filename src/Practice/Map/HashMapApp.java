package Practice.Map;
import java.util.*;
public class HashMapApp {
    public static void main(String[] args){
         LinkedHashMap<Integer,String> lmap = new LinkedHashMap<Integer,String>();
         
         lmap.put(1,"suresh");
         lmap.put(2, "rakesh");
         lmap.put(3, "jaya");
         
         Set<Map.Entry<Integer, String>> m = lmap.entrySet();
         
         for(Map.Entry<Integer, String> me:lmap.entrySet()) {
        	 System.out.println(me.getKey()+ " "+me.getValue());
         }
         
    }
}
