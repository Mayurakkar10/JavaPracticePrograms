package com.Map;
import java.util.*;
class Voter{
	private int id;
	private String name;
	private int age;
	
	public Voter() {
		
	}
	
	public Voter(int id,String name,int age) {
		this.id = id;
		this.name =name;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
public class VoterAppUsingPojoClassMap {
    public static void main(String[] args) {
    	 ArrayList<Voter> ward1 = new ArrayList();
    	 Voter v1  = new Voter(1,"Suresh",19);
    	 Voter v2  = new Voter(2,"Rakesh",20);
    	 Voter v3 =  new Voter(3,"Raja",21);
    	 ward1.add(v1);
    	 ward1.add(v2);
    	 ward1.add(v3);
    	 
    	 ArrayList<Voter> ward2 = new ArrayList();
    	 Voter v4 = new Voter(5,"Jaya",23);
    	 Voter v5 = new Voter(6,"Riya",24);
    	 Voter v6 = new Voter(7,"supriya",25);
    	 ward2.add(v4);
    	 ward2.add(v5);
    	 ward2.add(v6);
    	 
    	 LinkedHashMap<String,ArrayList<Voter>> vbooth =new  LinkedHashMap<>();
    	 vbooth.put("Ward1",ward1);
    	 vbooth.put("Ward2", ward2);
    	 
    	 Set<Map.Entry<String, ArrayList<Voter>>> entryset = vbooth.entrySet();
    	 for(Map.Entry<String, ArrayList<Voter>> ms:entryset) {
    		  String key = ms.getKey();
    		  System.out.println("\n"+key);    	 
    	      System.out.println("==============================");
    	      
    	      ArrayList<Voter> al = ms.getValue();
    	      
    	      for(Voter data: al) {
    	    	  System.out.println(data.getId()+"\t"+data.getName()+"\t"+data.getAge());
    	      }
    	 }
    	 
    	 		
    }
}
