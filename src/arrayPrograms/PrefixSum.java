package arrayPrograms;

public class PrefixSum {
	
	public static void main(String[] args) {
		PrefixSum prefixSum=new PrefixSum();
		int[] arr= {1,2,3,5,1};
		System.out.println(prefixSum.subArrayOrNot(arr));
	}
	
	public void prefixSum(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			arr[i]=arr[i]+arr[i-1];
		}
	}
//	Find the array can be divide into to sub part or not 
//	in which both prefix sum should be equal.
	public boolean subArrayOrNot(int[] arr) {
		int start=0,end=arr.length-1;
		int leftPrifixSum=0,rightPrefixSum=0;
		while(start<=end) {
			if (leftPrifixSum<=rightPrefixSum) {
				leftPrifixSum+=arr[start];
				start++;
			}else {
				rightPrefixSum+=arr[end];
				end--;
			}
		}
		if(leftPrifixSum==rightPrefixSum) {
			return true;
		}else {
			return false;
		}
	}
}
