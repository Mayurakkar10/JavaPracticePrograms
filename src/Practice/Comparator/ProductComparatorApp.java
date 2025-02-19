package Practice.Comparator;
import java.util.*;
public class ProductComparatorApp {
     public static void main(String[] args) {
    	 ArrayList<Product> al = new ArrayList<Product>();
    	 Scanner sc = new Scanner(System.in);
    	 al.add(new Product(2,"iphone",100000));
    	 al.add(new Product(4,"earphone",500));
    	 al.add(new Product(1,"phone",10000));
    	 al.add(new Product(3,"laptop",50000));
    	 
    	 
    	 System.out.println("\nBefore sort list is: ");
    	 for(Product p:al) {
    		 System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice());
    	 }
    	 
    	 System.out.println("1.SortProductById");
    	 System.out.println("2.SortProductByName");
    	 System.out.println("3.SortProductByPrice");
    	 System.out.println("\nEnter choice");
    	 int choice = sc.nextInt();
    	 
    	 switch(choice) {
    	 case 1: SortById sid = new SortById();
    	         Collections.sort(al,sid);
    	         break;
    	 case 2: SortByName sname = new SortByName();
         		 Collections.sort(al,sname);
         		 break;
    	 case 3: SortByPrice sprice = new SortByPrice();
         		 Collections.sort(al,sprice);
         		 break;
         		 
    	   
    	 }
    	 
    	 System.out.println("\nAfter sort list is: ");
    	 for(Product p:al) {
    		 System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice());
    	 }
    	 
     }
}
