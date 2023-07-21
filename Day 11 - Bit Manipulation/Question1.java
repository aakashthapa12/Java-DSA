// public class Question1 {
//     public static void oddorEven(int n){
//         int bitMask = 1;
//         if((n & bitMask)== 0){
//             System.out.println("Even Number");
//         }
//         else{
//             System.out.println("Odd Number");
//         }
//     }
//     public static void main(String args[]){
//         oddorEven(3);
//         oddorEven(6);
//         oddorEven(13);
            
    
//     }
// }

public class Question1 {
    public static void num(int n){
        if((n & 1)== 1){
            System.out.println(n + " is a odd Number");
        }
        else{

            System.out.println(n + " is a even Number");
        }
    }
public static void main(String args[]){
    num(5);

}

}