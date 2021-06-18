package uc1001;
import java.sql.*;
public class Check_duplicate {
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
	Connection con;
	
	public Check_duplicate(String mn, Integer mc, String en, Integer ec, Integer ea, String an, Integer ac, Integer aa,
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
		
		 String url="jdbc:oracle:thin:@localhost:1521:xe"; 
		   String userid="c##master"; /* 12버전 이상은 c##을 붙인다. */
		   String pwd="master";

		   try { /* 드라이버를 찾는 과정 */
		     Class.forName("oracle.jdbc.driver.OracleDriver");
		     System.out.println ("드라이버 로드 성공");
		   } catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("no driver");
		     }

		   try { /* 데이터베이스를 연결하는 과정 */
		     System.out.println ("데이터베이스 연결 준비 ...");
		     con=DriverManager.getConnection(url, userid, pwd);
		     System.out.println ("데이터베이스 연결 성공");
		     } catch(SQLException e) {
		         e.printStackTrace();
			}
	}
	
	public boolean checkditem() {
		
		String sql = "SELECT expitemcode FROM BUGETTABLE";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); 
			while (rs.next()) {
				int code = rs.getInt("expitemcode"); 
				if(code==ec) {
					return false;
				}
			}
		}		
		catch (Exception e) {System.out.println(e.getMessage());}		
		finally {
			try {rs.close();
				pstmt.close();
				con.close();
				System.out.println("연결해제");
			} catch (Exception e) {}
		}
		return true;
	}
	
}


	
