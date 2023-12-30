package fastFoodShop.dto;

public class Burger {
	
	private String name;
	private String unit;
	private int qty;
	private double price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Burger [name=" + name + ", unit=" + unit + ", qty=" + qty + ", price=" + price + "]";
	}
	
	
	
	
	

}
