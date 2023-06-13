package Recursion;

import java.util.Scanner;

public class BigPower {

	public static int binarySearchRecur(int[] arr, int low, int high, int target) {
		int result = 0;
		while(low <= high) {
			int mid = low + (high-low)/2;
			if(arr[mid] == target) {
				return mid;
			}
			else if (arr[mid] < target) { 
				return binarySearchRecur(arr, mid+1, high, target);
			}
			else {
				return binarySearchRecur(arr, low, mid-1, target);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a length of array: ");
		int n = sc.nextInt();
		
		int[] arr=new int[n];
		
		System.out.print("Enter a Array: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter a Target: ");
		int target = sc.nextInt();
		
		int result = binarySearchRecur(arr, 0, n-1, target);
		if(result == -1) {
			System.out.print("Target elemnt not found in array "+result);
		} else {
			System.out.print("the target index is: "+result);
		}
	}

}
