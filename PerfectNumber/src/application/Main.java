package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int i = 1;
		int count = 0;
		int sum = 0;
		int in = 0;

		while (count < n) {
			in = sc.nextInt();
			while (i < in) {
				if (in % i == 0) {
					sum += i;
				}
				i++;
			}
			if (sum == in) {
				System.out.println(in + " eh perfeito");
			} else {
				System.out.println(in + " não eh perfeito");
			}
			sum = 0;
			i = 1;
			count++;
		}
		sc.close();
	}
}
