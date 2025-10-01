package repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Transaction;
import server.DatabaseConnection;

public class Repository {

	public List<Transaction> getAllTransaction() {
		List<Transaction> list = new ArrayList<>();
		try {
			Connection con = DatabaseConnection.getInstance().getConnection();
			Statement st = con.createStatement();
			ResultSet result = st.executeQuery("SELECT * FROM transaction");

			while (result.next()) {
				list.add(new Transaction(result.getInt("id"), result.getString("productID"),
						result.getString("productName"), result.getString("amount"), result.getString("customerName"),
						result.getInt("status"), result.getString("transactionDate"), result.getString("createBy"),
						result.getString("createOn")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
