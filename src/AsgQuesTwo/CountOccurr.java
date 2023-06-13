//Q4. Given a sorted integer array containing duplicates, count occurrences of a given number. If the element
//is not found in the array, report that as well.

// Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
// target = 5
// Output: Target 5 occurs 3 times

// Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
// target = 6
// Output: Target 6 occurs 2 times

package AsgQuesTwo;

import java.util.Scanner;

public class CountOccurr {

	public static void count_Occurr(int arr[], int target) {
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==target) {
				count++;
			}
		}
		System.out.print("Target "+target+" occurs "+count+" times");
	}
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the element of the array: ");
		int n = sc.nextInt();
		
		int arr[] = new int [n];	
		
		System.out.print("Enter the a binarry Array: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter Target Values: ");
		int target = sc.nextInt();
		
		count_Occurr(arr,target);
	}

}
