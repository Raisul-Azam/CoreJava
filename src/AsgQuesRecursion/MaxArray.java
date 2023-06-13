//Q3: Print the max value of the array [ 13, 1, -3, 22, 5]

package AsgQuesRecursion;

import java.util.Scanner;

public class MaxArray {

//	method difinition
	public static int maxValue(int[] arr, int l) {
//		Base Case condition
		if(l<=1) {
			return arr[0];
		}
		else {
			return Math.max(arr[l-1], maxValue(arr,l-1));
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of array: ");
		int l = sc.nextInt();
		
		int arr[] = new int[l];
		
		System.out.print("Enter an Array: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
//		method calling
		int max = maxValue(arr , l);
		System.out.println("Max value of the Array: "+max);
	}

}
