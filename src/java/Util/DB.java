package Util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    
    	private static final String URL = "jdbc:mysql://localhost:3306/BibliotecaHeraldo";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "holaola9861";
	
	public static Connection getConnection() throws SQLException{
		try {
                    Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {

                }
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}

}
