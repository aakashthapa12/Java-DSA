import java.util.*;

public class largest_of_3 {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            float num1 = sc.nextFloat();
            float num2 = sc.nextFloat();
            float num3 = sc.nextFloat();
    
            if(num1 > num2 && num1 > num3){
                System.out.println(num1 + " is largest of 3 numbers");
            }
            else if(num2 > num3){
                System.out.println(num2 + " is largest of 3 numbers");
            }
            else{
                System.out.println(num3 + " is largest of 3 numbers");
            }
        }
    }



