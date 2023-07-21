
// public class a {
// public static void main(String args[]){
//    int n = 4;
//    for(int i = 1; i<=n; i++){
//         for(int j=1; j<=i; j++){
//             System.out.print("*");
//         }
//         System.out.println();
//    }     

// }

// }


// public class a {
// public static void main(String args[]){
//     int n = 4;
    
//     for(int i = 1; i<=n; i++){
//         for(int j = 1; j<=(n-i+1); j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }

// }

// }



// public class a {
// public static void main(String args[]){
//     int n = 4;
//     int num = 1;
//     for(int i = 1; i<=n; i++){
//         for(int j = 1; j<=i; j++){
//             System.out.print(num);
//             num++;
//         }
//         System.out.println();
//         num = 1;
//     }

// }

// }



// public class a {
// public static void main(String args[]){
//     int n = 4;
//     char ch = 'A';
//     for(int i = 1; i<=n; i++){
//         for(int j = 1; j<=i; j++){
//             System.out.print(ch);
//             ch++;
//         }
//         System.out.println();
//     }

// }

// }

// // // Advanced Pattern

// public class a {
// public static void main(String args[]){
//     int n = 4;
//     for(int i = 1; i<=n; i++){
//         if(i == 1 || i == 4){
//             for(int j = 1; j<=5; j++){
//                 System.out.print("*");
//         }
//         }
//         else{
//             for(int j = 1; j<=5; j++){
//                 if(j == 1 || j == 5){
//                     System.out.print("*");
//                 }
//                 else{
                    
//                     System.out.print(" ");
//                 }
//             }
//         }
//         System.out.println();
//     }
    
// }
    
// }



// public class a {
// public static void main(String args[]){
//     int n = 4;
    
//     for(int i = 1; i<=n; i++){
//         for(int j = 1; j<=n; j++){
//             if(j>(n-i)){
//             System.out.print("*");
//             }
//             else{
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();          
//     }

// }

// }     




// public class a {
// public static void main(String args[]){
//     int n = 5;
//     int num = 1;
    
//     for(int i = 1; i<=n; i++){
//         for(int j = 1; j<=(n-i+1); j++){
//             System.out.print(num);
//             num++;
//         }
//         System.out.println(); 
//         num = 1;         
//     }

// }

// }     




// public class a {
//     public static void main(String args[]){
//         int n = 5;
//         int num = 1;
        
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=i; j++){
//                 System.out.print(num + " ");
//                 num++;
//             }
//             System.out.println();        
//         }
    
//     }
    
//     }     




public class a {
    public static void main(String args[]){
        int n = 5;
        int a = 1, b = 0;
        
        for(int i = 1; i<=n; i++){
            if(i == 2 || i == 4){
                for(int j = 1; j<=i; j++){
                    if(j%2 != 0){
                        System.out.print(b);
                    }
                    else{
                        System.out.print(a);
                    }
                }
            }
            else{
                for(int j = 1; j<=i; j++){
                    if(j%2 != 0){
                        System.out.print(a);
                    }
                    else{
                        System.out.print(b);
                    }
                }
            }
            System.out.println();        
        }
    
    }
    
    }     