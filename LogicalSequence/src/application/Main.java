package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            int square = i * i;
            int cube = i * i * i;
            System.out.printf("%d %d %d%n", i, square, cube);
            System.out.printf("%d %d %d%n", i, square + 1, cube + 1);
        }

        scanner.close();
    }
}
