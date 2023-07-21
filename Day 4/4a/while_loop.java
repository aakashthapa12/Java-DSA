// // Print Hello world 100 times

// public class while_loop{
//     public static void main(String args[]){
//         int counter = 0;
//         while(counter < 100){
//             System.out.println("Hello world");
//             counter++;
//         }
        
//         System.out.println("printed HW 100x");
        
// }
// }       


// Print number from 1 to 10

// public class while_loop{
//     public static void main(String args[]){
//         int number = 1;
//         while(number <= 10){
//             System.out.print(number + " ");
//             number++;
//         }

//         System.out.println("");
//         System.out.println("printed 1 to 10");
        
// }
// }       


// //  Print number from 1 to n.

// import java.util.*;

// public class while_loop{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of range: ");
//         int range = sc.nextInt();

//         int number = 1;
//         while(number <= range){
//             System.out.print(number + " ");
//             number++;   
//         }

//         System.out.println("");
//         System.out.println("printed 1 to " + range);
        
// }
// }      




//  Print sum of first n natural number.

import java.util.*;

public class while_loop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of range: ");
        int range = sc.nextInt();

        int i = 1;
        int sum = 0;
        while(i <= range){
            sum += i;
            i++;   
        }
        
        System.out.println("Sum of first " + range + " natural numbers is " + sum);
        
}
}      