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
		   String userid="c##master"; /* 12���� �̻��� c##�� ���δ�. */
		   String pwd="master";

		   try { /* ����̹��� ã�� ���� */
		     Class.forName("oracle.jdbc.driver.OracleDriver");
		     System.out.println ("����̹� �ε� ����");
		   } catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("no driver");
		     }

		   try { /* �����ͺ��̽��� �����ϴ� ���� */
		     System.out.println ("�����ͺ��̽� ���� �غ� ...");
		     con=DriverManager.getConnection(url, userid, pwd);
		     System.out.println ("�����ͺ��̽� ���� ����");
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
				System.out.println("��������");
			} catch (Exception e) {}
		}
		return true;
	}
	
}


	
