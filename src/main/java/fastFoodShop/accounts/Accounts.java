package fastFoodShop.accounts;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import fastFoodShop.dto.Burger;
import fastFoodShop.dto.Coke;
import fastFoodShop.dto.ExtraToppings;
import fastFoodShop.dto.FingerChips;
import fastFoodShop.dto.Order;
import fastFoodShop.dto.Pizza;
import fastFoodShopDB.dao.CokeDBDao;
import fastFoodShopDB.dao.OrdersDBDao;

public class Accounts {

	public Order createOrderBill(int orderNo, List<Object> orderList) throws IOException {

		CokeDBDao pizzaShopDataBaseCockDao = new CokeDBDao();
		Order order = new Order();
		OrdersDBDao pizzaShopDataBaseOrdersDao = new OrdersDBDao();

		String orderBillName = "Invoice -" + String.valueOf(orderNo) + ".txt";
		String billNo="Invoice -" + String.valueOf(orderNo);
		File newFile = new File("C:\\Users\\akash\\OneDrive\\Desktop\\PizzaShopBillings2", orderBillName);

		if (newFile.createNewFile()) {
			String date = "";
			String time = "";
			double total = 0;

			try {

				FileWriter fileWriter = new FileWriter(
						"C:\\Users\\akash\\OneDrive\\Desktop\\PizzaShopBillings2\\" + orderBillName);

				date = new SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().getTime());
				time = new SimpleDateFormat("hh:mm:ss").format(Calendar.getInstance().getTime());

				String doubleLine = "=======================================================================";
				String shopName = "                            SKY FOOD CONNER                            ";
				String doubleLine2 = "=======================================================================";
				String nL = "";
				String addLine1 = "                       789, Goodluck Chowk,76-5";
				String addLine2 = "                        Deccan Gymkhana, pune";
				String nL2 = "";
				String gstNo = "                        GST NO :- FOODCONNER1234";
				String nl3 = "";
				String email = "                      EMAIL ID :-sky@gmail.com";
				String mob = "                    Mob:-9999999999 / 88888888888";
				String nL4 = "";
				String dateAndTime = "    Date & Time :-" + date+"  "+ time + "   Bill No:-" + billNo;
				String yOIQ = "    your oder in queue=*Upcomming Feature*";
				String tokeNo = "    TOKEN NO :-*Upcomming Feature* ";
				String nL5 = "";
				String doubleLine3 = "=======================================================================";
				String menuHeading = "   ITEMS                  UNIT         QTY      RATE      AMOUNT   ";
				String doubleLine4 = "=======================================================================";
//					                    "  "+FOUR CHEESE PIZZA+"  "+unit+"      "+qty+"  "+rate+"  "+amount
//					fileWriter.write(   "-----------------------------------------------------------------------");
//					fileWriter.write(   "                                                TOTAL   :-"+total);
//					fileWriter.write(   "=======================================================================");
//					fileWriter.write(   "");
//					fileWriter.write(   "                       Thank You ! Visit Again !");

				fileWriter.write("\n" + doubleLine);
				fileWriter.write("\n" + shopName);
				fileWriter.write("\n" + doubleLine2);
				fileWriter.write("\n" + nL);
				fileWriter.write("\n" + addLine1);
				fileWriter.write("\n" + addLine2);
				fileWriter.write("\n" + nL2);
				fileWriter.write("\n" + gstNo);
				fileWriter.write("\n" + nl3);
				fileWriter.write("\n" + email);
				fileWriter.write("\n" + mob);
				fileWriter.write("\n" + nL4);
				fileWriter.write("\n" + dateAndTime);
				fileWriter.write("\n" + yOIQ);
				fileWriter.write("\n" + tokeNo);
				fileWriter.write("\n" + nL5);
				fileWriter.write("\n" + doubleLine3);
				fileWriter.write("\n" + menuHeading);
				fileWriter.write("\n" + doubleLine4);

				// String yourOrderInQueue="";
				// String tokenNo="";

				for (Object item : orderList) {

					if (item instanceof Pizza) {
						Pizza pizza = (Pizza) item;

						String name = pizza.getName();
						int qty = pizza.getQty();
						String unit = pizza.getUnit();
						double rate = pizza.getPrice();
						double amount = qty * rate;
						total += amount;

						fileWriter.write("\n" + "  " + name + "        " + unit + "         " + qty + "       " + rate
								+ "     " + amount);

						fileWriter.write(
								"\n" + "-----------------------------------------------------------------------");

					} else if (item instanceof Burger) {
						Burger burger = (Burger) item;

						String name = burger.getName();
						int qty = burger.getQty();
						String unit = burger.getUnit();
						double rate = burger.getPrice();
						double amount = qty * rate;
						total += amount;

						fileWriter.write("\n" + "  " + name + "        " + unit + "         " + qty + "       " + rate
								+ "     " + amount);
						fileWriter.write(
								"\n" + "-----------------------------------------------------------------------");
					} else if (item instanceof ExtraToppings) {
						ExtraToppings extraToppings = (ExtraToppings) item;

						String name = extraToppings.getName();
						int qty = extraToppings.getQty();
						double rate = extraToppings.getPrice();
						double amount = qty * rate;
						total += amount;

						fileWriter.write("\n" + "  " + name + "         -            " + qty + "       " + rate
								+ "      " + amount);
						fileWriter.write(
								"\n" + "-----------------------------------------------------------------------");

					} else if (item instanceof Coke) {
						Coke cock = (Coke) item;

						int id = cock.getId();
						String name = cock.getName();
						int qty = cock.getQty();

						String unit = cock.getUnit();
						double rate = cock.getPrice();
						double amount = qty * rate;
						total += amount;

						pizzaShopDataBaseCockDao.cockSold(qty, id);

						fileWriter.write("\n" + "  " + name + "        " + unit + "        " + qty + "       " + rate
								+ "     " + amount);
						fileWriter.write(
								"\n" + "-----------------------------------------------------------------------");

					} else if (item instanceof FingerChips) {
						FingerChips fingerChips = (FingerChips) item;

						String name = fingerChips.getName();
						int qty = fingerChips.getQty();
						String unit = fingerChips.getUnit();
						double rate = fingerChips.getPrice();
						double amount = qty * rate;
						total += amount;

						fileWriter.write("\n" + "  " + name + "        " + unit + "          " + qty + "       " + rate
								+ "     " + amount);
						fileWriter.write(
								"\n" + "-----------------------------------------------------------------------");
					}
				}
				fileWriter.write("\n" + "                                                TOTAL   :-" + total);
				fileWriter.write("\n" + "=======================================================================");
				fileWriter.write("\n" + "");
				fileWriter.write("\n" + "                       Thank You ! Visit Again !");
				fileWriter.close();

				order.setOrderNo(orderNo);
				order.setOrderBillName(orderBillName);
				order.setDate(date);
				order.setTime(time);
				order.setTotalBill(total);

				pizzaShopDataBaseOrdersDao.saveOrder(order);

			} catch (IOException e) {

				e.printStackTrace();
			}

			return order;
		}
		return order;
	}

	
}
