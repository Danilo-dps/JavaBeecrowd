package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = 2002;
		int b = sc.nextInt();
		while (b != a) {
			System.out.println("Senha Invalida");
			b = sc.nextInt();
		}
		System.out.println("Acesso Permitido");

		sc.close();
	}
}
