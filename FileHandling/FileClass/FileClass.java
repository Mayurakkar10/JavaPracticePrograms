package FileClass;
import java.util.*;
import java.io.*;
public class FileClass {
   public static void main(String[] args) {
	    File f[] = File.listRoots();
	    
	    for(int i=0;i<f.length;i++) {
	    	long totalSpace=  f[i].getTotalSpace();
	    	long freeSpace = f[i].getFreeSpace();
	    	
	    	System.out.println("TotalSpace: "+totalSpace+" "+"FreeSpace: "+freeSpace);
	    }
	    
   }
}
