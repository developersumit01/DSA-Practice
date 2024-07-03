package recursion;

public class SumOfNNeturalNumberAlternativeSigns {
	/*
	 * Time complexity O(range)
	 */
	public int sumOfNNeturalNumberAlternativeSigns(int range) {
		if(range==1) {
			return range;
		}
		if(range%2==0) {
			return sumOfNNeturalNumberAlternativeSigns(range-1)-range;
		}else {
			return sumOfNNeturalNumberAlternativeSigns(range-1)+range;
		}
	}
}
