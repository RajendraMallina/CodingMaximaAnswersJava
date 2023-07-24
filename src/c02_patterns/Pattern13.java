package c02_patterns;

public class Pattern13 {
    public static void main(String args[]) {
        int n = 4;

        // outer loop to handle rows
        for (int i = 0; i < n; i++) {

            // inner loop to print spaces.
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }

            // inner loop to print stars.
            for (int k = 0; k <= i; k++) {
                System.out.print(k + 1);
            }

            // printing new line for each row
            System.out.println();
        }
    }
}
