// import java.util.*;

// public class syntax_with_parameters {
//     public static void calculateSum(){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println("sum is : " + sum);
//         return;
//     }
//     public static void main(String args[]){
//         calculateSum(); 
//     } 
// }



import java.util.*;

public class syntax_with_parameters {
    public static void calculateSum(int num1, int num2){  // In function, value inside parenthesis are called parameters or formal parameters.
        int sum = num1 + num2;
        System.out.println("sum is : " + sum);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a,b);  // In main function, value inside parenthesis are called arguments or actual parameters.
        
    } 
}
  