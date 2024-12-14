package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int x = sc.nextInt();
			if (x == 0) {
				break;
			}

			int sum = 0;
			int count = 0;

			// Ajustar x para o próximo número par se for ímpar
			if (x % 2 != 0) {
				x++;
			}

			// Soma dos cinco números pares consecutivos
			while (count < 5) {
				sum += x;
				x += 2; // Pular para o próximo número par
				count++;
			}

			System.out.println(sum);
		}

		sc.close();
	}
}