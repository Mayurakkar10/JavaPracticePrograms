package FileOutputStream;
import java.util.*;
import java.io.*;
public class FileInputStreamApp {
     public static void main(String[] args)throws Exception {
    	 FileOutputStream fo = new FileOutputStream("D://Giri's Tech Hub//Java Language//FileHandling//buffereWritertext.txt");
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("\nEnter text: ");
    	 String data = sc.nextLine();
    	 byte b[] = data.getBytes();
    	 fo.write(b);
    	 fo.close();
    	 System.out.println("Data Added....");
    	 
     }
}
