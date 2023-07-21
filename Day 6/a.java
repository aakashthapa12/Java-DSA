// public class a {
//     public static void hollow_rectangle(int totrows, int totcols){
//         for(int i = 1; i<=totrows; i++){
//             for(int j = 1; j<=totcols; j++){
//                 if(i == 1 || i == totrows || j == 1 || j == totcols){
//                     System.out.print("*"+" ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]){
//         hollow_rectangle(4, 5);
//     }
// }

// public class a {
//     public static void half_pyramid(int n){
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=(n-i); j++){
//                     System.out.print(" ");
//             }
//             for(int j = 1; j<=i; j++){
//                     System.out.print("*");
//                 }
//                 System.out.println();
//             }
//         }

//     public static void main(String args[]){
//         half_pyramid(4);
//     }
// }  

// public class a {
//     public static void inverted_half_pyramid(int n){
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=(n-i+1); j++){
//                     System.out.print(j+" ");
//             }
//                 System.out.println();
//             }
//         }

//     public static void main(String args[]){
//         inverted_half_pyramid(5);
//     }
// }  

// public class a {
//     public static void floyds_triangle(int n){
//         int counter = 1;

//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=i; j++){
//                     System.out.print(counter+" ");
//                     counter++;
//             }
//                 System.out.println();
//             }
//         }

//     public static void main(String args[]){
//         floyds_triangle(5);
//     }
// }  

// public class a {
//     public static void floyds_triangle(int n){

//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=i; j++){
//                 if((i+j)%2 == 0){
//                     System.out.print("1"+" ");
//                 }
//                 else{

//                     System.out.print("0"+" ");
//                 }
//             }
//                 System.out.println();
//             }
//         }

//     public static void main(String args[]){
//         floyds_triangle(5);
//     }
// }  

public class a {
    public static void Butterfly(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                    System.out.print("*");
            }
            for(int j = 1; j<=2*(n-i); j++){
                    System.out.print(" ");
            }   
            for(int j = 1; j<=i; j++){
                    System.out.print("*");
            }
                System.out.println();
            }

        for(int i = n; i>=1; i--){
            for(int j = 1; j<=i; j++){
                    System.out.print("*");
            }
            for(int j = 1; j<=2*(n-i); j++){
                    System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                    System.out.print("*");
            }
                System.out.println();
            }
        }
    }

//     public static void main(String args[]){
//         Butterfly(4);
//     }
// }  

// public class a {
//     public static void solid_rhombus(int n){
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=(n-i); j++){
//                     System.out.print("  ");
//             }
//             for(int j = 1; j<=n; j++){
//                     System.out.print("*" + " ");
//             }
//                 System.out.println();
//             }
//         }

//     public static void main(String args[]){
//         solid_rhombus(5);
//     }
// }  

// public class a {
//     public static void Diamond(int n){
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=(n-i); j++){
//                     System.out.print("  ");
//             }
//             for(int j = 1; j<=(2*i)-1; j++){
//                     System.out.print("*" + " ");
//                 }
//                 System.out.println();
//             }

//         for(int i = n; i>=1; i--){
//             for(int j = 1; j<=(n-i); j++){
//                     System.out.print("  ");
//             }
//             for(int j = 1; j<=(2*i)-1; j++){
//                     System.out.print("*" + " ");
//                 }
//                 System.out.println();
//             }
//         }

//     public static void main(String args[]){
//         Diamond(4);
//     }
// }  



// public class a {
//     public static void Number_pyramid(int n) {

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= (n - i); j++) {

//                 System.out.print(" ");
//             }
//             if(i == 2 || i == 4){
//                 for (int j = 1; j <= (2*i)-1; j++) {
//                     if ((i + j) % 2 != 0) {
//                         System.out.print(i);
//                     }
//                     else { 
//                         System.out.print(" ");
//                     }
//                 }
//             }
//             else{
//                 for (int j = 1; j <= (2*i)-1; j++) {
//                     if ((i + j) % 2 == 0) {
//                         System.out.print(i);
//                     }
//                     else { 
//                         System.out.print(" ");
//                     }
//                 }
//             }
            
//             System.out.println();
//         }
//     }

//     public static void main(String args[]) {
//         Number_pyramid(5);
//     }
// }





// public class a {
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




// public class a {
//     public static void palindrome_pattern(int n) {

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= (n - i); j++) {
 
//                 System.out.print(" ");
//             }

//             int counter = i;

//                 for (int j = 1; j <=i; j++) {
//                         System.out.print(counter);
//                         counter--;
//                 }

//                 if(i > 1){
//                     for (int j = 2; j <=i; j++) {
//                         System.out.print(j);
              
//                 }
//             }
//             System.out.println();
//     }
// }
//     public static void main(String args[]) {
//         palindrome_pattern(5);
//     }
// }
 


