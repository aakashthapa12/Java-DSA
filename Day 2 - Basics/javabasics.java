// public class javabasics{
//     public static void main(String args[]){
//         int a = 10;
//         int b = 10;
//         int sum = a+b;
//         System.out.println(sum);
//     }
// }


// Sum of a & b:

import java.util.*;

public class javabasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }     
}            


// Product of a & b:

// import java.util.*;

// public class javabasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int Product = a*b;
//         System.out.println(Product);
//     }
// }        


// Area of a circle

// import java.util.*;

// public class javabasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int radius = sc.nextInt();
//         float Area = 3.14f* (radius*radius);
//         System.out.println(Area);
//     }    
// }        
  


// Type Conversion

// import java.util.*;

// public class javabasics{
//     public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     float a = sc.nextInt();  // This is allowed
//     // int a = sc.nextFloat();  // This will give an error
//     }
// }


// Type Casting

// public class javabasics{
//     public static void main(String args[]){
//         float a = 25.43f;
//         int b = a;  // This will give an error (lossy conversion from float to int)
//         int b = (int)a;   // float is typecasted to integer
//         System.out.println(b);
//     }
// }


// public class javabasics{
//     public static void main(String args[]){
//         char ch = 'a';
//         int b = ch;   // character is typecasted into integer
//         System.out.println(b);
//     }
// }


// Type promotion in Expressions

// public class javabasics{
//     public static void main(String args[]){
//         char a = 'a';
//         char b = 'b';
//         System.out.println((int)b);
//         System.out.println((int)a);
//         System.out.println(b-a);
//     }
// }



// public class javabasics{
//     public static void main(String args[]){
//         short a = 5;
//         byte b = 25;
//         char c = 'c';
//         // byte bt = a + b + c;  // This will throw an error(Lossy conversion from int to byte).
//         byte bt = (byte)(a + b + c);  // integer is typecasted into byte
//         System.out.println(bt);    
//     }
// }  



// public class javabasics{
//     public static void main(String args[]){
//         int a = 10;
//         float b = 20.25f;
//         long c = 25;
//         double d = 30;
//         // int ans = a + b + c + d; // This will throw an error(Lossy conversion from double to int).
//         double ans = a + b + c + d;
//         System.out.println(ans);    
//     }
// }  



// public class javabasics{
//     public static void main(String args[]){
//         byte b = 5;
//         // b = b * 2;   // This will throw an error(Lossy conversion from int to byte).
//         b = (byte)(b * 2); 

//         System.out.println(b);    
//     }
// }  



