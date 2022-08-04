package p1;

public class Product {

	private String productName;
	private int cost;
	private String category;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String productName, int cost, String category) {
		super();
		this.productName = productName;
		this.cost = cost;
		this.category = category;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
