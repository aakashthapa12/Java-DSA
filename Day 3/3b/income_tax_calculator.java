import java.util.Scanner;

public class income_tax_calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income(per annum): ");
        float income = sc.nextFloat();
        float tax ;

        if(income<500000){
            tax = 0;
        }
        else if(income>=500000 && income < 1000000){
            tax = (float) (income * 0.2); 
        }
        else{
            tax = (float) (income * 0.3);
        }
        System.out.println("Tax is to be paid for income Rs. " + income + " is : Rs " + tax);
    }
}

 