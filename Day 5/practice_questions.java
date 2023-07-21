  // 1. Write a Java method to compute the average of three numbers.

  // public class practice_questions {
  // public static float calAverage(int a, int b, int c){
  //     float avg = (float)(a+b+c)/3;
  //     return avg;

  // }
  // public static void main(String args[]){
  //      float Average =calAverage(5,6,8);
  //      System.out.println("Average of 3 numbers is "+Average);

  // }

  // }



  /* 2. Write a method named isEven that accepts an int argument. The method should return true if the argument
      is even, or false otherwise. Also write a program to test your method. */  

  // import java.util.*;

  // public class practice_questions {

  //     public static boolean isEven(int num){
  //         if(num%2 == 0){
  //             return true;
  //         }
  //         else{
  //             return false;
  //         }

  //     }
  // public static void main(String args[]){
  //    Scanner sc = new Scanner(System.in);
  //    System.out.print("Enter the number: ");
  //    int num = sc.nextInt();

  //    if(isEven(num)){
  //     System.out.print(num + " is Even Number");
  //    }
  //    else{
  //     System.out.print(num + " is Odd Number");
  //    }

  // }

  // }




  /* 3. Write a Java program to check if a number is palindrome in Java? */


  // public class practice_questions {

  // public static int reverse(int n){
  //     int rev = 0;
  //     while(n>0){
  //       int Last_digit = n%10;
  //       rev = rev*10 + Last_digit;
  //       n/=10;
  //   }
  //     return rev;
  //   }
  
  // public static void main(String args[]){
  //   int n = 122;
  //   reverse(n);
  //   if(n == reverse(n)){
  //     System.out.println(n + " is a palindrome");
  //   }
  //   else{
  //     System.out.println(n + " is not a palindrome");
  //   }
  // }   

  // }  


// 4. Java Math Example

// 1. Use of Math.min(a, b)

// public class practice_questions {
// public static void main(String args[]){
//     int a = 54, b = 36;
//     System.out.println("Minimum number is: "+Math.min(a,b));

// }

// }


// // 2. Use of Math.max(a, b)

// public class practice_questions {
// public static void main(String args[]){
//     int a = 54, b = 36;
//     System.out.println("Maximum number is: "+Math.max(a,b));

// }

// }


// // 3. Use of Math.sqrt(a)

// public class practice_questions {
// public static void main(String args[]){
//     int a = 54;
//     System.out.println("Square root of a is: "+Math.sqrt(a));

// }

// }



// // 4. Use of Math.cube(a)

// public class practice_questions {
// public static void main(String args[]){
//     int a = 64;
//     System.out.println("cube root of a is: "+Math.cbrt(a));

// }

// }



// // 5. Use of Math.pow(Base,power)

// public class practice_questions {
// public static void main(String args[]){
//     int a = 3;
//     System.out.println("Square of a is: "+Math.pow(a,2));
//     System.out.println("Cube of a is: "+Math.pow(a,3));

// }

// }



// // 6. Use of Math.avg(a)

// public class practice_questions {
// public static void main(String args[]){
//     int a = -3;
//     float b = 4.5f;
//     System.out.println("Absoulte value of a is: "+Math.abs(a));
//     System.out.println("Absoulte value of b is: "+Math.abs(b));
// }
// }



// 6. Use of Math.avg(a)

// public class practice_questions {
// public static void main(String args[]){
//     int a = 3;
//     int b = 5;
//     System.out.println("Average of a is : "+Math.avg(a));
//     System.out.println("Absoulte value of b is: "+Math.abs(b));
// }
// }


// 5.


public class practice_questions {
  public static int Sum_of_digits(int n){
    int sumDigit = 0;
    while(n>0){
      int last_Digit = n%10;
      sumDigit+=last_Digit;
      n/=10;
    }
    return sumDigit;
  }
public static void main(String args[]){
    int a = Sum_of_digits(89);
    System.out.println("sum of digits is: "+a);
}

}