// import java.util.*;

// public class check_if_a_number_is_prime_or_not {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number: ");
//         int number = sc.nextInt();

//         if(number == 2){
//             System.out.println(number + " is a Prime number");
//         }
//         else{
//             boolean prime = true;
//             for(int i = 2; i<=number-1; i++){
//                 if(number%i == 0){
//                     prime = false;
//                 }
//             }
//             if(prime == true){
//                 System.out.println(number + " is a Prime number");
//             }
//             else{
//                 System.out.println(number + " is not a Prime number");  
//             }
//     }
// }
        
// }



import java.util.*;

public class check_if_a_number_is_prime_or_not {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        if(number == 2){
            System.out.println(number + " is a Prime number");
        }
        else{
            boolean prime = true;
            for(int i = 2; i<=Math.sqrt(number); i++){
                if(number%i == 0){
                    prime = false;
                }
            }
            if(prime == true){
                System.out.println(number + " is a Prime number");
            }
            else{
                System.out.println(number + " is not a Prime number");  
            }
    }
}
        
}




// import java.util.*;

// public class check_if_a_number_is_prime_or_not {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
        
//         while(true){
//             System.out.print("Enter the number: ");
//             int number = sc.nextInt();

//             for(int i = 2; i<=number-1; i++){
//                 if(number%i == 0){
//                     System.out.println(number + " is not a prime number");
//                     break;
//                 }
//                 else{
//                     System.out.println(number + " is a prime number");
//                     break;
//                 }
//             }
    
//         }
        
//     }
// }
