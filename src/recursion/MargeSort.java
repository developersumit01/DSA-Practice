package recursion;

import java.util.Arrays;

public class MargeSort {
	
	public static void main(String[] args) {
		MargeSort margeSort=new MargeSort();
		int[] arr= {5,4,3,2,1};
		margeSort.inplaceMargeSort(arr,0,arr.length);
		System.out.println(Arrays.toString(arr));
	}
	
	public void inplaceMargeSort(int[] arr,int start,int end) {
		if((end-start)==1) {
			return;
		}
		int mid=(end+start)/2;
		inplaceMargeSort(arr, start, mid);
		inplaceMargeSort(arr, mid, end);
		inplaceMarge(arr, start, mid,end);
	}
	
	private void inplaceMarge(int[] arr, int start, int mid,int end) {
		int[] marge=new int[end-start];
		int i=start,j=mid,k=0;
		while(i<mid&&j<end) {
			if(arr[i]>arr[j]) {
				marge[k]=arr[j];
				j++;
			}else {
				marge[k]=arr[i];
				i++;
			}
			k++;
		}
		
		while(i<mid) {
			marge[k]=arr[i];
			i++;
			k++;
		}
		while(j<end) {
			marge[k]=arr[j];
			j++;
			k++;
		}
		for(int l=0;l<marge.length;l++) {
			arr[start+l]=marge[l];
		}
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

