package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[] x = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
		}

		for (int i = 0; i < x.length; i++) {
			if (x[i] <= 0) {
				x[i] = 1;
			}
		}

		for (int i = 0; i < x.length; i++) {
				System.out.println("X[" + i + "] = " + x[i]);		
		}

		sc.close();
	}
}
