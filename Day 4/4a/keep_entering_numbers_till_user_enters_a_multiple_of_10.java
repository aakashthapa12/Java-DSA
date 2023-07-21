// By while loop

// import java.util.*;

// public class keep_entering_numbers_till_user_enters_a_multiple_of_10 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         while(true){
//         System.out.print("Enter the number: ");
//         int i = sc.nextInt();
        
//         if(i%10 == 0){   
//             break;
//         }
//         System.out.println(i);
//         }
//         System.out.println("Now, I am out of the loop");
// }
// }


// By do while loop

import java.util.*;

public class keep_entering_numbers_till_user_enters_a_multiple_of_10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do {

        System.out.print("Enter the number: ");
        int i = sc.nextInt();
            if(i%10 == 0){
                break;
            }
        System.out.println(i);

        } while(true);
        System.out.println("I am out of the loop");
}
}