
public class Product {
	private int prodId;
	private String prodName;
	private int prodPrice;
	private int prodQuant;
	
	
	public Product(int prodId, String prodName, int prodPrice, int prodQuant) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodQuant = prodQuant;
	}
	
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}
	public int getProdQuant() {
		return prodQuant;
	}
	public void setProdQuant(int prodQuant) {
		this.prodQuant = prodQuant;
	}
	
	
}
