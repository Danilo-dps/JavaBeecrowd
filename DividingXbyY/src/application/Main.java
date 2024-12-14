package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int i = 0;
		String[] m = sc.nextLine().split(" ");
		Double x, y;

		while (i < n) {
			m = sc.nextLine().split(" ");
			x = m[0].isEmpty() ? 0.0 : Double.parseDouble(m[0]);
			y = m[1].isEmpty() ? 0.0 : Double.parseDouble(m[1]);

			if (y == 0) {
				System.out.println("divisao impossivel");
			} else {
				System.out.println(x / y);
			}
			i++;
		}

		sc.close();
	}
}
