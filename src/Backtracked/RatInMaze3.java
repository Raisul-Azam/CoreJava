package Backtracked;

import java.util.ArrayList;

public class RatInMaze3 {

	static void solveMaze(ArrayList<String> ans, int i, int j, int[][] m, int n, String p,boolean[][] visit) {
		if(i == n-1 && j == n-1 && m[i][j] != 0) {
			ans.add(p);
			return;
		}
		if(i>=0 && i<n && j>=0 && j<n) {
			if(visit[i][j] == true && m[i][j]==0)
				return;
			visit[i][j]=true;
			solveMaze(ans,i+1,j,m,n,p+'D',visit); //down
			solveMaze(ans,i,j-1,m,n,p+'L',visit); //left
			solveMaze(ans,i,j+1,m,n,p+'R',visit); //right
			solveMaze(ans,i-1,j,m,n,p+'U',visit); //up
			visit[i][j]=false;
		}
	}
	
	static ArrayList<String> findPath1(int[][] m, int n){
		ArrayList<String> ans = new ArrayList<String>();
		boolean[][] visit =new boolean[n][n];
		solveMaze(ans,0,0,m,n," ",visit);
		return ans;
	}

	public static void main(String[] args) {
		int N = 4;
    	int	m[][] =    { {1, 0, 0, 0},
    			         {1, 0, 0, 1}, 
    			         {1, 1, 0, 1},
    			         {0, 1, 1, 1} };
    	ArrayList<String> res = findPath1(m, N);
    	System.out.println(res);
	}

}
