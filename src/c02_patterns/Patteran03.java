package c02_patterns;

public class Patteran03 {
    public static void main(String args[]) {
        int n = 4;

        for (int i = 0; i <= n; i++) {

            // inner loop to handle columns
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }

            // printing new line for each row
            System.out.println();
        }
    }
}
