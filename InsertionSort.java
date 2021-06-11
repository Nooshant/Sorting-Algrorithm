package com.duke.sort;

public class InsertionSort {
	
	public void sort(int[] arr)
	{
		for (int i = 1; i < arr.length; i++) {// 5, 11, 11, 12, 13
			int j = i - 1;
			if (arr[j] <= arr[i]) {
				continue;
			}
			int temp = arr[i];
			while (j > -1 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
		System.out.println("Insertion Sort:");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
