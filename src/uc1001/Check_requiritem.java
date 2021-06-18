package uc1001;

public class Check_requiritem {
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
	public Check_requiritem(String mn, Integer mc, String en, Integer ec, Integer ea, String an, Integer ac, Integer aa, String fn, Integer fc) {
		
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
	
	public boolean checkritem() {
		if(mn==null) {
			return false;
		}
		else if(mc==null) {
			return false;
		}
		else if(en==null) {
			return false;
		}
		else if(ec==null) {
			return false;
		}
		else if(an==null) {
			return false;
		}
		else if(ac==null) {
			return false;
		}
		else if(fn==null) {
			return false;
		}
		else if(fc==null) {
			return false;
		}
		else
		{
			return true;
		}
	}
}
