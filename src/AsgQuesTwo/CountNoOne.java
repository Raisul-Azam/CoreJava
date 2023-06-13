// Q3. Given a sorted binary array, efficiently count the total number of 1’s in it.

// Input 1: arr = [0 0 0 0 1 1 1 1 1 1]
// Output 1: 6

// Input 2: arr = [ 0 0 0 0 0 1 1]
// Output 2: 2

package AsgQuesTwo;

import java.util.Scanner;

public class CountNoOne {
	public static void count_One(int arr[]) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==1) {
				count++;
			}
		}
		System.out.println("count the total number of 1's: "+count);
	}
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the element of the array: ");
		int n = sc.nextInt();
		
		int arr[] = new int [n];	
		
		System.out.println("Enter the a binarry Array: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		count_One(arr);
	}
}
