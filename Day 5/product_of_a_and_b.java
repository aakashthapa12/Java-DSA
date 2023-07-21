// public class product_of_a_and_b {
//     public static void calculateProduct(int a, int b){
//         int product = a*b;
//         System.out.println("product of "+a+" and "+b+" is " + (product));
//     }
//     public static void main(String args[]){
//         int x = 5, y = 10;
//         calculateProduct(x, y);         
//     }
 
// }





public class product_of_a_and_b {
    public static int calculateProduct(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String args[]){
        int x = 5, y = 10;
        int c = calculateProduct(x, y);
        System.out.println(x + " X " + y + " = "+ c);

    }
 
}
