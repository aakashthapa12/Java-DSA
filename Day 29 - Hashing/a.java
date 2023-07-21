import java.util.*;
public class a{
    static int removeDuplicates(int []num){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<num.length; i++){
            set.add(num[i]);
        }
    
        return set.size();
    }
    public static void main(String args[]){
        int num[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.print(removeDuplicates(num));
    }
}
