package Practice;
import java.io.*;
class Student implements Serializable {
	String name;
	int age;
	transient String password;
	public Student(String name, int age, String password) {
		this.name = name;
		this.age = age;
		this.password = password;
	}
}
public class Serialization {
	public static void main(String[] args) throws Exception {
		Student student = new Student("hero", 22, "hero@123");
		FileOutputStream output = new FileOutputStream("serialization.ser");
		ObjectOutputStream oout = new ObjectOutputStream(output);
		oout.writeObject(student);
		output.close();
		oout.close();
		System.out.println("Object has been seariazlied");
	}
}
