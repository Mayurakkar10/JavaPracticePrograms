package FileClass;
import java.util.*;
import java.io.*;
public class CreateNewFile {
       public static void main(String[] args)throws IOException {
    	   File f = new File("D://Giri's Tech Hub//Java Language//FileHandling//newText.txt");
    	   boolean b = f.createNewFile();
    	   if(b) {
    		   System.out.println("File Created...");
    	   }
    	   else
    	   {
    		   System.out.println("some probelm is there..");
    	   }
       }
}
