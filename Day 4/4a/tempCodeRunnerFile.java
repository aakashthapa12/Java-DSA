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

