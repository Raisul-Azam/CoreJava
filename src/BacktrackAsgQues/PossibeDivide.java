// Q1. Given an integer array arr and an integer k, return true if it is possible to divide the vector into k non- empty 
// subsets with equal sum.

package BacktrackAsgQues;
import java.util.*;
import java.util.Scanner;
public class PossibeDivide{
    
   public static boolean helper(int []arr , int[] visit , int si , int currSum , int target , int k)
   {
        if(k==1)
        	return true;
        if(currSum>target) 
        	return false;
        if(currSum==target)
        	return helper(arr,visit,0,0,target,k-1);

        for(int i=si;i<arr.length;i++) {
            if(visit[i]==-1) {
                visit[i]=1;
                if(helper(arr,visit,i+1,currSum+arr[i],target,k) == true)
                	return true;
                visit[i]=-1;
            }
        }
        return false;
    }
    public static boolean canPartition(int []arr, int k, int n) {
    
        int[] visit = new int[n];
        for(int i=0;i<n;i++)
        	visit[i] = -1;
        int sum=0;
        for(int i=0;i<n;i++)
        	sum+=arr[i];
       
        if(sum%k!=0)
        	return false;
        return helper(arr,visit,0,0,sum/k,k);
    }
    
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n,k;
       
       System.out.print("Enter the length: ");
       n = sc.nextInt();
       
       System.out.println("Enter the target: ");
       k = sc.nextInt();
       
       int arr[] =new int [n];
       System.out.print("Enter th Array: ");
       for(int i=0; i<n; i++) {
    	   arr[i] = sc.nextInt();
       }
       
       if(canPartition(arr , k, n) == true){
          System.out.println("yes it is possible to partition the array.");
       }
       else System.out.println("no it is not possible to partition.");
    }
}