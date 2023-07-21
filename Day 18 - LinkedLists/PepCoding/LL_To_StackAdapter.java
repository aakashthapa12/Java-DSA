import java.util.*;
public class LL_To_StackAdapter{
    public static class LLToStackAdapter{
        LinkedList<Integer> list;

        public LLToStackAdapter(){
            list = new LinkedList<>();
        }

        int size() {
            return list.size;
        }

        void push(int val) {
            return list.addFirst(val);
        }

        int pop() {
            if(size == 0){
                return -1;
            }
            else{
                return list.remove();
            }
        }

        int top() {
             if(size == 0){
                return -1;
            }
            else{
                return list.getFirst();
            }
        }
    }
    public static void main(String args[]){
        LLToStackAdapter ll = new LLToStackAdapter();
        ll.push(2);
        ll.push(1);
        ll.push(3);

        ll.display();
        // int val = ll.pop();

        // System.out.print(val);
    }
}