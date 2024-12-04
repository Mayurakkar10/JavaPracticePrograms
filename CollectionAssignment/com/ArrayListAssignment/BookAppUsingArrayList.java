package com.ArrayListAssignment;
import java.util.*;

class Book{
	int id;
	String name;
	String author;
	String publication;
	
	Book(int id,String name,String author,String publication)
	{
		this.id = id;
		this.name  = name;
		this.author =author;
		this.publication = publication;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
}

public class BookAppUsingArrayList {
    public static void main(String[] args)
    {
    	  ArrayList al  = new ArrayList();
    	  Scanner sc = new Scanner(System.in); 
    	  
    	  do {
    	  System.out.println("\n1.Add new Book");
	      System.out.println("2.View All Books");
	      System.out.println("3.Search Book by indexOf() method");
	      System.out.println("4.remove Book");
	      System.out.println("5.Replace Book");
	       
	       System.out.println("\nEnter choice: ");
	       int choice = sc.nextInt();
	       
	       switch(choice)
	       {
	       case 1:System.out.println("\nEnter id,name,author,publication: ");
	              int id = sc.nextInt();
	              String name = sc.next();
	              String author = sc.next();
	              String publication = sc.next();
	              al.add(new Book(id,name,author,publication));
	              System.out.println("\nBook Added Successfully....");
	              break;
	       case 2:
	               for(Object obj:al)
	               {
	            	   Book book = (Book)obj;
	            	   System.out.println(book.getId()+"\n"+book.getName()+"\n"+book.getAuthor()+"\n"+book.getPublication()+"\n");
	      
	               }
	               break;
	       case 3:
	    	      System.out.println("\nEneter id to search: ");
	    	      int sid  = sc.nextInt();
	    	      int findindex = al.indexOf(sid);
	    	      if(findindex != 1)
	    	      {
	    	    	  System.out.println("Book found: "+al.get(sid));
	    	      }
	    	      else
	    	      {
	    	    	  System.out.println("Book not found");
	    	      }
	    	      break;
	       case 4:
	    	     
	       }      
	       
    	   }while(true);
    }
    
}






