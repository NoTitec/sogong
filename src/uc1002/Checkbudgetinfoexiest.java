package uc1002;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Checkbudgetinfoexiest {
	public Checkbudgetinfoexiest(){
		
	}
	public boolean cexist() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "c##master";
		String pwd = "master";

		String sql = "select * from bugettable";

		Connection con = null;

		PreparedStatement pstmt = null;
		 ResultSet rs=null;
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection(url, userid, pwd);
			
			pstmt = con.prepareStatement(sql);
			rs= pstmt.executeQuery(sql);
			if(rs!=null) {
				return true; 
			}

			

		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		finally {

			try {

				pstmt.close();

				con.close();

			} catch (Exception e) {

			}
		}
		System.out.println("no db exiest");
		return true;
	}
}
