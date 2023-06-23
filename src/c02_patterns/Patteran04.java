package c02_patterns;

public class Patteran04 {
    public static void main(String args[]) {
        int n = 4;

        // outer loop to handle rows
        for (int i = n; i > 0; i--) {

            // inner loop to print spaces.
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // inner loop to print stars.
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }

            // printing new line for each row
            System.out.println();
        }
    }
}
