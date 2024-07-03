package practiceQusetion;

import java.util.Arrays;

public class TwoDArraySort {
	public static void main(String[] args) {
		Integer arr[][]= {{1,4},{2,9},{2,8},{6,9}};
		Arrays.sort(arr, (a, b) -> {
			if(a[0]-b[0]!=0) {
				return a[0]-b[0];
			}else {
				return a[1]-b[1];
			}
		});
		for (Integer[] integers : arr) {
			System.out.println(Arrays.toString(integers));
		}
	}
}
