package org.sort.basics;

public class BubbleSort {
	
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
	
	public void sortM(int[] arr) {
		for(int i=arr.length -1; i > 0 ; i--) {
			for(int j=0; j < i; j++ ) {
				if(a[j] > a[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
	}
	
	public void sortM2(int []arr) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(arr[j] < arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
	}
	
	public static void main(String args[]) {
		BubbleSort sort = new BubbleSort();
		System.out.println("Array before sorting:");
		sort.show(BubbleSort.a);
		System.out.println("Array after sorting:");
		sort.sortM2(BubbleSort.a);
		sort.show(BubbleSort.a);
	}
	

}
