// public class Advanced_pattern {
//     public static void main(String args[]){
//         for(int line=1; line<=4; line++){
//             if(line == 1 || line == 4){
//                 for(int j = 1; j<=5; j++){
//                     System.out.print("*");

//                 }
//             }
//             else{
//                 for(int j = 1; j<=5; j++){
//                     if(j == 1 || j == 5){
//                         System.out.print("*");
//                     }
//                     else{
//                         System.out.print(" ");

//                     }
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// public class Advanced_pattern {
//     public static void main(String args[]){
//         int n = 4;  // Total no. of lines 

//         for(int i=1; i<=n; i++){
//                 for(int j = 1; j<=n; j++){
//                     if(j < (n-i+1)){
//                         System.out.print(" ");
//                     }
//                     else{
//                         System.out.print("*");
//                     }
//                 }
//             System.out.println();     
//         }
//     }
// }

// public class Advanced_pattern {
//     public static void main(String args[]){
//         int n = 5;  // Total no. of lines 
//         int number = 1;

//         for(int i=1; i<=n; i++){
//                 for(int j = 1; j<=(n-i+1); j++){
//                     System.out.print(number);
//                     number++;
//                 }
//                 number = 1;
//             System.out.println();     
//         }
//     }
// }

// public class Advanced_pattern {
//     public static void main(String args[]){
//         int n = 5;  // Total no. of lines 
//         int number = 1;

//         for(int i=1; i<=n; i++){
//                 for(int j = 1; j<=n; j++){
//                     if(j<=i){
//                         System.out.print(number + " ");
//                         number++;
//                     }
//                     else{
//                         System.out.print(" ");
//                     }
//                 }     
//             System.out.println();     
//         }  
//     }
// }




// public class Advanced_pattern {
//     public static void main(String args[]) {
//         int n = 5; // Total no. of lines
//         int x = 1;
//         int y = 0;

//         for (int i = 1; i <= n; i++) {
//             if (i % 2 != 0) {
//                 for (int j = 1; j <= i; j++) {

//                     if (j % 2 != 0) {
//                         System.out.print(x + " ");
//                     } else {
//                         System.out.print(y + " ");
//                     }

//                 }

//             } 
//             else {
//                 for (int j = 1; j <= i; j++) {

//                     if (j % 2 == 0) {
//                         System.out.print(x + " ");
//                     } else {
//                         System.out.print(y + " ");
//                     }

//                 }

//             }
//             System.out.println();
//         }
//     }

// }



public class Advanced_pattern {
    public static void main(String args[]){
        int n = 4;  // Total no. of lines

        for(int i=1; i<=n; i++){
                for(int j = 1; j<=i; j++){
                    System.out.print("*" + " ");
                }  
                System.out.println();     
    }
        for(int i=1; i<=n; i++){
                for(int j = 1; j<=(n-i+1); j++){
                    System.out.print("*" + " ");
                }  
                System.out.println();     
    }
}    
}