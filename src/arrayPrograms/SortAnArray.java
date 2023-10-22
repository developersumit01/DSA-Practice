package arrayPrograms;


public class SortAnArray {
	
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
	/*
	 * This method is return an array of square of each number sorted in non-decreasing
	 * order.
	 * Note: The given array should be in non-decreasing order.
	 */
	public int[] makeSortedSquardedArray(int[] arr) {
		int start=0,end=arr.length-1;
		int k=arr.length;
		int[] ans=new int[arr.length];
		while(start<=end) {
			if(Math.abs(arr[start])>Math.abs(arr[end])) {
				ans[--k]=arr[start]*arr[start];
				start++;
			}else {
				ans[--k]=arr[end]*arr[end];
				end--;
			}
		}
		return ans;
	}
	
}
