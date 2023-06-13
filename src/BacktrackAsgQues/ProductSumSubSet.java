//Q4. Check if the product of some subset of an array is equal to the target value.

package BacktrackAsgQues;

public class ProductSumSubSet {
	
	// Returns true if there is a subset
    // of set[] with sum equal to given sum
    static boolean isSubsetSum(int set[], int n, int sum)
    {
        // Base Cases
        if (sum == 0)
            return true;
        if (n == 0)
            return false;
 
        // If last element is greater than
        // sum, then ignore it
        if (set[n - 1] > sum)
            return isSubsetSum(set, n - 1, sum);
 
        // Else, check if sum can be obtained
        // by any of the following
        // (a) including the last element
        // (b) excluding the last element
        return isSubsetSum(set, n - 1, sum)
            || isSubsetSum(set, n - 1, sum - set[n - 1]);
    }

	public static void main(String[] args) {
		
		int set[] = { 3, 34, 4, 12, 5, 2 };
        int target = 9;
        int n = set.length;
        if (isSubsetSum(set, n, target) == true)
            System.out.println("Yes, is SubSet");
        else
            System.out.println("No subset");
	}

}


//----------------------------------------------------------------------

//import java.util.*;
//
//
//public class Main {
//   static int n;
//   public static boolean solve(int n, int target, int a[], int i, int product) {
//       if (i == n) return (product == target);
//       boolean answer = false;
//
//       product *= a[i];
//       
//       answer |= solve(n, target, a, i + 1, product);
//       
//       product /= a[i];
//       
//       answer |= solve(n, target, a, i + 1, product);
//
//       return answer;
//   }
//   public static void main(String[] args) {
//       
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Enter the number of elements you want and the value of target respectively : ");
//       
//       int n = sc.nextInt(), target = sc.nextInt();
//       int a[] = new int[n];
//       System.out.println("Enter the array elements");
//       for (int i = 0; i < n; i++) {
//           a[i] = sc.nextInt();
//       }
//       System.out.println((solve(n, target, a, 0, 1) ? "YES" : "NO"));
//   }
//}
