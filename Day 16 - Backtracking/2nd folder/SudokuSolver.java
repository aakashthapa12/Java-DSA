// gfg 


class Solution
{
    //Function to print.
    static void printGrid (int grid[][])
    {
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                System.out.print(grid[i][j]+" ");
            }
        }
    }
    
    
    static boolean SolveSudoku(int grid[][])
    {
        return helperSolveSudoku(grid, 0, 0);
    }
    
    
    static boolean helperSolveSudoku(int grid[][], int r, int c)
    {
        if(r == 9)
        {
            return true;
        }
            for(int j=c; j<9; j++)
            {
                if(grid[r][j] == 0)
                {
                    for(int k=1; k<10; k++)
                    {
                        if(isSafe(grid, k, r, j))
                        {
                            grid[r][j] = k;
                            if(helperSolveSudoku(grid, r, c+1))
                            return true;
                            else{
                                 grid[r][j] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
            //after this loop that particular row is exausted;
           if(helperSolveSudoku(grid, r+1, 0))
           {
               return true;
           }
           else{
               return false;
           }
    }
    
    static boolean isSafe(int grid[][], int k, int r, int c)
    {
        // row check
        for(int i=0; i<9; i++){
            if(grid[r][i] == k)
            return false;
        }
        // column check
        for(int i=0; i<9; i++){
            if(grid[i][c] == k)
            return false;
        }
        //cube check
        int row = (r/3)*3;
        int col = (c/3)*3;
        
        for(int i=row; i<row+3; i++)
        {
            for(int j=col; j<col+3; j++)
            {
                if(grid[i][j] == k)
                return false;
            }
        
        }
        return true;
    }
    
}












//


















//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int grid[][] = new int[9][9];
            for(int i = 0; i < 9; i++)
            {
                for(int j = 0; j < 9; j++)
                grid[i][j] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            if(ob.SolveSudoku(grid) == true)
                ob.printGrid(grid);
            else
                System.out.print("NO solution exists");
            System.out.println();
            
        }
    }
}




// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int grid[][])
    {
        // add your code here
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        // add your code here
        
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
               System.out.print(grid[i][j] + " ");
            }
               System.out.println();
        }
    }
    
    static boolean helper(int [][]grid, int row , int col){
        
        if(row == grid.length){
            return true;
        }
        
        int nrow = 0;
        int ncol = 0;
        
        if(col != grid.length){
            nrow = row;
            col = col + 1;
        }
        else{
            nrow = row + 1;
            ncol = 0;
        }
        
        
        if(grid[row][col] != 0){
            if(helper(grid, row, col)){
                return true;
            }
        }
        else{
            for(int i=1; i<=9; i++){
                if(isSafe(grid, row, col, i)){
                    grid[row][col] = i;
                    if(helper(grid, row, col)){
                        return true;
                    }
                    else{
                        grid[row][col] = 0;
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean isSafe(int [][]grid, int row, int col, int num){
        
        for(int i=0; i<grid.length; i++){
            if(grid[i][col] == num){
                return false;
            }
            if(grid[row][i] == num){
                return false;
            }
        }
        
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;
        
        for(int i=0; i<sr+3; i++){
            for(int j=0; j<sc+3; j++){
                if(grid[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }
}