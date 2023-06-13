// input: arr=[2,3,6,7],target=7;
// output: [[2,2,3],[7]]


package Backtracked;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumCombination {
	
	static void backtrack(List<List<Integer>> result, List<Integer> temp, int [] arr, int target,int start) {
		if(target < 0) {
			return;
		}
		else if (target == 0) {
			result.add(new ArrayList<>(temp));
		}
		for(int i=start; i<arr.length; i++) {
			temp.add(arr[i]);
			backtrack(result, temp, arr, target-arr[i], i);
			temp.remove(temp.size()-1);
		}
	}

	static List<List<Integer>> combinationSum(int[] arr, int target) {
		List<List<Integer>> result=new ArrayList<>();
		backtrack(result, new ArrayList<>(), arr, target, 0);
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Num: ");
		int num = sc.nextInt();
		
		System.out.print("Enter a Target: ");
		int target = sc.nextInt();
		
		int [] arr = new int[num];
		
		System.out.print("Enter an Array: ");
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(combinationSum(arr,target));
	}

}
