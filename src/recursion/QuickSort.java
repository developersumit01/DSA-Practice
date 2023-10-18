package recursion;
public class QuickSort {
//	For use this program you can use quickSort method and pass your unsorted array.
	public void quickSort(int[] arr) {
		helperQuickSort(arr, 0, arr.length - 1);
		return;
	}

	private void helperQuickSort(int[] arr, int start, int end) {
		if (start >= end)
			return;
		int povit = sort(arr, start, end);
		helperQuickSort(arr, start, povit - 1);
		helperQuickSort(arr, povit + 1, end);
	}

	private int sort(int[] arr, int start, int end) {
		int povit = arr[end];
		int index = end;
		end--;
		while (start < end) {
			while (arr[start] < povit && start < end) {
				start++;
			}
			while (arr[end] > povit && end > start) {
				end--;
			}
			int temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
		}
		if (arr[index] < arr[start]) {
			arr[index] = arr[start];
			arr[start] = povit;
			index = start;
		}
		return index;
	}

}
