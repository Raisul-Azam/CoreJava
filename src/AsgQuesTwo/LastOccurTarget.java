// Q2. Given an array and an integer “target”, return the last occurrence of “target” in the array. 
// If the target is not present return -1.

// Input 1: arr = [1 1 1 2 3 4 4 5 6 6 6 6] , target = 4
// Output 1: 6

// Input 2: arr = [2 2 2 6 6 18 29 30 30 30] , target = 15
// Output 2: -1

package AsgQuesTwo;

import java.util.Scanner;

public class LastOccurTarget {
	
	public static void lastOccurTarget(int arr[], int target) {
		int flag = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==target) {
				flag = i;
			}
		}
		if(flag==-1) {
			System.out.print("target is not persent: "+flag);
		}else {
			System.out.println("Target: "+flag);
		}
	}
	
	public static void main(String args[]) {
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
		
		lastOccurTarget(arr,target);
	}
}
