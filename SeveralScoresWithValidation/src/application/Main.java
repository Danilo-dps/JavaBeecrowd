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
			}
			if (i < 0 || i > 10) {
				System.out.println("nota invalida");

			}
			if (count == 2) {
				double avg = nota / count;
				System.out.printf("media = %.2f%n", avg);

				while (count == 2) {
					System.out.println("novo calculo (1-sim 2-nao)");
					int a = sc.nextInt();
					if (a == 1) {
						count = 0;
						nota = 0;
						i = 0;
					} else if (a == 2) {
						count++;
					}
				}
			}
		}
		sc.close();
	}
}