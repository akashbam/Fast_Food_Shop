package fastFoodShop.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Queue;
import java.util.Scanner;

import fastFoodShop.dto.Order;
import fastFoodShopDB.dao.OrdersDBDao;

public class FastFoodShopKitchenController {

	public static OrdersDBDao pizzaShopDataBaseOrdersDao;

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		pizzaShopDataBaseOrdersDao = new OrdersDBDao();
		int orderNo = 0;
		while (true) {
			System.out.println(
					"Please Enter your choise....\n   1.GET NEXT ORDER \n   2.PREVIOUS ORDER\n   3.CLOSE KITCHEN ");
			int choise = scanner.nextInt();

			if (choise == 1) {
				String date = new SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().getTime());
				//String date ="28-09-2023";
				System.out.println(date);

				
				int methodValue=getNextOrder(date, (orderNo+1));
				if(methodValue==1)
				{
					orderNo++;
				}

			} else if (choise == 2) {
				if (orderNo < 1) {
					System.err.println("WRONG SERCH !");

				} else {
					String date = new SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().getTime());
					//String date ="28-09-2023";
					
					getNextOrder(date, (orderNo-1));					
						orderNo--;
				}

			} else if (choise == 3) {
				String date=new SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().getTime());
				//String date ="28-09-2023";
				int todaysOrderCount= pizzaShopDataBaseOrdersDao.getTodaysOrderCount(date);				
				
				if((todaysOrderCount-1)==orderNo)
				{
					System.err.println("APPLICATION CLOSED.... ");
					return;
				}
				else
				System.err.println("Orders Are Still Pending ., Can't Close Kitchen....");
				
			} 
			else
				System.out.println("Please Enter Valid Input ");
		}

	}

	public static int getNextOrder(String date, int orderNo) throws IOException {

		String orderBillName = pizzaShopDataBaseOrdersDao.getNextOrder(date, orderNo);
		if(orderBillName==null)
		{
			System.err.println("NO ORDER AVAILABLES !!!!");
			return -1;
		}

		File file = new File("C:\\Users\\akash\\OneDrive\\Desktop\\PizzaShopBillings2", orderBillName);

		File folder = new File("C:\\Users\\akash\\OneDrive\\Desktop\\PizzaShopBillings2");

		String[] fileNames = folder.list();

		boolean gotFile = false;

		for (String fileName : fileNames) {

			if (fileName.equalsIgnoreCase(orderBillName)) {
				gotFile = true;

				System.out.println(file);

				BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

				String line = "";
				while ((line = bufferedReader.readLine()) != null) {
					System.out.println(line);

				}
				System.out.println("\n =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= \n");

				bufferedReader.close();
				return 1;

			}
		}
		if (!gotFile) {
			System.err.println("This File is missing in FOLDER =" + orderBillName);
		}
		return 0;

	}

}
