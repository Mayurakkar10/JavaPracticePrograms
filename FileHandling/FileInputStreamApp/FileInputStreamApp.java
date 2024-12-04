package FileInputStreamApp;
import java.util.*;
import java.io.*;
public class FileInputStreamApp {
      public static void main(String[] args)throws Exception{
    	  FileInputStream fi = new FileInputStream("D://Giri's Tech Hub//Java Language//FileHandling//buffereWritertext.txt");
    	  int data;
    	  
    	  while((data = fi.read())!=-1) {
    		  System.out.print((char)data);
    	  }
      }
}
