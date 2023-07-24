package c02_patterns;

public class Patteran15 {
    public static void main(String args[]) {
        int n = 4;

        // outer loop to handle rows
        for (int i = n; i > 0; i--) {

            // inner loop to print spaces.
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // inner loop to print numbers.
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }

            // printing new line for each row
            System.out.println();
        }
    }
}
