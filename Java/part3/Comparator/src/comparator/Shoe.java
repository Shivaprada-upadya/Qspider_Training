package comparator;

public class Shoe {

	int id;
	String name;
	double price;
	
	
	public Shoe(int id, String name, double price) {
		//super();
		this.id = id;
		this.name = name;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Shoe [id=" + id + ", name=" + name + ", price=" + price + "\n";
	}
		
	

}
