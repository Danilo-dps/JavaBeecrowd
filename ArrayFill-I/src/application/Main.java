package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();

		if (x > 0 && x < 50) {

			long[] n = new long[10];

			n[0] = x;

			for (int i = 1; i < n.length; i++) {
				n[i] = n[i - 1] * 2;
			}
			for (int i = 0; i < n.length; i++) {
				System.out.println("N[" + i + "] = " + n[i]);
			}
		}

		sc.close();
	}
}
