package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double count = 0;
		double nota = 0;
		double i = 0;

		while (count < 2) {
			i = sc.nextDouble();
			if (i > 0 && i <= 10) {
				nota += i;
				count++;
			} else {
				System.out.println("nota invalida");
			}
		}

		double avg = nota / count;
		System.out.printf("media = %.2f%n", avg);

		sc.close();
	}
}
