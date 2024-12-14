package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] a = sc.nextLine().split(" ");
		Integer x = Integer.parseInt(a[0]);
		Integer y = Integer.parseInt(a[1]);

		while (x != 0) {
			while (y != 0) {
				if (x > 0 && y > 0) {
					System.out.println("primeiro");
				} else if (x > 0 && y < 0) {
					System.out.println("quarto");
				} else if (x < 0 && y < 0) {
					System.out.println("terceiro");
				} else {
					System.out.println("segundo");
				}
				a = sc.nextLine().split(" ");
				x = Integer.parseInt(a[0]);
				y = Integer.parseInt(a[1]);
			}
		}
		sc.close();
	}
}
