package com.duke.sort;

public class QuickSort {
	
	public void sort(int[] arr)
	{
		quickSort(arr, 0, arr.length - 1);
		System.out.println("\nQuick Sort:");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	private void quickSort(int[] arr, int i, int j) {
		if (i < j) {
			int pivot = partition(arr, i, j);
			quickSort(arr, i, pivot - 1);
			quickSort(arr, pivot + 1, j);
		}

	}

	private int partition(int[] arr, int i, int j) {

		int l = -1;
		int m = 0;
		int pivotValue = arr[j];

		while (m < j) {
			if (arr[m] < pivotValue) {
				int temp = arr[m];
				l++;
				arr[m] = arr[l];
				arr[l] = temp;
			}
			m++;
		}

		l++;
		int temp = arr[j];
		arr[j] = arr[l];
		arr[l] = temp;
		return l;
	}
}
