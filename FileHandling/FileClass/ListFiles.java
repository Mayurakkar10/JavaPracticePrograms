package FileClass;
import java.util.*;
import java.io.*;
public class ListFiles {
       public static void main(String[] args) {
    	   File f = new File("D://Giri's Tech Hub");
    	   File list[] = f.listFiles();
    	   for(int i=0;i<list.length;i++)
    	   {
    		   System.out.println(list[i]);
    	   }
    	   
       }
}
