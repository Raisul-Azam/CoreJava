//Q3. WAP to sort an array in decreasing order using insertion sort

//Input Array {3,5,1,6,0}
//Output Array: {6, 5, 3, 1, 0}

package AsgQuesTwo;

import java.util.Scanner;

public class InsertionSortDesecend {

//	Print method Array
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
	}
	
//	Sorting method for Descending order using Insertion_Sort
	public static void insertiontionSortDesecendingOrder(int arr[]) {
		for(int i=1; i<arr.length; i++) {
			int j=i;
			while(j>0 && arr[j]>arr[j-1]) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
			j--;
			}
		}
		System.out.print("Desecending order sort using Insertion_Sort: ");
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
		
		insertiontionSortDesecendingOrder(arr);
	}

}
