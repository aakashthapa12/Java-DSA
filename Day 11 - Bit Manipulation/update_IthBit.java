public class update_IthBit{
    public static int setIth(int n, int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int updateIthBit(int n, int i, int newBit){
        // if(newBit == 0){
        //     return clearIthBit(n,i);
        // }
        // else{
        //     return setIth(n,i);
        // }

        n = clearIthBit(n,i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }
    public static void main(String args[]){
        System.out.print(updateIthBit(10,2,1));
    }
}