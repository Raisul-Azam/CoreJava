
package Recursion;

import java.util.Scanner;

public class AlternateSum {
	
	public static int alternateSum(int n) {
		if(n == 0 ) {
			return 0;
		}
		else {
			if(n%2==0) {
				return alternateSum(n-1)-n;
			}else {
				return alternateSum(n-1)+n;
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		int result = alternateSum(num);
		System.out.println("sum of alternate sign Sum: "+result);
	}

}
