package uc1001;

import java.sql.*;

public class Budget_insert {
	String mn;
	Integer mc;
	String en;
	Integer ec;
	Integer ea;
	String an;
	Integer ac;
	Integer aa;
	String fn;
	Integer fc;
	public Budget_insert(String mn, Integer mc, String en, Integer ec, Integer ea, String an, Integer ac, Integer aa,
			String fn, Integer fc) {
		
		this.mn = mn;
		this.mc = mc;
		this.en = en;
		this.ec = ec;
		this.ea = ea;
		this.an = an;
		this.ac = ac;
		this.aa = aa;
		this.fn = fn;
		this.fc = fc;
	}
	
	public void insertMethod() {		

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid="c##master"; 
		String pwd="master";
		
		String sql = "INSERT INTO BUGETTABLE(EXPITEMCODE,MINISTRYNAME,MINISTRYCODE,EXPITEMNAME,EXPITEMAMOUNT,ANNUALEXPNAME,ANNUALEXPCODE,ANNUALEXPAMOUNT,FIELDNAME,FIELDCODE) VALUES(?,?,?,?,?,?,?,?,?,?)";			

		Connection con = null;

		PreparedStatement pstmt = null;

		

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			 System.out.println ("드라이버 로드 성공");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println ("데이터베이스 연결 성공");
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, ec);

			pstmt.setString(2, mn);

			pstmt.setInt(3, mc);

			pstmt.setString(4, en);
			
			pstmt.setInt(5, ea);
			
			pstmt.setString(6, an);
			
			pstmt.setInt(7, ac);
			
			pstmt.setInt(8, aa);
			
			pstmt.setString(9, fn);
			
			pstmt.setInt(10, fc);
			
			int cnt = pstmt.executeUpdate(); 

			System.out.println(cnt + "건이 실행되었습니다.");			

		}

		catch (Exception e) {System.out.println(e.getMessage());}

		finally {

			try {

				pstmt.close();

				con.close();

			} catch (Exception e) {

			}

		}

	}

}
