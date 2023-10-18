package recursion;

public class RepalceChar {	
	public static void main(String[] args) {
		RepalceChar char1=new RepalceChar();
		System.out.println(char1.replaceChar("charchar", "",0));
	}
	public String replaceChar(String unString,String pString,int index) {
		if(index==unString.length()) {
			return pString;
		}
		if(unString.charAt(index)!='a') {
			pString+=unString.charAt(index);
		}
		return replaceChar(unString, pString, index+1);
	}
	
}
