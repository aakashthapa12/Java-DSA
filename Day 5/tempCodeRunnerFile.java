

public class practice_questions {
  public static int Sum_of_digits(int n){
    int sumDigit = 0;
    while(n>0){
      int last_Digit = n%10;
      sumDigit+=last_Digit;
      n/=10;
    }
    return sumDigit;
  }
public static void main(String args[]){
    int a = Sum_of_digits(89);
    System.out.println("sum of digits is: "+a);
}

}