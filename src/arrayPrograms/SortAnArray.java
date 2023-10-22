package arrayPrograms;

import java.util.Arrays;

public class SortAnArray {
	
	public static void main(String[] args) {
		SortAnArray anArray=new SortAnArray();
		int[] arr= {2,4,6,8,0};
		anArray.sortParityArray(arr);
		System.out.println(Arrays.toString(arr));
	}
	/*
	 * This method is use to sort an given array which containing only 0 or 1.
	 */
	public void sortAn0And1Array(int[] arr) {
		int start=0,end=arr.length-1;
		Reverse reverse=new Reverse();
		while(start<end) {
			if(arr[start]==1&&arr[end]==0) {
//				This is the method of Reverse Class.
//				This swap method is use to swap two number in an array.
				reverse.swap(arr, start, end);
				start++;
				end--;
			}
			if(arr[start]==0) {
				start++;
			}
			if(arr[end]==1) {
				end--;
			}
			if((arr[start]!=0&&arr[start]!=1)||(arr[end]!=0&&arr[end]!=1)) {
				System.out.println("Invalid array is given, not containing only 0 or 1");
				return;
			}
		}
	}
	
	public void sortParityArray(int[] arr) {
		int start=0,end=arr.length-1;
		Reverse reverse=new Reverse();
		while(start<end) {
			if(arr[start]%2==1&&arr[end]%2==0) {
//				This is the method of Reverse Class.
//				This swap method is use to swap two number in an array.
				reverse.swap(arr, start, end);
				start++;
				end--;
			}
			if(arr[start]%2==0) {
				start++;
			}
			if(arr[end]%2==1) {
				end--;
			}
		}
	}
	
}
