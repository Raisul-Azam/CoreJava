// Q1 : Given an integer, find out the sum of its digits using recursion.

// Input: n= 1234
// Output: 10

package AsgQuesRecursion;

import java.util.Scanner;

public class SumDigit {
  
//	Method difinition
	static int sumOfDigit(int n) {
		int sum=0,b;
		if(n <= 1) {
			return n;
		}
		else {
			b = n%10;
			return sum = sum+b+sumOfDigit(n/10);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input an Integer number: ");
		int num = sc.nextInt();
//		method calling
		int result = sumOfDigit(num);
		System.out.println("Sum of its Digits "+ result);
	}

}
