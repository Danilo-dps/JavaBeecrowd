package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] val = sc.nextLine().split(" ");
		int a = Integer.parseInt(val[0]);
		int b = Integer.parseInt(val[1]);
		int c = 0;

		while (a > 0 && b > 0) {
			if (a > b) {
				for (int i = b; i <= a; i++) {
					System.out.print(i + " ");
					c += i;
				}
				System.out.println("Sum=" + c);
				c = 0;
			} else {
				for (int i = a; i <= b; i++) {
					System.out.print(i + " ");
					c += i;
				}
				System.out.println("Sum=" + c);
				c = 0;
			}
			val = sc.nextLine().split(" ");
			a = Integer.parseInt(val[0]);
			b = Integer.parseInt(val[1]);
		}
		sc.close();
	}
}
