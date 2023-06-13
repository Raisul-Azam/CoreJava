//Problem 1: given a number, print its binary representation. [easy]

//Input 1: number = 5
//Output 1: 101

//Input 2: number = 10
//Output 2: 1010

package AsgQuesTwo;

import java.util.Scanner;

public class DecTwoBin {

	public static int toBinary(int bin)
	{
		int r=0,sum=0,x=0;
		while(bin>0) {
			r = bin%2;
			sum = sum+r*(int)Math.pow(10,x++);
			bin/=2;
		}
		
		return sum;
	}
	   
	 public static void main(String[] args)
	 {
		 Scanner sc=new Scanner(System.in);		 
		 
		 System.out.print("Enter a Decimal No: ");
		 int n = sc.nextInt();
	     int binary = toBinary(n);
	     System.out.println("The binary representation of " + n + " is "+ binary);
	  }

}
