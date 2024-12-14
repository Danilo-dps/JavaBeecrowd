package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		int i = 0;

		while (i < t) {
			String v[] = sc.nextLine().split(" ");
			int pa = Integer.parseInt(v[0]);
			int pb = Integer.parseInt(v[1]);
			Double ga = Double.parseDouble(v[2].replace(",", "."));
			Double gb = Double.parseDouble(v[3].replace(",", "."));
			int years = 0;

			while (pa <= pb && years <= 100) {
				pa += (pa * ga / 100);
				pb += (pb * gb / 100);
				years++;
			}
			if (years > 100) {
				System.out.println("Mais de 1 seculo.");
			} else {
				System.out.println(years + " anos.");
			}
			i++;
		}
		sc.close();
	}
}
