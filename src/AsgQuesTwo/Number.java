//Problem 1: given a number, print its binary representation. [easy]

// Input 1: number = 5
// Output 1: 101

// Input 2: number = 10
// Output 2: 1010

package AsgQuesTwo;

import java.util.Arrays;
import java.util.Scanner;

public class Number {
	
	 public static String toBinary(int n)
	 {
	        String binary = "";
	        while(n>0) {
	        	long r=n%2;
	        	if(r==1) {
	        		binary +="1";
	        	}else {
	        		binary += "0";
	        	}
	        	n/=2;
	        }
//	        for (long i = (1L << len - 1); i > 0; i = i / 2) {
//	            binary += (n & i) != 0 ? "1" : "0";
//	        }
	        return binary;
	   }
	   
	   public static void main(String[] args)
	   {
	        int n = 39;
//	        int le
	 
	        String binary = toBinary(n);
	        
	        System.out.println("The binary representation of " + n + " is "+ binary);
	   }
}
