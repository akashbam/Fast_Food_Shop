package fastFoodShopBill.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import fastFoodShop.dto.Burger;
import fastFoodShop.dto.Coke;
import fastFoodShop.dto.ExtraToppings;
import fastFoodShop.dto.FingerChips;
import fastFoodShop.dto.Order;
import fastFoodShop.dto.Pizza;

public class FastFoodShopBillDao {

	public double showOrderAndReturnTotalAmount(List<Object> orderList) {

		System.out.println("=======================================================================");
		System.out.println("   ITEMS                  UNIT         QTY      RATE      AMOUNT   ");
		System.out.println("=======================================================================");
		double total = 0;

		for (Object item : orderList) {

			if (item instanceof Pizza) {
				Pizza pizza = (Pizza) item;

				String name = pizza.getName();
				int qty = pizza.getQty();
				String unit = pizza.getUnit();
				double rate = pizza.getPrice();
				double amount = qty * rate;
				total += amount;

				System.out.println("  " + name + "        " + unit + "         " + qty + "       " + rate + "     " + amount);

				System.out.println("-----------------------------------------------------------------------");

			} else if (item instanceof Burger) {
				Burger burger = (Burger) item;

				String name = burger.getName();
				int qty = burger.getQty();
				String unit = burger.getUnit();
				double rate = burger.getPrice();
				double amount = qty * rate;
				total += amount;

				System.out.println("  " + name + "        " + unit + "         " + qty + "       " + rate + "     " + amount);

				System.out.println("-----------------------------------------------------------------------");
			} else if (item instanceof ExtraToppings) {
				ExtraToppings extraToppings = (ExtraToppings) item;

				String name = extraToppings.getName();
				int qty = extraToppings.getQty();
				double rate = extraToppings.getPrice();
				double amount = qty * rate;
				total += amount;

				System.out.println("  " + name + "         -            " + qty + "       " + rate + "      " + amount);

				System.out.println("-----------------------------------------------------------------------");

			} else if (item instanceof Coke) {
				Coke cock = (Coke) item;

				String name = cock.getName();
				int qty = cock.getQty();
				String unit = cock.getUnit();
				double rate = cock.getPrice();
				double amount = qty * rate;
				total += amount;

				System.out.println("  " + name + "        " + unit + "        " + qty + "       " + rate + "     " + amount);

				System.out.println("-----------------------------------------------------------------------");

			} else if (item instanceof FingerChips) {
				FingerChips fingerChips = (FingerChips) item;

				String name = fingerChips.getName();
				int qty = fingerChips.getQty();
				String unit = fingerChips.getUnit();
				double rate = fingerChips.getPrice();
				double amount = qty * rate;
				total += amount;

				System.out.println("  " + name + "        " + unit + "          " + qty + "       " + rate + "     " + amount);

				System.out.println("-----------------------------------------------------------------------");
			}
		}
		System.out.println("                                                TOTAL   :-" + total);
		System.out.println("=======================================================================");
		
		return total;
		

	}
	public void showTodaysSell(List<Order>orders) {
		
		System.out.println("========================================================================");
		System.out.println("   OR.NO  DATE            TIME        ORDER BILL NAME          AMOUNT   ");
		System.out.println("========================================================================");
	  //System.out.println("   "+orderNo+"      "+date+"      "+TIME"    "+orderBillName+"           "+totalBill);
	  //System.out.println("                                                                TOTAL  = "+total);
		
		double total = 0;
		for(Order order:orders)
		{
			int orderNo=order.getOrderNo();
			String date=order.getDate();
			String time=order.getTime();
			String orderBillName=order.getOrderBillName();
			double totalBill=order.getTotalBill();
			total+=totalBill;
			
			System.out.println("   "+orderNo+"      "+date+"      "+time+"    "+orderBillName+"           "+totalBill);
						
			
		}
		System.out.println("========================================================================");
		System.out.println("                                                      TOTAL  = "+total);
		System.out.println("========================================================================");
	}
	public void showDetaildSell(List<Order>orders) throws IOException {
		
		for(Order order:orders)
		{
			String orderBillName=order.getOrderBillName();
			
			File folder=new File("C:\\Users\\akash\\OneDrive\\Desktop","PizzaShopBillings2");
			String[]fileNames= folder.list();
			
			boolean gotFile=false;
			for(String fileName:fileNames)
			{
				
				if(fileName.equalsIgnoreCase(orderBillName))
				{
					File file=new File("C:\\Users\\akash\\OneDrive\\Desktop\\PizzaShopBillings2",fileName);
					
					gotFile=true;
					
					System.out.println(file);
					
					BufferedReader fileReader=	new BufferedReader(new FileReader(file));
					
					String line="";
					while((line=fileReader.readLine())!=null)
					{
						System.out.println(line);
						
					}
					System.out.println("\n =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= \n");
					fileReader.close();
					
				}
			}
			if(!gotFile)
			{
				System.err.println("This File is missing in FOLDER ="+orderBillName);
			}
			
			
		}
		
	}

}
