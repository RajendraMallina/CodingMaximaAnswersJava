package c02_patterns;

public class Patteran01 {
    public static void main(String args[]) {
        int n = 4;

        for (int i = 0; i <= n; i++) {

            // inner loop to handle columns
            for (int j = 0; j <= n; j++) {
                System.out.print("*");
            }

            // printing new line for each row
            System.out.println();
        }
    }
}
