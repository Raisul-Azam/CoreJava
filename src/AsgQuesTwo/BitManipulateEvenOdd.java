//Q3. Problem 1: Given a number. Using bit manipulation, check whether it is odd or even.

//Input: 8
//Output: Even

//Input: 3
//Output: False

package AsgQuesTwo;

import java.util.Scanner;

public class BitManipulateEvenOdd {
	
	static boolean isEven(int n)
	{
		if ((n | 1) == (n + 1))
		   return true;
		else
		   return false;
	}
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a No: ");
		int num=sc.nextInt();
		
        if (isEven(num)) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	 
	}
}
