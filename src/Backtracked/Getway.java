package Backtracked;

import java.util.Scanner;

public class Getway {
	
    static int isgetWay(int num) {
//    Base Case
    	if(num<=3) {
    		return num;
    	}
//    	Recusive call
    	else {
			return isgetWay(num-1) + isgetWay(num-2);
		}
    }

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter a No: ");
//		int num = sc.nextInt();
//		
//		int result = isgetWay(num);
//		System.out.print("For n = "+num+", total Way: "+result);
	
		if(true)
	    System.out.println("hi");
		System.out.println("jo");
	}

}
