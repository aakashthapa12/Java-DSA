import java.util.*;

public class calculator {
    public static void main(String args[]) {
        while(1>0){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();
        System.out.println("Enter operator : ");  
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+' : System.out.println("Addition of " + a + " and " + b + " is " + (a + b));
                            break;
            case '-' : System.out.println("Subtraction of " + a + " and " + b + " is " + (a - b));
                            break;
            case '*' : System.out.println("Multiplication of " + a + " and " + b + " is " + (a * b));
                            break;
            case '/' : System.out.println("Division of " + a + " and " + b + " is " + (a / b));
                            break;
            case '%' : System.out.println("Remainder of " + a + " and " + b + " is " + (a % b));
                            break;
            default:
                System.out.println("wrong operator");              

        }
    }    
}  
}
  