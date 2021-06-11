package com.duke.sort;

public class MaxHeap {

	private int[] heap;
	private int maxSize;
	private int size;

	public MaxHeap(int size) {
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

	private void maxHeapify(int pos) {
		int largest = pos;
		int left = left(pos);
		int right = right(pos);

		if (left < size && heap[largest] < heap[left]) {
			largest = left;
		}

		if (right < size && heap[largest] < heap[right]) {
			largest = right;
		}

		if (largest != pos) {
			swap(largest, pos);
			maxHeapify(largest);
		}
	}
	
	public void maxHeap() {
		for (int i = (size / 2 - 1); i >= 0; i--) {
			maxHeapify(i);
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
		maxHeapify(0);
		System.out.println("Max Val: "+popped);
	}

	public static void main(String[] args) {
		MaxHeap m = new MaxHeap(15);
		m.insert(5);
		m.insert(3);
		m.insert(17);
		m.insert(10);
		m.insert(84);
		m.insert(19);
		m.insert(6);
		m.insert(22);
		m.insert(9);
		m.maxHeap();

		m.print();
		m.getMin();
		m.print();
		m.getMin();
		m.print();
		m.getMin();
		m.print();
		m.getMin();
		m.print();
		m.getMin();
		m.print();
		m.getMin();
		m.print();
		m.getMin();
		m.print();
		m.getMin();
		m.print();
	}
}
