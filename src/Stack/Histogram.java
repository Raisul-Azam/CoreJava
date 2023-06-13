package Stack;

import java.util.Scanner;

public class Histogram {
	
//	Implementation of maximum
	static int MaxElement(int arr[], int l) {
		int max=arr[0];
		for(int i=0; i<l; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	
//  Implementation of Arrays	
	static void printMethod(int printArr[]) {
		for(int i=0; i<printArr.length; i++) {
			System.out.print(printArr[i]+" ");
		}
	}
	
//	Implementation of previous smaller No
	static int[] prevSmaller(int[] arr) {
		int n = arr.length;
		int[] temp1 = new int[n];
		temp1[0] = -1;
		int j;
		boolean flag = false;
		for(int i=1; i<=n-1; i++) {
			j= i-1;
			while(j>=0) {
				if(arr[i] > arr[j]) {
					temp1[i] = j;
					flag = true;
					break;
				}
				j--;
				
			}
			if(!flag) {
				temp1[i] = -1;
			}
		}
		return temp1;
	}
	
//	Implementation of next smaller No
	static int[] nextSmaller(int[] arr) {
		int n = arr.length;
		int[] temp2 = new int[n];
		int j;
		boolean flag = false;
		for(int i=0; i<=n-1; i++) {
			j=i+1;
			flag = false;
			while(j<n) {
				if(arr[i] > arr[j]) {
					temp2[i] = j;
					flag = true;
					break;
				}
				j++;
			}
			if(!flag) {
				temp2[i] = 9;
			}
		}
		return temp2;
	}
	
//	Implementation of width
	static int[] width(int[] prevSmall, int[] nextSmall) {
		int n = prevSmall.length;
		int[] width = new int[n];
		for(int i=0; i<n; i++) {
			width[i] = nextSmall[i] - prevSmall[i] -1; 
		}
		return width;
	}
	
	
//	Implementation of Area
	static int[] area(int[] arr, int[] width) {
		int n = arr.length;
		int[] area = new int[n];
		for(int i=0; i<n; i++) {
			area[i] = arr[i]*width[i];
		}
		return area;
	}

//	Implementation of main method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length: ");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter a arrays: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] prevSmall = prevSmaller(arr);
		int[] nextSmall = nextSmaller(arr);
		int[] width = width(prevSmall,nextSmall);
		int[] area = area(arr,width);
		
		System.out.println(MaxElement(area, n));
		
	}

}
