// Such questions can be solved using the concept of Matrix.

public class hollow_rectangle_pattern {
    public static void hollow_rectangle(int totRows, int totCols){
        // outer loop
        for(int i = 1; i<=totRows; i++){
            // inner - columns
            for(int j = 1; j<=totCols; j++){
                if(i == 1 || i == totRows || j == 1 || j == totCols){
                    // boundary cells
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
public static void main(String args[]){
     hollow_rectangle(4, 5);   

}

}