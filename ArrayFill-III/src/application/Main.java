package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] n = new int[100];
		double x = sc.nextDouble();
		int a = 2;

		for (int i = 0; i < n.length; i++) {		
			System.out.printf("N[%d] = %.4f%n", i, x);
			x /= 2;
		}

		sc.close();
	}
}
