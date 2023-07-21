// // Length of the largest subarray with contiguous elements

// import java.util.*;
// public class _1 {
//     public static int solution(int []arr){
//         int ans = 0;

//         for(int i=0; i<arr.length-1; i++){
//             int min = arr[i];
//             int max = arr[i];
//             Set<Integer> check_duplicacy = new HashSet<>();
//             check_duplicacy.add(arr[i]);

//             for(int j=i+1; j<arr.length; j++){
//                 if(check_duplicacy.contains(arr[j])){
//                     break;
//                 }
//                 check_duplicacy.add(arr[j]);
//                 min = Math.min(min, arr[j]);
//                 max = Math.max(max, arr[j]);
//                 if(max-min == j-i){
//                     int len = j-i+1;
//                     if(len > ans){
//                         ans = len;
//                     }
//                 }
//             }
//         }
//         return ans;
//     }
//     public static void main(String args[]){
//         int []arr = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
//         int ans = solution(arr);
//         System.out.println(ans);
//     }
// }

import java.util.*;
public class _1{
    static int missingNumber(int array[], int n) {
        // Your Code Here
        int i = 0;
        int j = 1;
        int ans = 0;
        Arrays.sort(array);
        while(i < n && j < n){
            if(array[j]-array[i] == 1){
                continue;
            }
            ans += array[i]+1;
            i++;
            j++;
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,5};
        int n = arr.length;
        System.out.print(missingNumber(arr,n));
    }
}