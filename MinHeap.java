package com.duke.sort;

public class MinHeap {

	private int[] heap;
	private int maxSize;
	private int size;

	public MinHeap(int size) {
		heap = new int[size];
		this.maxSize = size;
		this.size = 0;
	}

	private int parent(int pos) {
		return (pos - 1) / 2;
	}

	public int left(int pos) {

		return (2 * pos + 1);
	}

	private int right(int pos) {

		return (2 * pos + 2);
	}

	public void insert(int data) {
		
		if(size>maxSize)
		{
			return;
		}
		heap[size] = data;
		int cur = size;
		size++;

		while (cur != 0 && heap[cur] < heap[parent(cur)]) {
			swap(cur, parent(cur));
			cur = parent(cur);
		}
	}

	private void swap(int cur, int parent) {
		int temp = heap[cur];
		heap[cur] = heap[parent];
		heap[parent] = temp;
	}

	private void minHeapify(int pos) {
		int min = pos;
		int left = left(pos);
		int right = right(pos);

		if (left < size && heap[min] > heap[left]) {
			min = left;
		}

		if (right < size && heap[min] > heap[right]) {
			min = right;
		}

		if (min != pos) {
			swap(min, pos);
			minHeapify(min);
		}
	}
	
	public void minHeap() {
		for (int i = (size / 2 - 1); i >= 0; i--) {
			minHeapify(i);
		}
	}
	
	public void print() {
		for (int i = 0; i < size; i++) {
			System.out.print(heap[i] + " ");
		}
		System.out.println();
	}
	
	public void getMin()
	{
		int popped = heap[0];
		heap[0] = heap[--size];
		minHeapify(0);
		System.out.println("Min Val: "+popped);
	}

	public static void main(String[] args) {
		MinHeap minHeap = new MinHeap(15);
		minHeap.insert(5);
		minHeap.insert(3);
		minHeap.insert(17);
		minHeap.insert(10);
		minHeap.insert(84);
		minHeap.insert(19);
		minHeap.insert(6);
		minHeap.insert(22);
		minHeap.insert(9);
		minHeap.minHeap();

		minHeap.print();
		minHeap.getMin();
		minHeap.print();
		minHeap.getMin();
		minHeap.print();
		minHeap.getMin();
		minHeap.print();
		minHeap.getMin();
		minHeap.print();
		minHeap.getMin();
		minHeap.print();
		minHeap.getMin();
		minHeap.print();
		minHeap.getMin();
		minHeap.print();
		minHeap.getMin();
		minHeap.print();
	}
}
