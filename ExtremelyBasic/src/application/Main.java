package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, X;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		X = a + b;
		
		System.out.printf("X = %d%n", X);
		
		sc.close();
	}

}
