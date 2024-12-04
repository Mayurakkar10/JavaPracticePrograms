package Deserialization;
import java.util.*;
import java.io.*;
public class DeserializationApp {
   public static void main(String[] args)throws Exception{
	   
       //read object	  
	   FileInputStream fin = new FileInputStream("D://Giri's Tech Hub//Java Language//FileHandling//buffereWritertext.txt");
	   ObjectInputStream oin  = new ObjectInputStream(fin);	   
	   
	   //set object data
//	   Employee emp1 = new Employee();
//	   emp1.setId(1);
//	   emp1.setName("Chetan");
//	   emp1.setSal(50000);

	   
	   //ReadObject
	   Employee e =(Employee)oin.readObject();
	   System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
	   
	   
	   System.out.println("Success....");
   }
}
