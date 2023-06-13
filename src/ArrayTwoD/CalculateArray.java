//Q1: Take m and n input from the user and m * n integer inputs from user and print the following:	

//number of positive numbers
//number of negative numbers
//number of odd numbers
//number of even numbers
//number of 0.

package ArrayTwoD;
import java.util.Scanner;
public class CalculateArray {
	
	public static void calculationInArray(int arr[][], int n, int m) {
		int pos=0,neg=0,odd=0,even=0,zero=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				
				if(arr[i][j]>0) {
					pos++;
					if(arr[i][j]%2==0) {
						even++;
					}
					else if(arr[i][j]%2!=0) {
						odd++;
					}
				}
				else if(arr[i][j]<0) {
					neg++;
					if(arr[i][j]%2!=0) {
						odd++;
					}
					else if(arr[i][j]%2==0) {
						even++;
					}	
				}
				else if(arr[i][j]==0) {
					zero++;
					if(arr[i][j]%2==0) {
						even++;
					}
				}
			}
		}
		System.out.println("number of positive numbers: "+pos);
		System.out.println("number of negative numbers: "+neg);
		System.out.println("number of odd numbers: "+odd);
		System.out.println("number of even numbers: "+even);
		System.out.println("number of 0: "+zero);
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
		  
		  calculationInArray(arr, n, m);
	}

}
