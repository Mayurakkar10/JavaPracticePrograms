package FileReader;
import java.util.*;
import java.io.*;

public class BufferedReaderApp {
   public static void main(String[] args)throws Exception{
	   FileReader fr = new FileReader("D://Giri's Tech Hub//Java Language//FileHandling//buffereWritertext.txt");
       BufferedReader br = new BufferedReader(fr);
       String data;
       
       while((data = br.readLine())!=null) {
    	   System.out.println(data);
    	   Thread.sleep(1000);
       }
       
   }
}
