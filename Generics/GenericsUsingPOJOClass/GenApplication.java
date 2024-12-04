package GenericsUsingPOJOClass;
import java.util.*;
public class GenApplication {
      public static void main(String[] args) {
    	   ArrayList<Data> al = new ArrayList<Data
    			   >();
    	   Data d1 = new Data(1,"ABC",100.1f);
    	   Data d2 = new Data(2,"DEF",200.2f);
    	   Data d3 = new Data(3,"GHI",300.5f);
    	   al.add(d1);
    	   al.add(d2);
    	   al.add(d3);
    	   
    	   for(Data d:al) {
    		   System.out.println(d.getId()+" "+d.getName()+" "+d.getPer());
    	   }
      }
}
