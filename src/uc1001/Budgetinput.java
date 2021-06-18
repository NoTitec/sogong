package uc1001;

import java.util.*;

public class Budgetinput {
	
	public static String mname=null;
	public static Integer mcode=null;
	public static String ename=null;
	public static Integer ecode=null;
	public static Integer eamount=null;
	public static String aname=null;
	public static Integer acode=null;
	public static Integer aamount=null;
	public static String fname=null;
	public static Integer fcode=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("예산 정보 입력 시작");
		System.out.println("부처명:");
		mname=scan.next();
		System.out.println("부처코드:");
		mcode=scan.nextInt();
		System.out.println("세출비목명:");
		ename=scan.next();
		System.out.println("세출비목코드:");
		ecode=scan.nextInt();
		System.out.println("세출비액:");
		eamount=scan.nextInt();
		System.out.println("세출세목명:");
		aname=scan.next();
		System.out.println("세출세목코드:");
		acode=scan.nextInt();
		System.out.println("세출세액:");
		aamount=scan.nextInt();
		System.out.println("부문명:");
		fname=scan.next();
		System.out.println("부문코드:");
		fcode=scan.nextInt();
		
		Check_requiritem checkr= new Check_requiritem(mname,mcode,ename,ecode,eamount,aname,acode,aamount,fname,fcode);
		if(checkr.checkritem()==false) {
			System.out.println("no all requireitem");
			System.exit(0);
		}
		else {
			checkr=null;
		}
		Check_TypeLength checkt = new Check_TypeLength(mname,mcode,ename,ecode,eamount,aname,acode,aamount,fname,fcode);
		if(checkt.checktitem()==false) {
			System.out.println("type length mismatch");
			System.exit(0);
		}
		else {
			checkt=null;
		}
		Check_duplicate checkdup = new Check_duplicate(mname,mcode,ename,ecode,eamount,aname,acode,aamount,fname,fcode);
		if(checkdup.checkditem()==false) {
			System.out.println("already exist expitemcode");
			System.exit(0);
		}
		else {
			checkdup=null;
		}
		
		Budget_insert insert = new Budget_insert(mname,mcode,ename,ecode,eamount,aname,acode,aamount,fname,fcode); // 입력객체생성
		insert.insertMethod(); // 입력클래스의 입력메소드실행
		
		scan.close();
	}

}
