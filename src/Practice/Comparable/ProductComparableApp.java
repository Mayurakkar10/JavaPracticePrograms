package Practice.Comparable;
import java.util.*;
public class ProductComparableApp {
   public static void main(String[] args) {
	   ArrayList al = new ArrayList();
	   Scanner sc =new Scanner(System.in);
	   al.add(new Product(1,"product1",20000));
	   al.add(new Product(4,"product2",10000));
	   al.add(new Product(2,"product3",50000));
	   al.add(new Product(3,"product4",70000));
	   
	   System.out.println("\nBefore sorting: ");
	   String s1 = al.toString();
	   System.out.println(s1);	   
	   Collections.sort(al);
	   
	   System.out.println("\nAfter Sorting");
	   String s2 = al.toString();
	   System.out.println(s2);
   }
}
