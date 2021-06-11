package com.duke.sort;

public class SortMain {

	public static void main(String[] args) {
		InsertionSort s1 = new InsertionSort();
		s1.sort(new int[] {12, 11, 13, 5, 6});
		
		MergeSort s2 = new MergeSort();
		s2.sort(new int[] {12, 11, 14, 5, 6});
		
		QuickSort s3 = new QuickSort();
		s3.sort(new int[] {12, 11, 18, 5, 6});
		
		HeapSort s4 = new HeapSort();
		s4.sort(new int[] { 12, 11, 13, 5, 6, 7});
	}

}
