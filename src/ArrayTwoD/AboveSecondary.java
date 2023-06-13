//Q2: write a program to print the elements above the secondary diagonal in a user inputted square matrix.		

package ArrayTwoD;

import java.util.Scanner;

public class AboveSecondary {

	public static void aboveSecondary(int arr[][],int n, int m) {
		System.out.println("Elements above secondary diagonal are as follows : ");    
	    for(int i = 0 ; i < n ; i++){    
	        for(int j = 0 ; j < m ; j++){    
	            if(i + j > m - 1)
	            	System.out.print(arr[i][j] + "  ");
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
		  
		  aboveSecondary(arr, n, m);
	}

}
