import java.util.*;
public class StockSpan {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int []a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int []res = stockSpan(a);
        display(res);
    }

    public static int[] stockSpan(int []a){
        int []res = new int[a.length];

        Stack<Integer> st = new Stack<>();
        st.push(0);
        res[0] = 1;

        for(int i=1; i<a.length; i++){
            
            while(st.size()>0 && a[i] > a[st.peek()]){
                st.pop();
            }

            if(st.size() == 0){
                res[i] = i+1;
            }
            else{
                res[i] = i - st.peek();
            }
            st.push(i);
        }

        return res;
    }

    public static void display(int []res){
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
}