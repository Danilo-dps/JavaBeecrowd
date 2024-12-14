package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int i = 0;

		while (i < x) {
			int n = sc.nextInt();
			int sum = 0;
			int j = 1;
			while (j <= n) {
				if (n % j == 0) {
					sum++;
				}
				j++;
			}
			if (sum == 2) {
				System.out.println(n + " eh primo");
			} else {
				System.out.println(n + " nao eh primo");
			}
			i++;
		}
		sc.close();
	}
}
