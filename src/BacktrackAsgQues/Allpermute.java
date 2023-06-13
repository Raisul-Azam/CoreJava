//Q3. Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.

package BacktrackAsgQues;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Allpermute {
    static void backtrack(List<List<Integer>> result, List<Integer> temp, int[] arr, boolean[] used) {
        if (temp.size() == arr.length) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (used[i] || (i > 0 && arr[i] == arr[i - 1] && !used[i - 1])) {
                continue;
            }
            temp.add(arr[i]);
            used[i] = true;
            backtrack(result, temp, arr, used);
            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }

    static List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr); // Sort the array to handle duplicates
        backtrack(result, new ArrayList<>(), arr, new boolean[arr.length]);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int num = sc.nextInt();

        int[] arr = new int[num];

        System.out.print("Enter the array elements: ");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("All Possible Permutations: " + permute(arr));
    }
}