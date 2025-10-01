package server;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection connection;
  
    private final String url = "jdbc:mysql://localhost:3306/technical_assesment";
    private final String user = "root";
    private final String password = "";

    private DatabaseConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DatabaseConnection getInstance() {
    	try {
    		if (instance == null) {
    			instance = new DatabaseConnection();
    		}
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
