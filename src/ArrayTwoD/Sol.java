package ArrayTwoD;

import java.util.Scanner;

class Solution {
    static int search(int[] nums, int target) {
        //Approach: Using Binary Search, T.C: O(logN), S.C: O(1)
        int start = 0;
        int end = nums.length - 1;

        while(start<=end){

            int mid = (start+end)/2;

            if(nums[mid] == target){
                return mid;
            }
            //left sorted
            if(nums[start]<=nums[mid]){
                if(target > nums[mid] || target < nums[start]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
            else{
            	//right sorted
                if(target < nums[mid] || target > nums [end]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }

        }

        return -1;
    }
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter an array: ");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter target ");
		int t = sc.nextInt();
		System.out.println(search(arr,t));
	}
}