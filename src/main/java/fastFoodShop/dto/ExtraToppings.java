package fastFoodShop.dto;

public class ExtraToppings {
	
	private  String name;
	private double price;
	private int qty;
	private double totalPrice;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "ExtraToppings [name=" + name + ", price=" + price + ", qty=" + qty + ", totalPrice=" + totalPrice + "]";
	}
	
	
	
	

}
