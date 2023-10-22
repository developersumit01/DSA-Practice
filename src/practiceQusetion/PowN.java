package practiceQusetion;

public class PowN {
	
	public static void main(String[] args) {
		PowN nm=new PowN();
		
		System.out.println(nm.powN(2,4));
//		0.125
//		System.out.println(1/8.0);
	}
	public double powN(double x,int n) {
		double ans=1.0;
	        long nn=n;
	        if(nn<0)
	            nn=-1 * nn;
	        while(nn>0){
	            if(nn%2==1){
	                ans=ans*x;
	                nn=nn-1;
	            }
	            else{
	                x=x*x;
	                nn=nn/2;
	            }
	        }
	        if(n<0) 
	            ans=(double)(1.0)/(double)(ans);
	        return ans;
	    }
}
