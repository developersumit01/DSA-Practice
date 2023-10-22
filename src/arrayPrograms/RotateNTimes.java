package arrayPrograms;

public class RotateNTimes {

	public void rotateNTimes(int[] arr,int n) {
		int rotate=n%arr.length;
		int start=0,end=arr.length-rotate;
		Reverse reverse=new Reverse();
//		This reverseArray method is from Reverse class.
//		Which is use to reverse an given array in the range of start and end.
		reverse.reverseArray(arr,start,end);
		start=end;
		end=arr.length;
		reverse.reverseArray(arr,start,end);
//		This method also from Reverse class it reverse full array.
		reverse.reverseArray(arr);
	}
}
