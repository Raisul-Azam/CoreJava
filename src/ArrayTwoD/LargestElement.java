//Q4: Write a program to find the largest element of a given 2D array of integers. 

package ArrayTwoD;

import java.util.Scanner;

public class LargestElement {

	public static void largestElementNo(int arr[][], int n, int m) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(max<arr[i][j]) {
					max=arr[i][j];
				}
			}
		}
		System.out.println("Largest Element: "+max);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     
		  System.out.println("Enter the length of Array n*m: ");
		  int n=sc.nextInt();
		  int m=sc.nextInt();
		     
		  int arr[][]=new int[n][m];
		     
		  System.out.println("Entered Array: ");
		  for(int i=0; i<n; i++) {
			  for(int j=0; j<m; j++) {
				  arr[i][j]=sc.nextInt();  
			  }
			  System.out.println();
		  }
		  
		  largestElementNo(arr, n, m);
	}

}
