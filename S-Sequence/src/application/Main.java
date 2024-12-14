package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double s = 1;
		double a = 0;

		for (double i = 1; i <= 100.00; i++) {
			a += (s / i);
		}

		System.out.printf("%.2f\n", a);

		sc.close();
	}
}
