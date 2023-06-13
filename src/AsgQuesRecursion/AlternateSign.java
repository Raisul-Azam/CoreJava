//Q2: Given a number n. Find the sum of natural numbers till n but with alternate signs.
//That means if n = 5 then you have to return 1-2+3-4+5 = 3 as your answer.
//Constraints : 0<=n<=1e6

//Input1 : n = 10
//Output 1 : -5

package AsgQuesRecursion;

import java.util.Scanner;

public class AlternateSign {
	
	public static int alternateSignNatural(int n) {
		if(n <=1 ) {
			return 0;
		}
		else {
			if(n%2==0) {
				return (n/2)-n+alternateSignNatural(n/10);
			}else {
				return n-(n/2)+alternateSignNatural(n/10);
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		int result = alternateSignNatural(num);
		System.out.println("sum of natural numbers in alternate sign: "+result);
	}

}
