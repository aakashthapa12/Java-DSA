
public class all_Primes_in_a_Range {
    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
        else{
            for(int i = 2 ; i<=Math.sqrt(n); i++){
                if(n%i == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void primeInRange(int range){
    for(int i = 2; i<=range ; i++){
        if(isPrime(i)){
            System.out.println(i + " is a prime number");
        }
        // else{
        //     System.out.println(i + " is not a prime number");
        // }
    }
}
  
    public static void main(String args[]){
        primeInRange(100);   
         
}
}
