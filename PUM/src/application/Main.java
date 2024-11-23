package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 1; i <= (num * 4); i++) {
			if (i % 4 == 0) {
				System.out.println("PUM");
			}
			if (i % 4 != 0) {
				System.out.printf(i + " ");
			}
		}

		sc.close();
	}
}
