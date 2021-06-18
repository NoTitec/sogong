package uc1001;

public class Check_TypeLength {
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
	public Check_TypeLength(String mn, Integer mc, String en, Integer ec, Integer ea, String an, Integer ac, Integer aa,
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
	public boolean checktitem() {
		if(mn.length()>30) {
			return false;
		}
		else if((int)Math.log10(mc)+1>5) {
			return false;
		}
		else if(en.length()>30) {
			return false;
		}
		else if((int)Math.log10(ec)+1>5)
		{
			return false;
		}
		else if(ea!=null&&(int)Math.log10(ea)+1>10)
		{
			return false;
		}
		else if(an.length()>30) {
			return false;
		}
		else if((int)Math.log10(ac)+1>5) {
			return false;
		}
		else if(aa!=null&&(int)Math.log10(aa)+1>10) {
			return false;
		}
		else if(fn.length()>30) {
			return false;
		}
		else if((int)Math.log10(fc)+1>5) {
			return false;
		}
		else {
		return true;
		}
	}
}
