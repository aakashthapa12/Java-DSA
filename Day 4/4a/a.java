import java.util.*;

public class a {
public static void main(String args[]){
   Scanner sc = new Scanner(System.in);

   while(true){
    System.out.print("Enter the Number: ");
    int num = sc.nextInt();

    if(num == 2){
      System.out.println(num + " is a Prime number");
    }
    else{
      boolean isPrime = true;
      for(int i = 2; i<=Math.sqrt(num); i++){ 
        if(num%i == 0){
          isPrime = false;
        }
      }   
    
    if(isPrime == true){  
      System.out.println(num + " is a Prime number");
    }
    else{
      System.out.println(num + " is not a Prime number"); 
    }   

    }
      
   }   

}

}