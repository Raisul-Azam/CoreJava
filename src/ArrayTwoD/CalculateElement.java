//Q5: Write a function which accepts a 2D array of integers and its size as arguments and displays... 
// the elements of middle row and the elements of middle column. Printing can be done in any order.

// [Assuming the 2D Array to be a square matrix with odd dimensions i.e. 3x3, 5x5, 7x7 etc...]

package ArrayTwoD;

import java.util.Scanner;

public class CalculateElement {

	public static void middleRowColumn(int arr[][], int n, int m) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(i+j==(n/2)+i) {
					System.out.print(" "+arr[i][j]);
				}else if(i+j==(n/2)+j) {
					System.out.print(" "+arr[i][j]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	     
		  System.out.println("Enter the length of Array n*m square matrix with odd dimensions: ");
		  
		  int n=sc.nextInt();
		  int m=sc.nextInt();
		  
		  if(n*m%2==0) {
			  System.out.println("please Input square matrix with odd dimensions: !!!");
		  }
		  else {
			  int arr[][]=new int[n][m];
			     
			  System.out.println("Entered Array: ");
			  for(int i=0; i<n; i++) {
				  for(int j=0; j<m; j++) {
					  arr[i][j]=sc.nextInt();  
				  }
				  System.out.println();
			  }

			  middleRowColumn(arr, n, m);
		  }
	}

}
