// // import java.util.*;
// // public class a {
// // public static void main(String args[]){
// //     Scanner sc = new Scanner(System.in);
// //     System.out.print("Enter the cost of pencil: ");
// //     float cost_pencil = sc.nextFloat();

// //     System.out.print("Enter the cost of pen: ");
// //     float cost_pen = sc.nextFloat();

// //     System.out.print("Enter the cost of eraser: ");
// //     float cost_eraser = sc.nextFloat();

// //     // Bill without gst
// //     float bill = (cost_pencil + cost_pen + cost_eraser);
// //     System.out.println("Bill without gst is : " + bill);

// //     // Bill with gst
// //     float gst = 0.18f;
// //     float bill_with_gst = (cost_pencil + cost_pen + cost_eraser) + ((cost_pencil*0.18f) + (cost_pen*0.18f) + (cost_eraser*0.18f));
// //     System.out.println("Bill with gst is : " + bill_with_gst);
// // }

// // }


// // import java.util.*;

// // public class a {
// // public static void main(String args[]){
// //     Scanner sc = new Scanner(System.in);
// //     System.out.print("Enter the number: ");
// //     double num = sc.nextDouble();

// //     if(num > 0){
// //         System.out.print(num + " is positive number");
// //     }
// //     else{
// //         System.out.print(num + " is negative number");
// //     }

// // }

// // }



// // import java.util.*;

// // public class a {
// // public static void main(String args[]){
// //      Scanner sc = new Scanner(System.in);
// //      System.out.print("Enter the temperature: ");
// //      int temperature = sc.nextInt();

// //      if(temperature>100){
// //         System.out.print("You have a fever");
// //     }
// //     else{
// //     System.out.print("You don't have a fever");
// //     }


// // }
 
// // }



// // import java.util.*;

// // public class a {
// // public static void main(String args[]){
// //     Scanner sc = new Scanner(System.in);
// //     System.out.print("Enter the week number(1-7): ");
// //     int week_number = sc.nextInt();

// //     switch(week_number){
// //         case 1: System.out.println("Monday");
// //                     break;
// //         case 2: System.out.println("Tueday");
// //                     break;
// //         case 3: System.out.println("Wednesday");
// //                     break;
// //         case 4: System.out.println("Thursday");
// //                     break;
// //         case 5: System.out.println("Friday");
// //                     break;
// //         case 6: System.out.println("Saturday");
// //                     break;
// //         case 7: System.out.println("Sunday");
// //                     break;
// //         default : System.out.println("Invalid Number!");
                
// //     }

// // }

// // }


// // import java.util.*;

// // public class a {
// // public static void main(String args[]){
// //     Scanner sc = new Scanner(System.in);
// //     System.out.print("Enter the year: ");
// //     int year = sc.nextInt();

// //     boolean x = (year%4 == 0);
// //     boolean y = (year%100 !=0);
// //     boolean z = ((year%100 == 0) && (year%400 == 0));

// //     if(x && (y || z)){
// //         System.out.println(year + " is a leap year");
// //     }
// //     else{
// //         System.out.println(year + " is not a leap year");
// //     }
// // }

// // }



// // import java.util.*;

// // public class a {
// // public static void main(String args[]){
// //     Scanner sc = new Scanner(System.in);
// //     int sum_odd_numbers = 0;
// //     int sum_even_numbers = 0;

// //     for(int i = 1; i<=10; i++){
// //         System.out.print("Enter the " + i + " number: ");
// //         int num = sc.nextInt();

// //         if(num%2 == 0){
// //             sum_even_numbers += num;
// //         }
// //         else{
// //             sum_odd_numbers += num;
// //         }

// //     }

// //     System.out.println("Sum of all even numbers is : " + sum_even_numbers);
// //     System.out.println("Sum of all even numbers is : " + sum_odd_numbers); 

// // }



// // import java.util.*;

// // public class a {
// // public static void main(String args[]){
// //     Scanner sc = new Scanner(System.in);
// //     System.out.print("Enter the number: ");
// //     int number = sc.nextInt();
// //     int factorial = 1;


// //     if(number == 0 || number == 1){
// //         System.out.println("Factorial of " + number + " is " + factorial);
// //     }
// //     else if(number<0){
// //         System.out.println("Factorial of negative numbers does not excited!");
// //     }
// //     else{
// //         for(int i = 1; i<=number; i++){
// //             factorial *= i;
// //         } 
// //         System.out.println("Factorial of " + number + " is " + factorial);
// //     }

// // }

// // }


// import java.util.*;

// public class a {
// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the number: ");
//     int num = sc.nextInt();
    
//     System.out.println("*** Multiplication table of " + num + " ***");
//     for(int i = 1; i<=10; i++){
//         System.out.println(num + " X " + i + " = " + num*i);
//     }    
    
//     System.out.println("Thanks for coding!");

// }

// }




import java.util.*;
public class a {
    static boolean isPresent(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }      
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 2, 3, 4, 5 };
        int num = sc.nextInt();
        System.out.print(isPresent(arr, num));                 
        
    }  
    
}
