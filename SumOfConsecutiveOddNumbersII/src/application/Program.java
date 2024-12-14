package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		sc.nextLine();
		int sum = 0;

		for (int i = 0; i < a; i++) {
			String line = sc.nextLine();
			String[] v = line.split(" ");
			if (v.length == 2) {
				int b = Integer.parseInt(v[0]);
				int c = Integer.parseInt(v[1]);

				if (b > c) {
					for (int j = (c + 1); j < b; j++) {
						if (j % 2 == 1) {
							sum += j;
						}
					}
				} else {
					for (int j = (b + 1); j < c; j++) {
						if (j % 2 == 1) {
							sum += j;
						}
					}
				}
			}
			System.out.println(sum);
			sum = 0;
		}
		sc.close();
	}
}
