// Q1. Write a program to sort an array in descending order using bubble sort.

// Input Array {3,5,1,6,0}
// Output Array: {6, 5, 3, 1, 0}

package AsgQuesTwo;

import java.util.Scanner;

public class BubbleSortDesecend {

//	Print method Array
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
	}
	
//	Sorting method for Descending order using Buble_Sort
	public static void bubleSortDesecendingOrder(int arr[]) {
		boolean swapped = false;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		printArray(arr);
	}
	
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter the length of the array: ");
		int n = sc.nextInt();
			
		int arr[] = new int [n];	
			
		System.out.println("Enter the a Array: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		bubleSortDesecendingOrder(arr);
	}

}
