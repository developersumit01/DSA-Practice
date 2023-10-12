package ArrayPrograms;

public class FindUniqueNumber {
	public static void main(String[] args) {
		FindUniqueNumber obj = new FindUniqueNumber();
		int arr[] = { 2, 4, 3, 4, 3, 5, 2, 3, 4, 2, 5, 6, 5 };
		System.out.println("The unique Number is : " + obj.uniqueFromArrayOfAnyRepetition(arr, 3));
	}

//	This method is use to find the unique number form an array which have double number and at least one unique number.
	public int uniqueFromArray(int[] arr) {
		int unique = 0;
		for (int i : arr) {
			unique ^= i;
		}
		return unique;
	}

//	This is method which is use to find a unique number from an given array no matter the repetition of the number but one number should be unique in the given array.

	/*
	 * In this method arr is the array which is given by user and n is the number of
	 * repetition of the number in the array.
	 * 
	 */
	public int uniqueFromArrayOfAnyRepetition(int[] arr, int n) {
//		Here we create an array of the length 35 because the highest length of the integer is 36.
		int[] temp = new int[35];
		for (int i = 0; i < arr.length; i++) {
			int index = 34;
			while (arr[i] > 0) {
				int bit = arr[i] % 2;
				temp[index] = temp[index] + bit;
				index--;
				arr[i] = arr[i] / 2;
			}
		}
//		This is the helper method of this method, which takes an array and repetition of the number in the given array.
		return manuplateArray(temp, n);
	}

	public int manuplateArray(int[] arr, int n) {
		int number = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] % n;
		}
		int power = 0;
		for (int i = arr.length - 1; i > 0; i--) {
			number += arr[i] * Math.pow(2, power);
			power++;
		}
		return number;
	}
}
