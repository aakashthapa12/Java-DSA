public class set_IthBit{
    public static int setIth(int n, int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }
    public static void main(String args[]){
        System.out.print(setIth(10,2));
    }
}