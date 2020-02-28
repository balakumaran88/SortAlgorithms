package org.sort.basics;

public class SelectionSort {
	
	static int[] a = new  int[]{22,0,-4, 21, 55,3, 1};
	
	public void show(int[] arr) {
		for(int i : arr) {
			System.out.print(i + "\t");
		}
		System.out.println("\n");
	}
	
	public static void swap(int a[], int i, int j) {
		if(i==j) {
			return;
		} else {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		
	}
	
	public int[] sortM(int[] arr) {
		for(int i=arr.length -1; i > 0 ; i--) {
			int largest=0;
			for(int j = 1; j <= i; j++) {
				if(arr[j] > arr[largest]) {
					largest = j;
				}
			}
			swap(arr, largest, i);
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Selection Sort====");
		SelectionSort sort = new SelectionSort();
		System.out.println("Array before sorting:");
		sort.show(BubbleSort.a);
		System.out.println("Array after sorting:");
		sort.show(sort.sortM(SelectionSort.a));

	}

}
