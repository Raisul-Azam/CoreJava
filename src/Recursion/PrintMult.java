package Recursion;

import java.util.Scanner;

public class PrintMult {
	
	static void printMult(int num, int k) {
		if (k == 1) {
			System.out.println(num);
		}else {
//			System.out.println(num*k);
			printMult(num, k-1);
//			System.out.println(num*k);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a num: ");
		int num = sc.nextInt();
		
		System.out.println("Enter k time No: ");
		int k = sc.nextInt();
		
		printMult(num,k);
	}

}
