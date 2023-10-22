package arrayPrograms;

import java.util.Arrays;

public class PrefixSum {
	
	public void prefixSum(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			arr[i]=arr[i]+arr[i-1];
		}
	}
	
}
