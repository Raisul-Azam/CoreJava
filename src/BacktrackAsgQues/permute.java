//Q2. Given an integer array arr, print all the possible permutations of the given array.
package BacktrackAsgQues;
import java.util.*;
import java.util.Scanner;
public class permute{

   public static void permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
          return;
        }

        permutationsHelper(result, nums, 0);

        for(List<Integer> list : result){
            for(Integer item : list){
                System.out.print(item + "  ");
            }
            System.out.println("");
        }
    }

    private static void permutationsHelper(List<List<Integer>> result, int[] nums, int start) {
        if (start == nums.length - 1) {
            List<Integer> list = new ArrayList<>();
            for (int n : nums) {
                list.add(n);
            }
            result.add(list);
            return;
        }
        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            permutationsHelper(result, nums, start + 1);
            swap(nums, start, i);
        }
    }

    private static void swap(int[] nums, int x, int y) {
        int t = nums[x];
        nums[x] = nums[y];
        nums[y] = t;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entered length: ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter he Array: ");
        for(int i=0; i<n; i++) {
        	arr[i] = sc.nextInt();
        }
        System.out.println("The possible permutations are : ");
        permute(arr);
    }
}