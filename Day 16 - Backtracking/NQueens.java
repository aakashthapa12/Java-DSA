
class Solution{
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        
        int chess[][] = new int[n][n];
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        helper(chess, 0, ans);
        return ans;
    }
    
// 1. This is our 1st function --> helper function: 

    static void helper(int [][]chess, int row, ArrayList<ArrayList<Integer>> ans){
        // This is our base case : when we have to return.
        if(row == chess.length){ 
            result(chess, ans); // This is our 4th function (See its code below)
            return;
        }
        
        
        // * Important : These few lines of code holds the concept of Backtracking(very important). So, Understand this thoroughly.
        for(int col = 0; col<chess.length; col++){
            if(isSafeforQueen(chess, row, col)){
                chess[row][col] = 1; // while putting queen we will make chess[row][col] = 1.
                helper(chess, row+1, ans);
                chess[row][col] = 0; // while returning we have to make chess[row][col] = 0.
        }
        
    }

    }

// 2. This is our 2nd Function --> saveBoard Function : 
//    This code is simple but sometime we forget how to convert String into Integer 
//    as we need to return our ans in the form of ArrayList<ArrayList<Integer>> .

// So, To convert String into Integer : we will use Integer.parseInt();

    static void result(int [][]chess, ArrayList<ArrayList<Integer>> ans){
        String row = "";
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i=0; i<chess.length; i++){
            for(int j=0; j<chess.length; j++){
                if(chess[i][j] == 1){
                    row = (j+1)+"";  // Here we store our values as string and then covert it into Integer.
                }
            }

            int a = Integer.parseInt(row);
            res.add(a);  // here, Answer will be store in the form of ArrayList<Integer>
        }
        
        ans.add(res);  // here, Answer will be store in the form of ArrayList<ArrayList<Integer>>
    }
    
    
// 3. This is our 3rd function --> isSafeforQueen Function : 
//    This will check if a queen is present in chess[i][j] (ith row,jth col) or not.
//    Means, (i) - if chess[i][j] == 1 for ith row & jth col then, it wil return false.
//    false --> indicates that queen is present in chess[i][j] and hence we cannot put queen on chess[i][j].

//    Means, (ii) - if chess[i][j] != 1 for ith row & jth col then, it wil return true.
//    false --> indicates that queen is not present in chess[i][j] and hence we can put queen on chess[i][j].

     public static boolean isSafeforQueen(int [][]chess, int row, int col){
        for(int i=row-1, j = col; i>=0; i--){
            if(chess[i][j] == 1){
                return false;
            }
        }
        for(int i=row-1, j = col-1; i>=0 && j>=0; i--, j--){
            if(chess[i][j] == 1){
                return false;
            }
        }
        for(int i=row-1, j = col+1; i>=0 && j<chess.length; i--, j++){
            if(chess[i][j] == 1){
                return false;
            }
        }
        return true;
    }
}

