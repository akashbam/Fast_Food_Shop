 package fastFoodShopDB.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import fastFoodShop.dto.Order;

public class OrdersDBDao {

	public int getOrderNo() {

		try

		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzashop", "root",
					"sky@1234");

			//PreparedStatement preparedStatement = connection.prepareStatement("select * from orders");
			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery("select * from orders");

			int lastCount = 1;
			while (resultSet.next()) {
				lastCount++;
			}
			return lastCount;

		} catch (

		ClassNotFoundException e) {
			System.err.println("SOME EXCEPTION ACCURED !");
			return -1;

		} catch (SQLException e) {
			System.err.println("SOME SQL EXCEPTION ACCURED !");
			return -1;

		}

	}

	public void saveOrder(Order order) {

		try

		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzashop", "root",
					"sky@1234");

			PreparedStatement preparedStatement = connection.prepareStatement("insert into orders values(?,?,?,?,?)");
			preparedStatement.setInt(1, order.getOrderNo());
			preparedStatement.setString(2, order.getDate());
			preparedStatement.setString(3, order.getTime());			
			preparedStatement.setString(4, order.getOrderBillName());
			preparedStatement.setDouble(5, order.getTotalBill());

			if (preparedStatement.executeUpdate() > 0) {
				System.out.println("ORDER PLACED SUCCESSFULLY !");
			}

		} catch (

		ClassNotFoundException e) {
			System.err.println("SOME EXCEPTION ACCURED !");

		} catch (SQLException e) {
			System.err.println("SOME SQL EXCEPTION ACCURED !");

		}

	}

	public List<Order> getTodaysOrders(String date) {

		

		try

		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzashop", "root",
					"sky@1234");

			PreparedStatement preparedStatement = connection.prepareStatement("select * from orders where date=?");
			preparedStatement.setString(1, date);

			ResultSet resultSet = preparedStatement.executeQuery();
			
			List<Order>list=new ArrayList<Order>();
			
			while (resultSet.next()) {
				Order order=new Order();

				order.setOrderNo(resultSet.getInt("orderno"));
				order.setDate(date);
				order.setTime(resultSet.getString("time"));
				order.setOrderBillName(resultSet.getString("orderbillname"));
				 order.setTotalBill(resultSet.getDouble("totalbill"));
				 
				 list.add(order);
			}
			return list;

		} catch (

		ClassNotFoundException e) {
			System.err.println("SOME EXCEPTION ACCURED !");

		} catch (SQLException e) {
			System.err.println("SOME SQL EXCEPTION ACCURED !");

		}
		return null;

	}
	public String getNextOrder(String date,int orderNo) {
		
		try

		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzashop", "root",
					"sky@1234");

			PreparedStatement preparedStatement = connection.prepareStatement("select orderbillname from orders where date=?");
			preparedStatement.setString(1, date);

			ResultSet resultSet = preparedStatement.executeQuery();
			
			String orderBillName="";
			int ct=0;
			
			while (resultSet.next()) {				
				
				orderBillName=resultSet.getString("orderBillName");
				ct++;
				
				if(orderNo==ct)
				{
					break;
				}
			}
			if(orderNo!=ct)
				return null;
			return orderBillName;

		} catch (

		ClassNotFoundException e) {
			System.err.println("SOME EXCEPTION ACCURED !");

		} catch (SQLException e) {
			System.err.println("SOME SQL EXCEPTION ACCURED !");

		}
		return null;
		
		
	}
	public int getTodaysOrderCount(String date) {
		
		try

		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzashop", "root",
					"sky@1234");

			PreparedStatement preparedStatement = connection.prepareStatement("select * from orders where date=?");
			preparedStatement.setString(1,date);

			ResultSet resultSet = preparedStatement.executeQuery();
			
			
			int ct=1;
			
			while (resultSet.next()) {					
				
				ct++;
			}
			return ct;

		} catch (

		ClassNotFoundException e) {
			System.err.println("SOME EXCEPTION ACCURED !");

		} catch (SQLException e) {
			System.err.println("SOME SQL EXCEPTION ACCURED !");

		}
		return 0;
		
	}

}
