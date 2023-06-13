// Q1. Given an array. FInd the number X in the array. If the element is present, return the index of the element,
// else print “Element not found in array”. Input the size of array, array from user and the element X from user.
// Use Linear Search to find the element.

package AsgQuesTwo;

import java.util.Scanner;

public class LinearSearch {

	static void linearSearch(int arr[], int target) {
		boolean flag = false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==target) {
				System.out.print("index of element: "+ i);
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("Element not found in array ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the element of the array: ");
		int n = sc.nextInt();
		
		int arr[] = new int [n];	
		
		System.out.println("Enter the Array: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter Target Values: ");
		int target = sc.nextInt();
		
		linearSearch(arr,target);
	}

}
