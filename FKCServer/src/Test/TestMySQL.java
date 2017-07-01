package Test;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSetImpl;
import com.mysql.jdbc.Statement;

public class TestMySQL {
	
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/fkc?useUnicode=true&characterEncoding=utf-8&useSSL=false";
		String sqlusername = "root";
		String sqlpassword = "1605155603";
		java.sql.Connection conn = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("加载驱动成功");  
			conn = DriverManager.getConnection(url,sqlusername,sqlpassword);
			java.sql.Statement stmt = conn.createStatement();
			String sql = "select * from login";	
			ResultSet rs = stmt.executeQuery(sql);
			String Account[];
			String password[];
			while(rs.next()){
				
				System.out.println();
				
			}
		}catch (ClassNotFoundException e) {
			System.out.println("找不到驱动程序类 ，加载驱动失败！");   
		    e.printStackTrace() ; 
		}catch(SQLException e){
			System.out.println("连接数据库失败！");   
		    e.printStackTrace() ; 
		}finally {
			conn.close();
		}
	}
		
}
