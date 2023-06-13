package Backtracked;

public class Permutation {
	
	static String swap(String str, int i, int j) {
		char ch[] = str.toCharArray();
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return String.valueOf(ch);
	}
	
	static void permute(String str, int l, int r) {
		if(l==r) {
			System.out.println(str);
			return;
		} else {
			for(int i=l; i<=r; i++) {
//				swapp
				str = swap(str, l, i);
//				permute
				permute(str, l+1, r);
//				backtracking
				str = swap(str, l, i);
			}
		}
	}

	public static void main(String[] args) {
		String str = "ABC";
		int n= str.length();
		permute(str,0,n-1);
	}

}
