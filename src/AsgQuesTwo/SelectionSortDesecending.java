// Q2. WAP to sort an array in descending order using selection sort

// Input Array {3,5,1,6,0}
// Output Array: {6, 5, 3, 1, 0}

package AsgQuesTwo;

import java.util.Scanner;

public class SelectionSortDesecending {
	
//	Print method Array
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
	}
	
//	Sorting method for Descending order using Selection_Sort
	public static void selectionSortDesecendingOrder(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			int maxIdx = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[maxIdx]<arr[j]) {
					maxIdx=j;
				}
			}
			if(maxIdx!=i) {
				int temp = arr[i];
				arr[i]=arr[maxIdx];
				arr[maxIdx]=temp;
			}
		}
		printArray(arr);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the array: ");
		int n = sc.nextInt();
			
		int arr[] = new int [n];	
			
		System.out.println("Enter the an Array: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		selectionSortDesecendingOrder(arr);
	}

}
