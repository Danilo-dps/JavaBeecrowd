package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] n = new int[1000];
		int t = sc.nextInt();

		if (t >= 2 && t <= 50) {
			for (int i = 0; i < n.length; i++) {
				n[i] = i % t;
				System.out.printf("N[%d] = %d%n", i, n[i]);
			}
		}
		sc.close();
	}
}
