// public class swap_valuesExchange {
//     public static void main(String args[]){
//         // swap - values exchange
//         int a = 5;
//         int b = 10;

//         // swap

//         int temp = a;
//         a = b;
//         b = temp;

//         System.out.println("a = " +a);
//         System.out.println("b = " +b);

//     }
// }



// with using user defined function

public class swap_valuesExchange {
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }
    public static void main(String args[]){
        int a = 5;
        int b = 6;
        swap(a,b);
        
    }
}
