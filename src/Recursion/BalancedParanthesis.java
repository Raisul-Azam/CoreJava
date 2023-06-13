package Recursion;

import java.util.Scanner;

public class BalancedParanthesis {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int openC=0, closedC=0, n;
		String snm = " ";
		
		System.out.print("Enter a No: ");
		n = sc.nextInt(); //2
		
		printBalance(openC,closedC,n,snm);
		
	}

	private static void printBalance(int openC, int closedC, int n, String snm) {
		if(openC == n && closedC == n) {
		    System.out.println(snm);  //(())
			return;
		}
		if (openC < n) { //0<2 --->1,2
			printBalance(openC+1, closedC, n, snm+"("); // oc=1,2 
		}
		if(openC > closedC) { //2>0----> 1,2
			printBalance(openC, closedC+1, n, snm+")"); // cc=1,2
		}
		
	}

}
