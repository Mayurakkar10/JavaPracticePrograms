package Practice;
import java.io.File;
import java.io.FileWriter;
public class DeleteFile {
   public static void main(String[] args)throws Exception{
	   File f = new File("new.txt");
	   FileWriter fr = new FileWriter(f);
	   fr.write("This is new file");
	   fr.close();
	   if(f.delete()) {
		   System.out.println("File is deleted");
	   }
	   else {
		   System.out.println("failed to delete file");
	   }
	   System.out.println(f.getAbsolutePath());
   }
}
