package ObjectClass;

class Employee{
	private int id;
	private String name;
	private int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return id+" "+name+" "+salary;
	}
	
}
public class ToStirngMethod {
    public static void main(String x[]) {
    	Employee emp1 = new Employee();
    	emp1.setId(1);
    	emp1.setName("vikas");
    	emp1.setSalary(100000);
    	String str = emp1.toString();
    	System.out.println(str);
    }
}
