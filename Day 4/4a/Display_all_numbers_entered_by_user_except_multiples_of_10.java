import java.util.Scanner;

public class Display_all_numbers_entered_by_user_except_multiples_of_10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter the number: ");
            int i = sc.nextInt();

            if(i%10 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
