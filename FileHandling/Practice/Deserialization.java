package Practice;
import java.io.*;
public class Deserialization {
     public static void main(String[] args)throws Exception{
    	  FileInputStream input = new FileInputStream("serialization.ser");
    	  ObjectInputStream oin = new ObjectInputStream(input);
    	  Student student = (Student)oin.readObject();
    	  oin.close();
    	  input.close();
    	  System.out.println("Object has been deseralized");
    	  System.out.println("Name: "+student.name);
    	  System.out.println("Age: "+student.age);
    	  System.out.println("Password: "+student.password);
     }
}
