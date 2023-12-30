package fastFoodShopDB.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CokeDBDao {

	public boolean is500mlCockAvailable() {

		try

		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzashop", "root",
					"sky@1234");

			PreparedStatement preparedStatement = connection.prepareStatement("select * from cokestore where id=1");

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				int qty = resultSet.getInt("qty");
				if (qty > 0)
					return true;
			} else {
				return false;
			}
			return false;

		} catch (

		ClassNotFoundException e) {
			System.err.println("SOME EXCEPTION ACCURED !");
			return false;
		} catch (SQLException e) {
			System.err.println("SOME SQL EXCEPTION ACCURED !");
			return false;
		}
	}

	public boolean is1000mlCockAvailable() {

		try

		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzashop", "root",
					"sky@1234");

			PreparedStatement preparedStatement = connection.prepareStatement("select * from cokestore where id=2");

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				int qty = resultSet.getInt("qty");
				if (qty > 0)
					return true;
			} else {
				return false;
			}
			return false;

		} catch (

		ClassNotFoundException e) {
			System.err.println("SOME EXCEPTION ACCURED !");
			return false;
		} catch (SQLException e) {
			System.err.println("SOME SQL EXCEPTION ACCURED !");
			return false;
		}
	}

	public boolean isCockAvailable() {

		if (is1000mlCockAvailable() || is500mlCockAvailable())
			return true;

		else
			return false;
	}
	public int getCockQty(int cokeId) {
		try

		{
			int count=0;
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzashop", "root",
					"sky@1234");

			PreparedStatement preparedStatement = connection.prepareStatement("select * from cokestore where id=?");
			preparedStatement.setInt(1, cokeId);
			
			ResultSet resultSet= preparedStatement.executeQuery();
			if(resultSet.next())
			{
				count=resultSet.getInt("qty");
			}
			
			connection.close();
			
			return count;

		} catch (

		ClassNotFoundException e) {
			System.err.println("SOME EXCEPTION ACCURED !");


		} catch (SQLException e) {
			System.err.println("SOME SQL EXCEPTION ACCURED !");

		}
		return -1;
	}

	public void cockSold(int soldCount, int cokeId) {
		
		int availableCoke =(getCockQty(cokeId)-soldCount);
		System.err.println(availableCoke);
		

		try

		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzashop", "root",
					"sky@1234");

			PreparedStatement preparedStatement = connection.prepareStatement("update cokestore set qty=? where id=?");
			preparedStatement.setInt(1, availableCoke);
			preparedStatement.setInt(2, cokeId);
			preparedStatement.execute();

		} catch (

		ClassNotFoundException e) {
			System.err.println("SOME EXCEPTION ACCURED !");

		} catch (SQLException e) {
			System.err.println("SOME SQL EXCEPTION ACCURED !");

		}

	}
	
	

}
