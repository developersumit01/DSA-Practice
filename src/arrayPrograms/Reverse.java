package arrayPrograms;

public class Reverse {
	
//	In this method the start is included and end is excluded.
	public void reverseArray(int[] arr,int start,int end) {
		end--;
		while(start<end) {
			int temp=arr[end];
			arr[end]=arr[start];
			arr[start]=temp;
			start++;
			end--;
		}
	}
//	This method is use to reverse full array.
	public void reverseArray(int[] arr) {
		int left=0,right=arr.length-1;
		while(left<right) {
			int temp=arr[right];
			arr[right]=arr[left];
			arr[left]=temp;
			left++;
			right--;
		}
	}
//	This method is use to swap two number in an array.
	public void swap(int[] arr,int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}
