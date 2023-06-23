package c02_patterns;

public class Patteran05 {
    public static void main(String args[]) {
        int n = 4;

        for (int i = n; i >= 1; i--) {

            // inner loop to print spaces.
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // inner loop to print stars.
            for (int k = 0; k <= n - i; k++) {
                System.out.print("*");
            }

            // printing new line for each row
            System.out.println();
        }
    }
}
