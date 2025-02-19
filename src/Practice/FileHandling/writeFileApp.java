package Practice.FileHandling;
import java.util.*;
import java.io.*;
public class writeFileApp {
     public static void main(String[] args)throws IOException{
    	  FileWriter fw = new FileWriter("D://Giri's Tech Hub//abc.txt",true);
    	  BufferedWriter bw = new BufferedWriter(fw);
    	  String data = "hello";
    	  bw.write(data);
    	  
    	  
    
     }
}
