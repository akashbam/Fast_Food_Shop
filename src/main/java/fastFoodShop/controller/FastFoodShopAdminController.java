package fastFoodShop.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import fastFoodShop.dto.Order;
import fastFoodShopBill.dao.FastFoodShopBillDao;
import fastFoodShopDB.dao.OrdersDBDao;

public class FastFoodShopAdminController {

	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		System.out.println(
				"=========================================\n         ( ADMIN )\n  \n========================================="); 
		System.out.println(
				"=========================================\n         WEL-COME TO PIZZA HOUSE \n  \n=========================================");

		
	
			System.out.println(
					"  * Please select your OPERATION-TYPE \n \n   1.ACCOUNTS \n   2.INVENTARY \n");
			int operation=scanner.nextInt();
			switch(operation)
			{
			case 1:
			{
				System.out.println("  * Please select your choise \n \n    1.SEE TODAY'S SELL");
				int choise=scanner.nextInt();
				switch(choise)
				{
				case 1:
				{
					//String date = new SimpleDateFormat("dd-MM-YYYY").format(Calendar.getInstance().getTime());
					String date = "28-09-2023";
					System.out.println(date);
					//String date="25-09-2023";
					
					OrdersDBDao dao=new OrdersDBDao();
				List<Order>orders=dao.getTodaysOrders(date);				
				
				if(!orders.isEmpty())
				{
					FastFoodShopBillDao consoleDao=new FastFoodShopBillDao();
					consoleDao.showTodaysSell(orders);
					
					System.out.println("  * Please select your choise \n \n    1.SHOW DETAILD SELL \n    2.PRINT THIS DOCUMENT");
					switch(scanner.nextInt())
					{
					case 1:
					{
						consoleDao.showDetaildSell(orders);
						break;
					}
					case 2:
					{
						
						break;
					}
					}
				}
				else
				{
					System.out.println("NO SALE TODAY !!!!!! ");
				}
				
				
					
					
					break;
				}
				}
				break;
			}
			case 2:
			{
				break;
			}
			}


	}

}
