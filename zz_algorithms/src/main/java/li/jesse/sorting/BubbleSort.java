package li.jesse.sorting;

import li.jesse.util.ArrayUtil;

public class BubbleSort
{
	public static int[] bubbleSort(int[] array) {
		int i, j, temp, length = array.length;
		int x = 0;
		
		for (i = 0; i < length - 1; i++) {
			for (j = 0; j < length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
//					temp = array[j];
//					array[j] = array[j + 1];
//					array[j + 1] = temp;
					ArrayUtil.swap(array, j, j + 1);
				}
				x++;
			}
		}
		System.out.println("times of operation: " + x);
		return array;
	}

	public static int[] bubbleSortWithSwappedFlag(int[] array) {
		int i, j, temp, length = array.length;
		// if swapped is false, it means the array is ordered
		boolean swapped = true;
		int x = 0;

		for (i = 0; i < length - 1 && swapped; i++) {
			swapped = false;
			for (j = 0; j < length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					swapped = true;
				}
				x++;
			}
		}
		System.out.println("times of operation: " + x);
		return array;
	}
}
