// // 1.

// import java.util.*;
// public class a {
//     public static int sum(int a, int b){
//         return a+b;
//     }
// public static void main(String args[]){
//     System.out.println("Enter the first number: ");
//     int a = new Scanner(System.in).nextInt();    
//     System.out.println("Enter the second number: ");
//     int b = new Scanner(System.in).nextInt(); 
//     System.out.println("Sum of a and b is "+sum(a, b));   

// }

// }

// 2.

// public class a {
//     public static int mutply(int a, int b){
//         int c = a*b;

//         return c;

//     }
// public static void main(String args[]){
//    int a = 5;
//    int b = 10;
//     System.out.println(mutply(a, b));
// }

// }

// import java.util.*;
// public class a {
//     public static int Factorial(int x){
//         int factorial = 1;
//         if(x == 0 || x == 1){
//             return 1;
//         }
//         else{
//             for(int i = 2; i<=x; i++){
//                 factorial *= i;
//             }
//         }
//         return factorial;
//     }
// public static void main(String args[]){
//     int x = new Scanner(System.in).nextInt();    
//     System.out.println("Factorial is: "+Factorial(x));     

// }

// }

// 3.

// import java.util.*;
// public class a {
//     public static int Factorial(int x) {
//         int factorial = 1;
//         if (x == 0 || x == 1) {
//             return 1;
//         } else {
//             for (int i = 2; i <= x; i++) {
//                 factorial *= i;
//             }
//         }
//         return factorial;
//     }

//     public static int BinomialCoefficient(int n, int r) {
//        int nb = Factorial(n);
//         int rb = Factorial(r);
//         int nrb = Factorial(n-r);
//         int binCoefficient = Factorial(n)/ (Factorial(r) * Factorial(n-r));
//         return binCoefficient;

//     }

//     public static void main(String args[]) {
//         System.out.print("Enter the value of n: ");
//         int n = new Scanner(System.in).nextInt();
//         System.out.print("Enter the value of r: ");
//         int r = new Scanner(System.in).nextInt();
        
//         System.out.print("Value of Binomial Coefficient is: "+ BinomialCoefficient(n, r));  
//     }

// }



// 4.
// import java.util.*;
// public class a {
//     public static boolean isPrime(int x){
//         if(x == 2){
//             return true;
//         }
//         else{
//             for(int i=2; i<=Math.sqrt(x); i++){
//                 if(x%i==0){   
//                     return false;
//                 }
//             }
//         }
//         return true;
//     } 
// public static void main(String args[]){   
//     System.out.print("Enter the value of x: ");
//     int x = new Scanner(System.in).nextInt();

//     if(isPrime(x) == true){
//         System.out.println(x+" is a Prime Number");   
//     }   
//     else{

//         System.out.println(x+" is not a Prime Number");
//     }

        

// }

// }


// 5.
import java.util.*;
public class a {
    public static boolean primeNumbers(int n){
        if(n == 2){
            return true;
        }
        else{
            for(int i = 2; i<=Math.sqrt(n); i++){
                if(n%2 == 0){
                    return false;
                }
            }
        }
            return true;
    }

    public static void isPrimeRange(int r){
        for(int i = 2; i<=r; i++){
            if(primeNumbers(i) == true){
                System.out.println(i+" is a Prime Number");
            }
        }
    }
        
public static void main(String args[]){
     System.out.print("Enter the value of range: ");
     int range = new Scanner(System.in).nextInt();   
     isPrimeRange(range);

}

}