package fastFoodShop.dto;

public class Order {
	
	private int orderNo;
	private String date;
	private String time;
	private String orderBillName;	
	private double totalBill;
	
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getOrderBillName() {
		return orderBillName;
	}
	public void setOrderBillName(String orderBillName) {
		this.orderBillName = orderBillName;
	}
	public double getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}
	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", date=" + date + ", time=" + time + ", orderBillName=" + orderBillName
				+ ", totalBill=" + totalBill + "]";
	}
	
	
	
	
	
	
	
	

}
