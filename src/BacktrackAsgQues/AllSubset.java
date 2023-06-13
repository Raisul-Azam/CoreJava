

package BacktrackAsgQues;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllSubset {
	
	static void backtrack(List<List<Integer>> result, ArrayList<Integer> temp, int[] nums, int start) {
		result.add(new ArrayList(temp));
		for(int i=start; i<=nums.length-1; i++) {
			//Include
			  temp.add(nums[i]);
			//backtrack
			  backtrack(result, temp, nums, i+1);
			//remove
			  temp.remove(temp.size()-1);
		}
	}
	
	static List<List<Integer>> subAllSet(int[] nums){
		List<List<Integer>> result = new ArrayList<>();
		backtrack(result,new ArrayList<>(),nums,0);
		return result;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a No: ");
		int n = sc.nextInt();
		int nums[] =new int[n];
		for(int i=0; i<=nums.length-1; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(subAllSet(nums));
	}

}
