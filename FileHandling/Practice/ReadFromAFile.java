package Practice;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
public class ReadFromAFile {
  public static void main(String[] args)throws Exception{
	  File f = new File("abc.txt");
	  FileReader fr = new FileReader(f);
	  BufferedReader br = new BufferedReader(fr);
      String line;
	  while((line=br.readLine())!=null) {
		  System.out.print(line);
	  }
  }
}

//FileReader has method read() - it returns integer
//BufferedReader has method readLine() -it return String;