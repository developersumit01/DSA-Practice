package recursion;

public class KMultipleOfNumber {

//	Que Given a number num and k print k multiples of the num;
	/*
	 * This is the brute force approach to solve this problem
	 * time complexity O(k) 
	 */
	public int kMultipleOfNumber(int num,int k) {
		if(k==1) {
			return num;
		}
		return num*kMultipleOfNumber(num, --k);
	}
	
	/*
	 * Time complexity O(k/2)
	 */
	public int kMultipleOfNumberHalfComplex(int num,int k) {
		if(k<=1) {
			return num;
		}
		int ans=kMultipleOfNumberHalfComplex(num, k/2);
		if(k%2==0) {
			return ans*ans;
		}else {
			return num*ans*ans;
		}
	}
}
