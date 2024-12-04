package Serialization;
import java.util.*;
import java.io.*;
public class SerializationApp {
   public static void main(String[] args)throws Exception{
	   
	   //write object
//	   FileOutputStream fout = new FileOutputStream("D://Giri's Tech Hub//Java Language//FileHandling//buffereWritertext.txt");
//	   ObjectOutputStream oout = new ObjectOutputStream(fout);
	   
       //read object	  
	   FileInputStream fin = new FileInputStream("D://Giri's Tech Hub//Java Language//FileHandling//buffereWritertext.txt");
	   ObjectInputStream oin  = new ObjectInputStream(fin);	   
	   
	   //set object data
	   Employee emp1 = new Employee();
	   emp1.setId(1);
	   emp1.setName("Chetan");
	   emp1.setSal(50000);
	   
	   
	   //WriteObject
//	   oout.writeObject(emp1);
//	   oout.close();
	   
	   
	   //ReadObject
	   Employee e =(Employee) oin.readObject();
	   System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
	   
	   
	   
	   
	   
	   System.out.println("Success....");
   }
}
