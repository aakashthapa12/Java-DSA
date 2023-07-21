
/* Write a program to print Fibonacci series of n terms where n is input by user:
 
   0 1 1 2 3 5 8 13 21 .....
   In the fibonacci series, a number is the sum of the previous 2 numbers that came before it. */


// import java.util.*;
// public class a {    
//     public static int fiboValue(int n){
//         int fibonacci_value;
//         if(n == 1){
//             fibonacci_value = 0;
//         }
//         else if(n == 2){
//             fibonacci_value = 1;
//         }
//         else{
//             fibonacci_value = fiboValue(n-1) + fiboValue(n-2);
//         }
//         return fibonacci_value;

//     }


//     public static void fiboSeries(int n){
//         System.out.println("Fibonnacci series is given below: ");
//         for(int i = 1; i<=n; i++){
//             System.out.print(fiboValue(i)+" ");
//         }
//     }

// public static void main(String args[]){
//    Scanner sc = new Scanner(System.in);

//    while(true){

//     System.out.print("\nEnter the value of n: ");
//     int n = sc.nextInt();
//     fiboValue(n);
//     fiboSeries(n);  
//    }  
   
// }
// }




// Write a function that calculated the Greatest Common Divisor of 2 numbers.

// import java.util.*;

// public class a {
//     public static void gcD(int a, int b){
//         int n1 = a, n2 = b;
//         int gcD = 1;
//         for(int i = 2; i<=9; i++){
//             while(a%i == 0 && b%i == 0){
//                     gcD *= i;
//                     a/=i;
//                     b/=i;
//             } 
//         } 
//         System.out.println("Greatest Common Divisor of " +n1+ " and " +n2+ " is: "+gcD);      
    
//     }   
// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);  

//     while(true){
//         System.out.print("Enter the 1 number: ");
//         int num1 = sc.nextInt();
//         System.out.print("Enter the 2 number: ");
//         int num2 = sc.nextInt();

//         gcD(num1, num2);
//     }
    
    
// } 
     
// }




// (printing value of x to the power n)

// import java.util.*;

// public class a {
//     public static void numRaisedtoNum(int x, int n){
//         System.out.println("Value of " + x + " raised to the power " +n+ " is: "+Math.pow(x,n));
//     }
// public static void main(String args[]){
//    Scanner sc = new Scanner(System.in);
//    while(true){
//     System.out.println("Enter the value of x: ");
//     int x = sc.nextInt();
//     System.out.println("Enter the value of x: ");
//     int n = sc.nextInt();

//     numRaisedtoNum(x, n);
//    }     

// }

// }





// (displaying +,-,0 count)

// import java.util.*;

// public class otherFunctionsquestion{
//    public static void count(int n){
      
//    }
// public static void main(String args[]){
//    Scanner sc = new Scanner(System.in);
//    while(true){
//     System.out.print("How many numbers you want to enter: ");
//     int count = sc.nextInt();
//     int count_zeros = 0;
//     int count_posNum = 0;    
//     int count_negNum = 0;

//     for(int i = 1; i<=count; i++){ 
//      System.out.print("Enter the " +i+ " num: ");
//      int num = sc.nextInt();
     
//      if(num>0){
//         count_posNum++;
//      }
//      else if(num<0){
//         count_negNum++;
//      }
//      else{
//         count_zeros++;
//      }
//     }
//     System.out.println("Number of times you entered positive number is: "+count_posNum);
//     System.out.println("Number of times you entered zeros is: "+count_zeros);
//     System.out.println("Number of times you entered negative number is: "+count_negNum);

// }
// }
// }   






// import java.util.*;

// public class a {
//     public static void Average(int a, int b, int c){
//         float avg = (float)(a+b+c)/3;
//         System.out.println("Average of "+a+","+b+" & "+c+" is: "+avg);
//     }
// public static void main(String args[]){
//    Scanner sc = new Scanner(System.in);
   
//    while(true){
//     System.out.print("Enter the first number: ");
//     int num1 = sc.nextInt();
//     System.out.print("Enter the second number: ");
//     int num2 = sc.nextInt();
//     System.out.print("Enter the third number: ");
//     int num3 = sc.nextInt();
 
//     Average(num1, num2, num3); 
//    }

// }

// }



// import java.util.*;

// public class a {
//     public static boolean isEven(int a){
//         if(a%2 == 0){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
    
//     while(true){
//         System.out.print("Enter the number:");
//         int num = sc.nextInt();

//         if(isEven(num) == true){
//             System.out.println(num+ " is Even Number");
//         }
//         else{
//             System.out.println(num+ " is Odd Number");
//         }
//     }

// }

// }





