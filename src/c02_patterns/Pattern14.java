package c02_patterns;

public class Pattern14 {
    public static void main(String args[]) {
        int n = 4;

        for (int i = n; i >= 1; i--) {

            // inner loop to handle columns
            for (int j = n; j >= i; j--) {
                System.out.print(j + " ");
            }

            // printing new line for each row
            System.out.println();
        }
    }
}
