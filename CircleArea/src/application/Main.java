package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R = sc.nextDouble();
		double pi = 3.14159;
		double Area = pi * R * R;
		
		System.out.printf("A = %.4f%n", Area);
		
		sc.close();
	}

}
