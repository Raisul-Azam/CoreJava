package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class FirstOcurr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a String: ");
		String str = sc.next();
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0; i<str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1 );
			}
			else {
				map.put(str.charAt(i), 1);
			}
		}
		boolean flag = false;
		for(int i=0 ;i<str.length(); i++) {
			if (map.get(str.charAt(i)) == 1) {
				System.out.println("The first non repeating character index is: "+i);
				flag = true;
				break;
			}
		}
		
		if (!flag) {
			System.out.println("No non-repeating character in String");
		}
	}

}
