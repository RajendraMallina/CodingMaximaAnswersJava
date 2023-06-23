package c08_multidimention;

import java.util.Scanner;

public class MatrixAddtion {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[2][2];
		int b[][] = new int[2][2];
		
		System.out.println("Reading values in first matrix :- ");
		for(int i = 0; i < a.length; i++) {
			System.out.println("Enter " + (i+1) +" row values" );
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Reading values in second matrix :- ");
		for(int i = 0; i < b.length; i++) {
			System.out.println("Enter " + (i+1) +" row values" );
			for(int j = 0; j < b[i].length; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		int c[][] = new int[2][2];
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("Matrix addtion :- ");
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
