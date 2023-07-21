// 1. How many times "Hello" is printed. 

// public class Loops_Questions{
//     public static void main(String args[]){
//         for(int i = 0; i < 5; i++){
//             System.out.println("Hello");
//             i+=2;
//         }
//     }
// }


// 2. Write a program that reads a set of intergers, and then prints the sum of the even and odd integers.

import java.util.*;

public class Loops_Questions {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum_of_even_numbers = 0;
        int sum_of_odd_numbers = 0;

        for(int i = 1; i<=10; i++){
            System.out.print("Enter the number " + i + ": ");
            int num = sc.nextInt();
            
            if(num%2 == 0){
                sum_of_even_numbers+=num;
            }  
            else{
                sum_of_odd_numbers+=num;
            }
        }
      
        System.out.println("Sum of even numbers is " + sum_of_even_numbers);
        System.out.println("Sum of odd numbers is " + sum_of_odd_numbers);
  
    }    
}   



// 3. Write a program to find the factorial of any number entered by the user.

// import java.util.Scanner;

// public class Loops_Questions{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
        // int i = sc.nextInt(); // To hold number
//         int factorial = 1;  // To hold factorial
//         if(i == 0 || i == 1){
//             System.out.println("factorial of " + i + " is: " + factorial);
//         }
//         else{
//             for(int a = 2; a<=i; a++){
//                 factorial *= a;
//             }    
//             System.out.println("factorial of " + i + " is: " + factorial);
//         }
//     }
// }


// 4. Write a program to print the multiplication table of a number N, entered by the user.

// import java.util.Scanner;

// public class Loops_Questions{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int a = sc.nextInt();

//         System.out.println("*** Multiplication table of " + a + " is ***");
//         for(int i=1; i<=10; i++){
//             int mul = a*i;
//             System.out.println(a + " X " + i + " = " + mul);
//         }
        
//         System.out.println("Thanks for giving input!");
//     }
// }


// 5. What is wrong in the following pattern?

// public class Loops_Questions{
//     public static void main(String args[]){
//         for(int i = 0; i <= 5; i++){
//             System.out.println("i = " + i);
//         }
//         System.out.println("i after the loop = " + i);
//     }
// }


