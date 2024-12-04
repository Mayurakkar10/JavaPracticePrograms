package FileClass;

import java.util.*;
import java.io.*;

public class FileMkdir {
	public static void main(String[] args) throws IOException {
		File f = new File("D://Giri's Tech Hub//Java Language//FileHandling//javademo");

		boolean check = f.exists();
		if (check) {
			System.out.println("File already exists..");
		} else {
			boolean b = f.mkdir();
			if (b) {
				System.out.println("\nFile created......");
			} else {
				System.out.println("\nsome problem is there");
			}
		}
	}
}
