package programing_excercise.pattern_programs;

public class Left_Half_Pyramid {
    public static void main(String[] args) {
        int i,j;
        int n=4;
        for (i = n; i >= 1; i--) {

            // inner loop to print spaces.
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // inner loop to print stars.
            for (j = 0; j <= n - i; j++) {
                System.out.print("*");
            }

            // printing new line for each row
            System.out.println();
        }
    }
}
