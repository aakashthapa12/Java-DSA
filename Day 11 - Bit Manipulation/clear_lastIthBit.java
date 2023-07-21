public class clear_lastIthBit {
    public static int clearlastIthBit(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static void main(String args[]){
        System.out.print(clearlastIthBit(15,2));
    }
}