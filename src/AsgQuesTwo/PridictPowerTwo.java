//Problem 2: given a number ‘n’, predict whether it is a power of two or not. [medium]

//Input 1: n = 15
//Output 1: False

//Input 2: n = 32
//Output 2: True

package AsgQuesTwo;

import java.util.Scanner;

public class PridictPowerTwo {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a No: ");
		int num = sc.nextInt();
		
		int val = (num & (num-1));
		if(val==0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		System.out.println(4);
	}
}