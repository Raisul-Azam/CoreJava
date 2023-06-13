package Recursion;

import java.util.Scanner;

public class SearchTwoD {

	static int binarySearchTwoD(int[][] arr, int x, int n, int m) {
		int low = 0, high = m*n-1, midleIdx, midleElem;
		int result = 0;
		if (m == 0) {
			return 0;
		}
		while(low <= high) {
			midleIdx = low + (high - low)/2;
			midleElem = arr[midleIdx/n][midleIdx%n];
			if(x==midleElem) {
				return 1;
			}else if (x < midleElem) {
				high = midleIdx-1;
			}else {
				low = midleIdx+1;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        // size of an element from the user
	        System.out.println("Enter the number of rows in an array");
	        int row = sc.nextInt();
	        
	        System.out.println("Enter the number of colmns in an array");
	        int col = sc.nextInt();

	        // array elements entered from the user
	        System.out.println("Enter the array elements");
	        int[][] arr = new int[row][col];

	        for(int i=0; i<row; i++) {
	        	for(int j=0; j<col; j++) {
	        		arr[i][j] = sc.nextInt();
	        	}
	        }

	        // target element from the user
	        System.out.println("Enter target element");
	        int x = sc.nextInt();

	        // Function calling of binarySearch
	        int result = binarySearchTwoD(arr, x, row, col);

	        if(result == 0){
	            System.out.println(false);
	        }
	        else{
	            System.out.println(result);
	        }
	}

}
