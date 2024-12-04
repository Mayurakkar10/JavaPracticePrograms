package Product;

public class Product {
     private int id;
     private String name;
     private int price;
     private String expDate;
     
     Product(int id,String name,int price,String expDate){
    	 this.id = id;
    	 this.name = name;
    	 this.price=price;
    	 this.expDate=expDate;
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
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
     
  
}
