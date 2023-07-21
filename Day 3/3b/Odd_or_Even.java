import java.util.*;

public class Odd_or_Even {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a%2==0 && b%2!=0){
            System.out.println(a + " is even and " + b + " is odd");
        }
        else{
            System.out.println(a + " is odd and " + b + " is even");
        }
    }
}
