import java.util.*;
public class GetKeypadCombination{

    static String []codes = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", 
                          "tuv", "wxyz"};

    static ArrayList<String> getKPC(String str){
        
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> mres = new ArrayList<>();

        String codeforch = codes[ch];
        for(int i=0; i<codeforch.length(); i++){
            char chcode = codeforch.charAt(i);
            for(String rstr: rres){
                mres.add(chcode + rstr);
            }
        }

        return mres;
    }

    public static void main(String args[]){
        String str = new Scanner(System.in).next();

        ArrayList<String> words = getKPC(str);
        System.out.println(words);
        
    }

}