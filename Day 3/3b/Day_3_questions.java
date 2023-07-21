// import java.util.*;

// public class Day_3_questions {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         if(num>0){
//             System.out.println(num + " is positive number");
//         }
//         else{
//             System.out.println(num + " is negative number");
//         }
//     }
// }


// 2.

// public class Day_3_questions {
//     public static void main(String args[]){
//         double temp = 103.5;

//         if (temp>100){
//             System.out.println("You have a fever");
//         }
//         else{
//             System.out.println("You don't have a fever");
//         }

//     }
// }


// 3.

// import java.util.*;

// public class Day_3_questions {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         /* Input week number from user */
//         System.out.println("Enter week number(1-7): ");
//         int week_number = sc.nextInt();
//         String Day = sc.next();

//         switch (week_number) {
//             case 1:
//                 System.out.println(Day + " is the day of week " + week_number);
//                 break;
//             case 2:
//                 System.out.println(Day + " is the day of week " + week_number);
//                 break;
//             case 3:
//                 System.out.println(Day + " is the day of week " + week_number);
//                 break;
//             case 4:
//                 System.out.println(Day + " is the day of week " + week_number);
//                 break;
//             case 5:
//                 System.out.println(Day + " is the day of week " + week_number);
//                 break;
//             case 6:
//                 System.out.println(Day + " is the day of week " + week_number);
//                 break;
//             case 7:
//                 System.out.println(Day + " is the day of week " + week_number);
//                 break;
//             default:
//                 System.out.println("Only (1-7) week numbers are there");
//         }
//     }
// }


// 4.

// public class Day_3_questions {
// public static void main(String args[]){
// int a = 63, b = 36;
// boolean x = (a < b) ? true: false;
// int y = (a > b) ? a : b;

// System.out.println(x);
// System.out.println(y);
// }
// }


// 5.

// import java.util.*;

// public class Day_3_questions {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Input the year: ");
//         long year = sc.nextInt();

//         boolean x = (year % 4) == 0;
//         boolean y = (year % 100) != 0;
//         boolean z = (year % 100 == 0) && (year % 400 == 0);

//         if(x && (y||z)) {
//             System.out.println(year + " is a leap year");
//         }
//         else{
//              System.out.println(year + " is not a leap year");
//         }

//     }
// }