//Q5. Given a number n. Print if it is an armstrong number or not. An armstrong number is a number if the sum 
//of every digit in that number raised to the power of total digits in that number is equal to the number.
//Example : 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 hence 153 is an armstrong number. (Easy)

//Input1 : 153
//Output1 : Yes

//Input 2 : 134
//Output2 : No

package AsgQuesRecursion;

import java.util.Scanner;

public class ArmstrongNo {

	public static int armstrongNum(int num) {
		int b,sum=0;
		if(num<=1) {
			return num;
		}
		else {
			b = num%10;
			return sum = sum+(b*b*b)+armstrongNum(num/10);
		}
	}
	
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input an Integer number: ");
		int num = sc.nextInt();

//		method calling
		int result = armstrongNum(num);
		if(result==num) {
			System.out.println("yes.. It is Armstrong No.");
		}
		else {
			System.out.println("No... It is Not Armstrong NO.");
		}
	}

}
