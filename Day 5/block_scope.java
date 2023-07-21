public class block_scope {
    public static void main(String args[]){
        {
            int s = 34;  // s can be resolved in this block scope
        }
        System.out.println(s);
    }
}
