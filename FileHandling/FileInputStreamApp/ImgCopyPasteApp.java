package FileInputStreamApp;
import java.util.*;
import java.io.*;
public class ImgCopyPasteApp {
   public static void main(String[] args)throws Exception{
	   FileInputStream fin = new FileInputStream("D://Giri's Tech Hub//Java Language//FileHandling//officeback.jpg");
	   FileOutputStream fout = new FileOutputStream("D://Giri's Tech Hub//Java Language//FileHandling//image//officeback.jpg");
	   int data;
	   while((data=fin.read())!=1) {
		  fout.write(data);   
	   }
	   fout.close();
	   fin.close();
	   System.out.println("File Saved Successfully...");
   }
}
