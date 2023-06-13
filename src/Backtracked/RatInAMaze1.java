package Backtracked;
import java.util.ArrayList;

public class RatInAMaze1 {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String>s=new ArrayList<>();
        if(m[m.length-1][m[0].length-1]==0)
        {
            return s;
        }
        int row = 0;
        int col = 0;
        possiblePath("",m,row,col,s,n);
        return s;
    }
    public static void possiblePath(String path, int [][]arr, int row ,int col, ArrayList<String>list,int n)
    {
        if(row == n-1 && col == n-1)
        {
           list.add(path);
            return ;          
        }
        if(arr[row][col] == 0)
        { 
            return;
        }
       
        arr[row][col] = 0;
        if(col < n-1)
        {
            possiblePath( path+'R', arr,  row, col+1, list,n);
            
        }
        if(row < n-1)
        {
             possiblePath( path+'D', arr,  row+1 , col ,list,n);
        }
        if(col > 0)
        {
             possiblePath( path+'L', arr,  row, col-1, list, n);
        }
        if(row > 0)
        {
            possiblePath( path+'U', arr,  row-1 , col ,list, n);
        }
        arr[row][col] = 1;
        
    }
    
    public static void main(String args[]) {
    	int N = 4;
    	int	m[][] =    { {1, 0, 0, 0},
    			         {1, 1, 0, 1}, 
    			         {1, 1, 1, 1},
    			         {0, 1, 1, 1} };
    	System.out.println(findPath(m, N));
    }
}