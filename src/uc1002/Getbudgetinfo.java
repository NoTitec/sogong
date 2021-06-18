package uc1002;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Getbudgetinfo {
	public Getbudgetinfo() {

	}

	public void pbudgetinfo() {
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "c##master";
	String pwd = "master";

	String sql = "select * from bugettable";

	Connection con = null;

	PreparedStatement pstmt = null;
	 
	 
	 try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			 System.out.println ("드라이버 로드 성공");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println ("데이터베이스 연결 성공");
			pstmt = con.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery(sql);
			System.out.println("예산정보 출력");
	 System.out.println("EXPITEMCODE \tPROGRAMCODE \tMINISTRYNAME \tMINISTRYCODE \tEXPITENAME \tEXPITEMAMOUNT \tANNUALEXPNAME \tANNUALEXPCODE \tANNUALEXPAMOUNT \tFIELDNAME \tFIELDCODE \tTOTALBUDGET \tCURORGBUDGETAMOUNT");
	   while(rs.next()) {
		   System.out.print(rs.getInt(1));
		   System.out.print("\t\t"+rs.getInt(2));
		   System.out.print("\t\t"+rs.getString(3));
		   System.out.print("\t\t"+rs.getInt(4));
		   System.out.print("\t\t"+rs.getString(5));
		   System.out.print("\t\t"+rs.getInt(6));
		   System.out.print("\t\t"+rs.getString(7));
		   System.out.print("\t\t"+rs.getInt(8));
		   System.out.print("\t\t"+rs.getInt(9));
		   System.out.print("\t\t"+rs.getString(10));
		   System.out.print("\t\t"+rs.getInt(11));
		   System.out.print("\t\t"+rs.getInt(12));
		   System.out.println("\t"+rs.getString(13));
		   System.out.println();
	   }

	   
   } catch(Exception e) {
	     e.printStackTrace();
	}
	}
}