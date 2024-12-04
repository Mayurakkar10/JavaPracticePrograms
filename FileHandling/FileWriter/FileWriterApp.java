package FileWriter;
import java.util.*;
import java.io.*;
public class FileWriterApp {
   public static void main(String[] args)throws IOException {
	   FileWriter fw  =new FileWriter("D://Giri's Tech Hub//Java Language//FileHandling//newText.txt",true);
	   Scanner sc = new Scanner(System.in);
	   System.out.println("\nEnter text: ");
	   String data = sc.nextLine();
	   fw.write(data);
	   System.out.println("Data Added....");
	   fw.close();
   }
}
