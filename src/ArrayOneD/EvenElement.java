
//Q2: Write a program to traverse over the elements of the array using for each loop and print all even elements.

// Input: arr[] = {34,21,54,65,43}
// Output: 34 54

package ArrayOneD;

import java.util.Scanner;

public class EvenElement {

	public static void evenElement(int[] arr) {
		System.out.print("Even element: ");
		for(int i:arr) {
			if(i%2==0) {
				System.out.print(" "+i);
			}
		}
	}
	
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		     
		  System.out.println("Enter the length of Array: ");
		  int l=sc.nextInt();
		     
		  int arr[]=new int[l];
		     
		  System.out.println("Entered Array: ");
		  for(int i=0; i<l; i++) {
		    arr[i]=sc.nextInt();
		  }
	
		  evenElement(arr);   
	}

}
