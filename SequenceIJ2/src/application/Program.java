package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		int n = sc.nextInt();
		int j = 7;
		
		for (int i = 1; i < n; i++) {
			if (i % 2 != 0) {
				System.out.printf("I=%d J=%d%n", i, j);
			}
			j--;
		}
		
		sc.close();
	}
}
