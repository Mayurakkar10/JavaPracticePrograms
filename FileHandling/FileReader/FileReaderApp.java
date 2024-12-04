package FileReader;
import java.util.*;
import java.io.*;
public class FileReaderApp {
    public static void main(String[] args)throws Exception{
    	FileReader fr = new FileReader("D://Giri's Tech Hub//Java Language//FileHandling//buffereWritertext.txt");
        int data;
        
        while((data=fr.read())!=-1) {
        	System.out.print((char)data);
        	Thread.sleep(100);
        }
    }
}
