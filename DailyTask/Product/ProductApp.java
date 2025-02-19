package Product;

import java.util.*;

public class ProductApp {
	public static void main(String[] x) {
		ArrayList<Product> al = new ArrayList<Product>();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("=================ProductApp==============");
			System.out.println("\n1.Add Product");
			System.out.println("2.Display product in specific category");
			System.out.println("3.Find the product with highest stock ");
			System.out.println("\nEnter your choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("==========================================");
				System.out.println("\nEnter id,name,price,quantity of product");
				int id = sc.nextInt();
				String name = sc.next();
				int price = sc.nextInt();
				int quantity = sc.nextInt();
				al.add(new Product(id, name, price, quantity));
				System.out.println("\nAdded successfully..");
				break;
			case 2:
				System.out.println("==========================================");
				System.out.println("|Id|Name|Price|quantity|");
				for (Product p : al) {
					System.out.println(
							"|" + p.getId() + "|" + p.getName() + "|" + p.getPrice() + "|" + p.getQuantity() + "|");
				}
				break;
			case 3:
				if (al.isEmpty() == true) {
					System.out.println("no record found");
				} else {
					Product maxStock = al.get(0);
					for (Product product : al) {
						if (product.getQuantity() > maxStock.getQuantity()) {
							maxStock = product;
						}
					}

					System.out.println("\nProduct with highest stock is: ");
					System.out.println("|" + maxStock.getId() + "|" + maxStock.getName() + "|" + maxStock.getPrice()
							+ "|" + maxStock.getQuantity() + "|");
				}
				// using optional class
//				Optional<Product> p=al.stream().max(Comparator.comparingInt(a-> a.getQuantity()));
//
//				if(p.isPresent())
//				{
//					System.out.println(p.get());
//				}
//				else
//				{
//					System.out.println(p);
//					System.out.println("No MAx Quantity");
//				}
			}
		} while (true);
	}
}
