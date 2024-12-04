package com.LinekedListAssignment;
import java.util.*;
public class StateApp {
    public static void main(String[] args) {
    	LinkedList lk = new LinkedList();
    	
    	
    	do {
    	System.out.println("\n1.Add new State: ");
    	System.out.println("\n2.View States");
    	System.out.println("\n3.Search State by name");
    	System.out.println("\n4.Delete State by name");
    	Scanner sc = new Scanner(System.in);
    	System.out.println("\nEnter choice: ");
    	int choice = sc.nextInt();
    	switch(choice) {
    	case 1: System.out.println("\nEnter id, name ");
    	        int id = sc.nextInt();
    	        String name = sc.next();
    	        State s1 = new State(id,name);
    	        lk.add(s1);
    	        break;
    	case 2: for(Object obj: lk) {
    		     State s =(State) obj;
    		     System.out.println(s.getId()+" "+s.getName());
    	        }
    	        break;
    	case 3: System.out.println("\nEnter search state: ");
    	        String state = sc.next();
    	        boolean flag = false;
    	        for(Object obj: lk) {
    	        	
    	        	State s2 = (State)obj;
    	        	if(state.compareTo(s2.getName())==0) {
    	        		flag = true;
    	        	}
    	        }
    	        if(flag == true) {
	        		System.out.println("State found");
	        	}
	        	else
	        	{
	        		System.out.println("State not found");
	        	}
    	        break;
    	case 4:  System.out.println("\nEnter state to delete: ");
    	         String deleteState = sc.next();
    	         boolean flag1 = false;
    		      for(Object obj: lk) {
    		       State s3 = (State)obj;
    		        if(deleteState.compareToIgnoreCase(s3.getName())==0) {
    		           	lk.remove(obj);
    		           	System.out.println("State Deleted....");
    		        	flag1 = true;
    		        }
    	         }
    		     if(flag1!=true) {
    		    	 System.out.println("State not found");
    		     }
    	         break;
    	}
    	 System.out.println("list is: ");
    	 for(Object obj:lk) {
    		 State s = (State)obj;
    		 System.out.println(s.getId()+" "+s.getName());
    	 }
    	 
    	}while(true);
    
     
    	
    }
}
