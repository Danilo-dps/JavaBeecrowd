package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double [] a = new double[100];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] <= 10) {
				System.out.printf("A[%d] = %.2f%n", i, a[i]);
			}
		}
		
		sc.close();
	}
}
