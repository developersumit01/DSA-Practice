package recursion;

import java.util.Arrays;

public class MargeSort {
	
	public static void main(String[] args) {
		MargeSort margeSort=new MargeSort();
		int[] arr= {};
		arr=margeSort.margeSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public int[] margeSort(int[] arr) {
		if(arr.length==1||arr.length==0) {
			return arr;
		}
		int mid=arr.length/2;
		int[] left=margeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] right	=margeSort(Arrays.copyOfRange(arr, mid, arr.length));
		
		return marge(left,right);
		
	}

	private int[] marge(int[] left, int[] right) {
		int[] marge=new int[left.length+right.length];
		if(left.length==0&&right.length==0) {
			return marge;
		}
		int i=0,j=0,k=0;
		while(left.length>i&&right.length>j) {
			if(left[i]<right[j]) {
				marge[k]=left[i];
				i++;
			}else {
				marge[k]=right[j];
				j++;
			}
			k++;
		}
		
		while(left.length>i) {
			marge[k]=left[i];
			i++;
			k++;
		}
		while(right.length>j) {
			marge[k]=right[j];
			j++;
			k++;
		}
		return marge;
	}
	
}

