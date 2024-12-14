package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double s = 1;
		double a = 0;
		double i = 1;

		while (s < 40.00) {
			a += (s / i);
			s += 2.0;
			if (i == 1) {
				i++;
			} else {
				i *= 2.0;
			}
		}

		System.out.printf("%.2f\n", a);

		sc.close();
	}
}
