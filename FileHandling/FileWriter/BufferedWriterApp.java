package FileWriter;
import java.util.*;
import java.io.*;
public class BufferedWriterApp {
    public static void main(String[] args)throws IOException{
    	 FileWriter fw = new FileWriter("D://Giri's Tech Hub//Java Language//FileHandling//buffereWritertext.txt",true);
    	 BufferedWriter bw  = new BufferedWriter(fw);
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("\nEnter text: ");
    	 String data = sc.nextLine();
    	 bw.write(data);
    	
    	 System.out.println("Data Added....");
    	 bw.newLine();
    	 bw.close();
    	 fw.close();	 
    }
}
