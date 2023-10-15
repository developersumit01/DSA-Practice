package practiceQusetion;

public class FindKthMaxAndMin {
//	This program is incomplete right now.
//	I will complete this program after some time
	public int[] findMaxAndMin(int[] arr) {
		if(arr.length==0) {
			return new int[0];
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return new int[]{min,max};
	}
	
	
	
}
