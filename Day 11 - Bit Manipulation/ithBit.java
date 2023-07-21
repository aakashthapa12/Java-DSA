// Get ith Bit

// public class ithBit {
//     public static int getIthBit(int n, int i){
//         int bitMask = 1<<i;
//         if((n & bitMask) == 0){
//             return 0;
//         }
//         else{
//             return 1;
//         }
//     }
//     public static void main(String args[]){
//         System.out.println(getIthBit(10,3));
        
//     }
// }


// Set ith Bit

// public class ithBit {
//     public static int setIthBit(int n, int i){
//         int bitMask = 1<<i;
//         return n | bitMask;
//     }
//     public static void main(String args[]){
//         System.out.println(setIthBit(10,2));
          
//     }
// }


// clear ith Bit

// public class ithBit {
//     public static int clearIthBit(int n, int i){
//         int bitMask = ~(1<<i);
//         return n & bitMask;
//     }
//     public static void main(String args[]){
//         System.out.println(clearIthBit(10,1));
          
//     }
// }


// update ith Bit

// public class ithBit {
//     public static int setIthBit(int n, int i){
//         int bitMask = 1<<i;
//         return n | bitMask;
//     }


//     public static int clearIthBit(int n, int i){
//         int bitMask = ~(1<<i);
//         return n & bitMask;
// }

//     public static int updateIthBit(int n, int i, int newBit){
//         // if(newBit == 0){
//         //     return clearIthBit(n, i);
//         // }
//         // else{
//         //     return setIthBit(n, i);
//         // }

//         n = clearIthBit(n, i);
//         int bitMask = newBit<<i;
//         return n | bitMask;
//     }
//     public static void main(String args[]){
//         System.out.println(updateIthBit(10,2,2));
          
//     }

// }  

   
// clearlastIBits

public class ithBit {

    public static void clearlastIBits(int n){
        if((n & (n-1) )== 0){
            System.out.println(n+" is a Power of 2");
        }
    }
public static void main(String args[]){
    clearlastIBits(15);     
}   
}  