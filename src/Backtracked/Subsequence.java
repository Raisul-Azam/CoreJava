package Backtracked;

import java.util.ArrayList;
import java.util.Scanner;

public class Subsequence {
	
	static void printSubSequence(int arr[], int index, ArrayList<Integer> tempArr) {
//		Base Case
		if(index == arr.length) {
//			print the subsequence but do not print entries
			if(tempArr.size() > 0) {
				System.out.println(tempArr);
			}
			return;
		}
//		recursive call
		else { 
//			inculde
			printSubSequence(arr, index+1, tempArr);
//	        ad the value in tempArr
			tempArr.add(arr[index]);
//			do not include
			printSubSequence(arr, index+1, tempArr);
//			remove the last value
			tempArr.remove(tempArr.size()-1);
		
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.print("Enter a Array: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		printSubSequence(arr, 0, new ArrayList<Integer>());
		
	}

}
