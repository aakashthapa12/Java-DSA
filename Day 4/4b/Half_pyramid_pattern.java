public class Half_pyramid_pattern {
    public static void main(String args[]){
         int n = 4;  // Total no. of lines

         for(int line = 1; line<=n; line++){
            // Printing numbers
            for(int number = 1; number<=line; number++){
                System.out.print(number);
            }
            System.out.println();
         }
    }
} 
  