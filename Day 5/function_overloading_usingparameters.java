public class function_overloading_usingparameters{

    // func to calculate sum of 2 numbers
    public static int sum(int a, int b){
        return a + b;
    }

    // func to calculate sum of 3 numbers
    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String args[]){
        int a = 4, b = 5, c = 6;
        System.out.println(sum(a,b));
        System.out.println(sum(a,b,c));
    }
}
