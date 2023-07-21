public class Palindromic_pattern {
    public static void palindrome_pattern(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
 
                System.out.print("  ");
            }

            // descending
                for (int j = i; j >=1; j--) {
                        System.out.print(j+" ");
                }
                
            // ascending
                for (int j = 2; j <=i; j++) {
                        System.out.print(j+" ");
                }
      
                System.out.println();
    }
}
    public static void main(String args[]) {
        palindrome_pattern(5);
    }
}
 



// public class Palindromic_pattern {
//     public static void palindrome_pattern(int n) {

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= (n - i); j++) {
 
//                 System.out.print("  ");
//             }

//             int counter = i;

//                 for (int j = 1; j <=i; j++) {
//                         System.out.print(counter+" ");
//                         counter--;
//                 }

//                 if(i > 1){
//                     for (int j = 2; j <=i; j++) {
//                         System.out.print(j+" ");
              
//                 }
//             }
//             System.out.println();
//     }
// }
//     public static void main(String args[]) {
//         palindrome_pattern(5);
//     }
// }
 



