package Practice;
import java.io.File;
public class MethodsUsedToCheckFile {
   public static void main(String[]args) {
	    File f = new File("abc.txt");
	    if(f.exists()) {
	    	System.out.println("Length of file is: "+f.length());
	    }else {
	    	System.out.println("File not found");
	    }
	    System.out.println(f.getName());
	    System.out.println(f.getAbsolutePath());
   }
}


//boolean exists() this method return true if file exists otherwise false
//length() this method  return length of the file