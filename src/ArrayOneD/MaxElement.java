
//Q3: Write a program to calculate the maximum element in the array.

// Input: arr[] = {34,21,54,65,43}
// Output: 65

package ArrayOneD;

import java.util.Scanner;

public class MaxElement {

	public static int MaxElement(int arr[], int l) {
		int max=arr[0];
		for(int i=0; i<l; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		  try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the length of Array: ");
			  int l=sc.nextInt();
			     
			  int arr[]=new int[l];
			     
			  System.out.println("Entered Array: ");
			  for(int i=0; i<l; i++) {
			    arr[i]=sc.nextInt();
			  }

			 System.out.println("Maximum Element is: "+MaxElement(arr, l));
		}catch (Exception e) {
			System.out.println("InputMismatchException: "+e.getMessage());
		}
	}

}
