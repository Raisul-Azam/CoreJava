//Q4.Find out how many pass would be required to sort the following array in decreasing order using bubble sort

// Input Array {3,5,1,6,0}

package AsgQuesTwo;
import java.util.Arrays;
import java.util.Scanner;

public class DecendingOrderPass {

//	Print method Array
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
	}
	
//	Sorting method for Descending order using Buble_Sort
	public static void bubleSortDesecendingOrder(int arr[]) {
		boolean swapped = false;
		int count=0;
		System.out.println("Original Array is: "+Arrays.toString(arr));
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				swapped = true;
				count++;
				System.out.println("In "+count+" iteraion array is: "+Arrays.toString(arr));
				}
			}
			if(!swapped) {
				break;
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
			
		System.out.println("Enter the a Array: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		bubleSortDesecendingOrder(arr);
	}

}
