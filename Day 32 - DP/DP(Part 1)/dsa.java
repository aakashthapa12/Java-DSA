// public class dsa {
//     static int maxGold(int n, int m, int M[][])
//     {
//         // code here
//          int dp[][] = new int[n][m];
//         for(int j=m-1; j>=0; j--){
//             for(int i=n-1; i>=0; i--){
//                 if(j == m-1){
//                     dp[i][j] = M[i][j];
//                 }
//                 else if(i == 0){
//                     dp[i][j] = M[i][j] + Math.max(dp[i][j+1], dp[i+1][j+1]);
//                 }
//                 else if(i == n-1){
//                    dp[i][j] = M[i][j] + Math.max(dp[i][j+1], dp[i-1][j+1]);
//                 }
//                 else{
//                     dp[i][j] = M[i][j] + Math.max(dp[i][j+1], Math.max(dp[i-1][j+1], dp[i+1][j+1]));
//                 }
//             }
//         }
//         int max = dp[0][0];
//         for(int i=1; i<n; i++){
//             if(dp[i][0] > max){
//                 max = dp[i][0];
//             }
//         }
//         return max;
//     }
//     public static void main(String args[]) {
//     int [][]M = {{1, 3, 1, 5},
//      {2, 2, 4, 1},
//      {5, 0, 2, 3},
//      {0, 6, 1, 2}};
     
//     System.out.print(maxGold(4, 4, M));

//     }
// }


public class dsa {
    static Boolean isSubsetSum(int N, int arr[], int sum) {
        boolean dp[][] = new boolean[N + 1][sum + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = false;
                } else if (j == 0) {
                    dp[i][j] = true;
                } else {
                    if (dp[i - 1][j] == true) {
                        dp[i][j] = true;
                    } else {
                        int val = arr[i - 1];
                        if (j >= val) {
                            if (dp[i - 1][j - val] == true) {
                                dp[i][j] = true;
                            }
                        }
                    }
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    public static void main(String args[]) {
        int N = 6;
        int arr[] = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        System.out.print(isSubsetSum(N, arr, sum));
    }
}