//Q3. Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.

package Backtracked;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutation3 {

	static void backtrack(List<List<Integer>> result, List<Integer>temp, int[] arr) {
		if(temp.size() == arr.length) {
			result.add(new ArrayList<>(temp));
			return;
		}
		for(int i=0 ;i<arr.length; i++) {
			if(temp.contains(arr[i])) {
				continue;
			}
			else {
				temp.add(arr[i]);
				backtrack(result, temp, arr);
				temp.remove(temp.size()-1);
			}
		}
	}
	
	static List<List<Integer>> permute(int arr[]) {
		List<List<Integer>> result = new ArrayList();
		backtrack(result,new ArrayList<>(),arr);
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Num: ");
		int num = sc.nextInt();
		
		int [] arr = new int[num];
		
		System.out.print("Enter an Array: ");
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("All Possible Permutaion: "+permute(arr));
	}

}
