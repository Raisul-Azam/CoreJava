//Q4 : Find the sum of the values of the array [92, 23, 15, -20, 10].

package AsgQuesRecursion;

import java.util.Scanner;

public class SumArray {
	
	static int SumArray(int arr[],int l) {
		if(l==0) {
			return arr[l];
		}
		else {			
			return arr[l]+SumArray(arr,l-1); 
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
		int result = SumArray(arr,l-1);
		System.out.println("Max value of the Array: "+result);
	}

}
