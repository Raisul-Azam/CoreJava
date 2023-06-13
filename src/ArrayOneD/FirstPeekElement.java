//Q5: Given an array. Find the first peak element in the array. A peak element is an element that is greater than 
//its just left and just right neighbor.


//Input 1: arr[] = {1,3,2,6,5}
//Output 1: 6

//Input 2:  arr[] = {1 4,7,3,2,6,5}
//Output 1: 7

package ArrayOneD;
import java.util.Scanner;
public class FirstPeekElement {

	static void firstPeekElement(int arr[],int l) {
		int min=-1;
		for(int i=1; i<=l-2; i++) {
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
				min=arr[i];
				break;
			}
		}
		if(min!=-1) {
			System.out.println("first peek element are: "+min);
		}else {
			 System.out.println("Is not Peek element in Array ");
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
		  
		  firstPeekElement(arr, l);
	}

}
