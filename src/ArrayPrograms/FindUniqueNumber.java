package ArrayPrograms;

import java.util.ArrayList;

public class FindUniqueNumber {
	public static void main(String[] args) {
		FindUniqueNumber obj=new FindUniqueNumber();
		int arr[]= {2};
		System.out.println("The unique Number is : "+ obj.uniqueFromArray(arr));
	}
	
//	This method is use to find the unique number form an array which have double number and at least one unique number.
	public int uniqueFromArray(int[] arr) {
		int unique=0;
		for (int i : arr) {
			unique^=i;
		}
		return unique;
	}

}
