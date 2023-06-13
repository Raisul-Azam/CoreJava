
//Q4: Write a program to find out the second largest element in a given array. 

//Input:   arr[] = {34,21,54,65,43}
// Output: 54

package ArrayOneD;

import java.util.Scanner;

public class SecondLargest {
	
	public static int findMax(int arr[], int l) {
		int max=Integer.MIN_VALUE;
		for(int i=0; i<l; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	public static int secondLargestNo(int[] arr, int l) {
		int max= findMax(arr,l);
		for(int i=0; i<l; i++) {
			if(max==arr[i]) {
				arr[i]=Integer.MIN_VALUE;
			}
		}
        int secondMax = findMax(arr,l);
        return secondMax;
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
		 System.out.println("Second Largest: "+secondLargestNo(arr, l));
	}

}
