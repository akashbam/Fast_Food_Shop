package fastFoodShop.dto;

public class Coke {

	private int id;
	private String name = "COCK            ";
	private String unit;
	private double price;
	private int qty;
	private double totalPrice;
	
	
	

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

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
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
		return "Cock [id=" + id + ", name=" + name + ", unit=" + unit + ", price=" + price + ", qty=" + qty
				+ ", totalPrice=" + totalPrice + "]";
	}

	

	

}
