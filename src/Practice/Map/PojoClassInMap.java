package Practice.Map;

import java.util.*;

class Employee {
	private int id;
	private String name;
	private int salary;

	Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

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

}

public class PojoClassInMap {
   public static void main(String[] args) {
	    LinkedHashMap<String,ArrayList<Employee>> lmap = new LinkedHashMap<>();
	    
	    ArrayList<Employee> wipro = new ArrayList();
	    wipro.add(new Employee(1,"mukesh",20000));
	    wipro.add(new Employee(2,"raja",30000));
	    
	    ArrayList<Employee> tcs = new ArrayList();
	    tcs.add(new Employee(1,"mahesh",50000));
	    tcs.add(new Employee(2,"vishal",30000));
	    
	    lmap.put("wipro",wipro);
	    lmap.put("tcs", tcs);
	    
	    Set<Map.Entry<String, ArrayList<Employee>>> aset = lmap.entrySet();
	    for(Map.Entry<String, ArrayList<Employee>> me:lmap.entrySet()) {
	    	  System.out.println("========="+me.getKey()+"========");
	    	  
	    	  ArrayList<Employee> al = me.getValue();
	    	  for(Employee emp: al) {
	    		  System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary());
	    	  }
	    }
	    
	    
	    
   }
}
