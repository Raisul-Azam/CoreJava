// Q5. Find out the number of iterations to sort the array in descending order using selection sort.

//Input Array {3,5,1,6,0}

package AsgQuesTwo;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingOrderTimes {
	
//	Print method Array
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
	}
	
//	Sorting method for Descending order using Selection_Sort
	public static void selectionSortDesecendingOrder(int arr[]) {
		int count=0;
		System.out.println("Original Array is: "+Arrays.toString(arr));
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
				count++;
				System.out.println("In "+count+" iteraion array is: "+Arrays.toString(arr));
			}
		}
		System.out.print("iteraion "+count+" times: ");
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
