package github.nguyentan1708;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ConnectionMySQL {
	private static String DB_URL="jdbc:mysql://localhost:3306/qlsv";
	private static String USER_NAME="root";
	private static String PASSWORD="17081998";
	private static Connection getConnection(String db,String user,String pass) {
		Connection conn=null;
		try {
			conn= DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
			System.out.println("Kết nối MySQL thành công");
		} catch (SQLException se) {
			System.out.println("Kết nối MySQL thất bại");
			se.printStackTrace();
		}
		return conn;
	}
	public static void insertIntoMySQL(String string) {
		try {
			Connection conn=getConnection(DB_URL, USER_NAME, PASSWORD);
			Statement stmt=conn.createStatement();
			stmt.executeUpdate(string);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void selectFromMySQL(String string) {
		try {
			Connection conn=getConnection(DB_URL, USER_NAME, PASSWORD);
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(string);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
