package ExceptionHandling;
import java.util.*;
import java.io.*;


public class CheckedException {
   public static void main(String[] args) {
	    String filepath = "D://Giri's Tech Hub//IOExceptin.txt";
	    
	    try {
	      readFile(filepath);	
	    }
	    catch(IOException ex) {
	    	 System.out.println("Error is: "+ex);
	    }
   }
   
   public static void readFile(String filepath)throws IOException{
	     BufferedReader reader = new BufferedReader(new FileReader(filepath));
	     String line;
	     while((line = reader.readLine())!=null){
	    	 System.out.println(line);
	     }
	     
	     reader.close();
   }
   
}
//Types of Checked Exception
//1.FileNotFoundException
//2.SQlException
//3.ClassNotFoundException