package c02_patterns;

public class Pattern08 {

    public static void main(String args[]) {
        int n = 4;

        for (int i = n; i >= 1; i--) {

            // inner loop to handle columns
            for (int j = 1; j <= n; j++) {
                System.out.print(i);
            }

            // printing new line for each row
            System.out.println();
        }
    }
}