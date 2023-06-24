package c02_patterns;

public class Pattern09 {
    public static void main(String args[]) {
        int n = 4;

        for (int i = 1; i <= n; i++) {

            // inner loop to handle columns
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            // printing new line for each row
            System.out.println();
        }

    }
}
