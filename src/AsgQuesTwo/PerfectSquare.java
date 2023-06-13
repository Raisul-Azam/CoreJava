//Q5: Given a positive integer num, return true if num is a perfect square or false otherwise. A perfect square
//is an integer that is the square of an integer. In other words, it is the product of some integer with itself.

// Input: num = 16
// Output: true

// Input: num = 14
// Output: false

package AsgQuesTwo;

import java.util.Scanner;

public class PerfectSquare {

	public static void perfectSquareNo(int num) {
		int low = 0, high = num-1;
		boolean flag = false;
		while(low<=high) {
			int mid = (low+high)/2;
			int val = mid*mid;
			if (val==num) {
				flag=true;
				break;
			} else if(val<num){
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		if(flag==true) {
			System.out.println(flag);
		}else{
			System.out.println(flag);
		}
	}
	
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a positive No:  ");
		int num = sc.nextInt();
		
		if(num>0) {
			perfectSquareNo(num);
		}else {
			System.out.print("plz.. Inputted Positive No:  ");
		}
		
	}

}
