package Practice.Comparable;
import java.util.*;
public class Product implements Comparable{
    private int id;
    private String name;
    private int price;
    
    public Product(int id,String name,int price) {
    	this.id = id;
    	this.name = name;
    	this.price =price;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return id+" "+name+" "+price;
	}
	public int compareTo(Object o1) {
		Product p = (Product)o1;
		if(this.getId()>p.getId()) {
			return 1;
		}
		else if(this.getId()<p.getId()) {
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
