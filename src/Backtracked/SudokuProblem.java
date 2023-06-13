package Backtracked;

public class SudokuProblem {

	public static void print(int[][] grid, int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static boolean isSafe(int[][] grid, int row, int column, int num, int n) {
//		row clash- row has unique value
		for(int i=0; i<n; i++) {
//			check if it is Assign the number or not
			if(grid[row][i] == num) {
				return false;
			}
		}
		
//		column clash- column has unique value
		for(int i=0; i<n; i++) {
//			check if it is Assign the number or not
			if(grid[i][column] == num) {
				return false;
			}
		}
//		subgrid/box clash- subgrid has unique value
		int sqrt = (int)Math.sqrt(n);
		int boxRow = row-row % sqrt;
		int boxCol = column-column % sqrt;
		for(int i=boxRow; i<boxRow+sqrt; i++) {
			for(int j=boxCol; i<boxCol+sqrt; j++) {
				if(grid[i][j] == num) {
					return false;
				}
			}
		}
//		if there is no clash, its safe then return true
		
		return true;
	}
	
	public static boolean sudokuSolver(int[][] grid, int n) {
		int row = -1, column = -1;
		boolean isEmplty = true;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(grid[i][j] == 0) {
					row = i;
					column = j;
					
//					we still have some value left in sudoku
					isEmplty = false;
					break;
				}
			}
			if(!isEmplty) {
				break;
			}
		}
//		no Empty space left
		if(isEmplty) {
			return true;
		}
//		else for each row backtrack
		for(int num=1; num<=9; num++) {
			if(isSafe(grid, row, column, num, n) == true) {
				return true;
			}else {
				grid[row][column] = 0;
			}
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		int grid[][] = {{3,0,6,5,0,8,4,0,0},
				        {5,2,0,0,0,0,0,0,0},
		                {4,8,7,0,0,0,0,3,1},
		                {0,0,3,0,1,0,2,5,0},
		                {9,0,0,8,6,3,0,7,4},
		                {0,5,0,0,9,0,6,0,0},
		                {1,3,0,0,0,0,6,0,0},
		                {0,0,0,0,0,0,0,7,4},
		                {0,0,5,2,0,6,3,0,0}};
		
		if(sudokuSolver(grid, grid.length) == true) {
			print(grid, grid.length);
		}else {
			System.out.println("Solution does not exist! ");
		}
	}

}
