package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] input = sc.nextLine().split(" ");
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		int c = Integer.parseInt(input[2]);
		int d = Integer.parseInt(input[3]);
		int hora = 0;
		int min = 0;

		if (a > c) {
			if (d > b) {
				hora = (24 - a) + c;
				min = d - b;
			} else if (b > d) {
				hora = (23 - a) + c;
				min = (60 - b) + d;
			} else {
				hora = (24 - a) + c;
				min = 0;
			}
		}
		if (c > a) {
			if (d > b) {
				hora = c - a;
				min = d - b;
			} else if (b > d) {
				hora = c - a - 1;
				min = (60 - b) + d;
			} else {
				hora = c - a;
				min = 0;
			}
		}
		if (a == c) {
			if (d > b) {
				hora = 0;
				min = d - b;
			} else {
				hora = 23;
				min = (60 - b) + d;
			}
		}
		if (c == a) {
			if (d > b) {
				hora = 0;
				min = d - b;
			} else {
				hora = 23;
				min = (60 - b) + d;
			}
		}
		if (a == c && d == b || c == a && b == d) {
			hora = 24;
			min = 0;
		}

		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", hora, min);
		sc.close();
	}
}
