package uc1002;

public class RequestbusinessView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checkbudgetinfoexiest ce= new Checkbudgetinfoexiest();
		
		if(ce.cexist()==true) {
			System.out.println("info exist");
			Getbudgetinfo Gg=new Getbudgetinfo();
			Gg.pbudgetinfo();
			Getbusinessinfo Gb=new Getbusinessinfo();
			Gb.pbusinessinfo();
		}
	}

}
