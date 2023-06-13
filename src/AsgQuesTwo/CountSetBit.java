//Q4. Given a number, count the number of set bits in that number without using an extra space.
//Note : bit ‘1’ is also known as set bit.

package AsgQuesTwo;

import java.util.Scanner;

public class CountSetBit {
	
	   public static int countSetBits(int num){
	        int count = 0;
	        while (num > 0) {
	            count += num & 1;
	            num >>= 1;
	        }
	        return count;
	    }
		public static void main(String[] args) {
			 int number;
			 System.out.println("Enter the integer: ");
	 
	         // Create Scanner object
	         Scanner s = new Scanner(System.in);
	 
	         // Read the next integer from the screen
	         number = s.nextInt();
	        
	         int answer = countSetBits(number);
	         System.out.println("The number of set bits in the given number are " + answer);
	   }
}
