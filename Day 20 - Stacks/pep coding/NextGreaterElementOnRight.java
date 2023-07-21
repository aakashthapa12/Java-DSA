import java.util.*;
public class NextGreaterElementOnRight{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int []arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int []res = solve(arr);
        display(res);

    }

    public static int[] solve(int []arr){
        int []res = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        st.push(arr[arr.length-1]);
        res[arr.length-1] = -1;

        for(int i=arr.length-2; i>=0; i--){

            while(st.size() > 0 && arr[i] >= st.peek()){
                st.pop();
            }

            if(st.size() == 0){
                res[i] = -1;
            }
            else{
                res[i] = st.peek();
            }

            st.push(arr[i]);
        }

        return res;
    }

    public static void display(int []res){
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
}