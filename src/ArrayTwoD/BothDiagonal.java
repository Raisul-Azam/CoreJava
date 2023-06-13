//Q3: write a program to print the elements of both the diagonals in a user inputted square matrix in any order.		
package ArrayTwoD;

import java.util.Scanner;

public class BothDiagonal {

	public static void bothDiagonalPrint(int arr[][], int n, int m) {

		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(i==j || i+j==n-1) {
					System.out.print(" "+arr[i][j]);
				}
			}
		}
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
		  
		  bothDiagonalPrint(arr, n, m);
	}

}
