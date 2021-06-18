package uc1002;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Getbusinessinfo {
	public Getbusinessinfo() {
		
	}
	
	public void pbusinessinfo() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "c##master";
		String pwd = "master";

		String sql = "select * from businesstable";

		Connection con = null;

		PreparedStatement pstmt = null;
		 
		 
		 try {

				Class.forName("oracle.jdbc.driver.OracleDriver");
				 System.out.println ("드라이버 로드 성공");
				con = DriverManager.getConnection(url, userid, pwd);
				System.out.println ("데이터베이스 연결 성공");
				pstmt = con.prepareStatement(sql);
				ResultSet rs=pstmt.executeQuery(sql);
				System.out.println("사업정보 출력");
		 System.out.println("PROGRAMCODE \tPROGRAMNAME \tUNITBUSINESSNAME \tUNITBUSINESSCODE \tDETAILBUSINESSCODE");
		   while(rs.next()) {
			   System.out.print(""+rs.getInt(1));
			   System.out.print("\t\t"+rs.getString(2));
			   System.out.print("\t\t"+rs.getString(3));
			   System.out.print("\t\t\t"+rs.getInt(4));
			   System.out.print("\t\t\t"+rs.getInt(5));
			   
			   System.out.println();
		   }

		   con.close();
	   } catch(Exception e) {
		     e.printStackTrace();
		}
		}
}
