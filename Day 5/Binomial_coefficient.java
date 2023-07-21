public class Binomial_coefficient {
    public static int factorial(int num){
        int f=1;
        if(num == 0 || num == 1){
            return 1;
        }
        else{
            for(int i=1; i<=num; i++){
                f *= i;
            }
            return f; 
        }
    }

    public static int binomial_coefficient(int n, int r){
        int n_factorial = factorial(n);
        int r_factorial = factorial(r);
        int nmr_factorial = factorial(n-r);
        int binCoeff = n_factorial/(r_factorial * nmr_factorial);
        return binCoeff;
    }

    public static void main(String args[]){
        int n = 5;
        int r = 2;
        System.out.println("Binomial Coefficient is: " + binomial_coefficient(n,r));
    }
}
