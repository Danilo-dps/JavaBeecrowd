package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = 1;

		if (n > 0 && n < 13) {

			for (int i = 1; i <= n; i++) {
				a *= i;
			}
			System.out.println(a);
		}
		sc.close();
	}
}