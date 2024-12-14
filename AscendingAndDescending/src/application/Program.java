package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] val = sc.nextLine().split(" ");
		int a = Integer.parseInt(val[0]);
		int b = Integer.parseInt(val[1]);

		while (a != b) {
			if (a > b) {
				System.out.println("Decrescente");
			} else {
				System.out.println("Crescente");
			}
			val = sc.nextLine().split(" ");
			a = Integer.parseInt(val[0]);
			b = Integer.parseInt(val[1]);
		}
		sc.close();
	}
}
