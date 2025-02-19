package Practice;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class ReadingBinaryFiles {
  public static void main(String[] args)throws Exception{
	    FileInputStream input = new FileInputStream("professional-portfolio.png");
	    FileOutputStream output = new FileOutputStream("copy.png");
	    int data;
	    while((data=input.read())!=-1) {
	    	 output.write(data);
	    }
	    input.close();
	    output.close();
  }
}
