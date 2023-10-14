package recursion;

import java.util.ArrayList;

public class FindTarget {
	public static void main(String[] args) {
		FindTarget findTarget=new FindTarget();
		int[] arr= {1,2,4,5,6,7,8,9};
		System.out.println(findTarget.checkShorted(arr));
	}
//	This is the program of Linear Search.
	public int linearSearch(int[] arr,int target) {
		return helperForlinearSearch(arr, target, 0);
	}
	private int helperForlinearSearch(int[] arr,int target,int index) {
		if(index==arr.length) {
			return -1;
		}
		if(arr[index]==target) {
			return index;
		}
		return helperForlinearSearch(arr, target, index+1);
	}
	
//	This is the program of Binary Search.
	public int binarySearch(int[] arr,int target) {
		return helperForBinarySearch(arr, target, 0, arr.length-1);
	}
	
	private int helperForBinarySearch(int[] arr,int target,int start,int end){
		if(start>end) {
			return -1;
		}
		int mid=(start+end)/2;
		if(arr[mid]==target) {
			return mid;
		}
		if(arr[mid]>target) {
			return helperForBinarySearch(arr, target, start, mid-1);
		}else {
			return helperForBinarySearch(arr, target, mid+1, end);
		}
	}
	
	public ArrayList<Integer> findAllTarget(int[] arr,int target) {
		return helperForfindAllTarget(arr, target, new ArrayList<Integer>(), 0);
	}
	private ArrayList<Integer> helperForfindAllTarget(int[] arr,int target,ArrayList<Integer> list,int index) {
		if(index==arr.length) {
			return list;
		}
		if(arr[index]==target) {
			list.add(index);
		}
		return helperForfindAllTarget(arr, target, list, index+1);
		
	}
//	This method is use to check weather the array is sorted or not.
	public boolean checkShorted(int[] arr) {
		return helperForCheckShorted(arr, 0);
	}
	
	private boolean helperForCheckShorted(int[] arr,int index) {
		if(index==arr.length-1) {
			return true;
		}
		return arr[index]<arr[index+1]&&helperForCheckShorted(arr, index+1);
	}
	
}
