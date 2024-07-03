package recursion;

public class LCMandHCF {

//	I am using Euclid's algorithm
	
	public int HCF(int x,int y) {
		if(x==0) return y;
		return HCF(y%x,x);
	}
	
	public int LCM(int x,int y) {
		LCMandHCF hcf=new LCMandHCF();
		return (x*y)/hcf.HCF(x,y);
	}
}
