
//Q1: Write a program to print the sum of all the elements present on even indices in the given array.

// Input: arr[] = {3,20,4,6,9}
// Output: 16

package ArrayOneD;

import java.util.Scanner;

public class EvenIndices 
{
	
	public int evenIndex(int arr[],int l) {
		int sum=0;
		for(int i=0; i<l; i++) {
			if(i%2==0) {
				sum+=arr[i];
			}
		}
		return sum;
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
	     
	     int addIndex = new EvenIndices().evenIndex(arr,l);
	     
	     System.out.println("sum index: "+addIndex);
	}

}
