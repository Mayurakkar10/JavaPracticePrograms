package WaysToFetchDataFromCollection;
import java.util.*;
public class UsingForLoop {
    public static void main(String[] args) {
    	ArrayList al = new ArrayList();
    	al.add(10);
    	al.add(20);
    	al.add(30);
    	al.add(40);
    	al.add(50);
    	
    	
    	//fetch data using for loop
    	int len = al.size();
    	for(int i=0;i<len;i++){
    		Object obj = al.get(i);
    		System.out.println(obj);
    	}
    	

    	
//    	for(Object obj:al) {
//    		System.out.println(obj);
//    	}
    }
}
