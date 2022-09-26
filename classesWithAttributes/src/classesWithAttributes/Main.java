package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		//Product product = new Product();
		Product product = new Product(10,"dem","des",1000,3,"siyah");
		// product.name = "Laptop";
		// product.description = "asus Laptop";
		// product.id = 1;
		//product.setId(1);
		// product.price = 5000;
		// product.stockAmount = 3;
		//product.setName("Laptop");
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
		;

	}

}
