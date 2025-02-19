package Practice;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class WriteInAFile {
    public static void main(String[] args)throws Exception {
    	  File f = new File("abc.txt");
          FileWriter fw = new FileWriter(f,true);
          BufferedWriter bw = new BufferedWriter(fw);
          bw.write("this is text using bufferdWrietr");
          bw.write("This is more text");
          bw.close();
          System.out.println("File Written successfulyy...");
    }
}
