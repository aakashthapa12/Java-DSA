
// public class Number_pyramid {
//     public static void Number_pyramid(int n) {

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= (n - i); j++) {

//                 System.out.print(" ");
//             }

//                 for (int j = 1; j <= (2*i)-1; j++) {
//                     if (j % 2 != 0) {     // in this value of j must be odd to print value in right position.
//                         System.out.print(i);
//                     }
//                     else { 
//                         System.out.print(" ");
//                     }
//                 }
            
//             System.out.println();
//         }
//     }

//     public static void main(String args[]) {
//         Number_pyramid(5);
//     }
// }






public class Number_pyramid {
    public static void Number_pyramid(int n) {
        
        // outer loop
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            
            // numbers
                for (int j = 1; j <= i; j++) {
                       System.out.print(i+" ");
                }
            
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Number_pyramid(5);
    }
}


