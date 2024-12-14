package application;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        
        // Lê os dois números
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        
        // Determina o menor e o maior número
        int start = Math.min(X, Y);
        int end = Math.max(X, Y);
        
        // Imprime todos os números entre X e Y cujo resto da divisão por 5 é 2 ou 3
        for (int i = start + 1; i < end; i++) {
            if (i % 5 == 2 || i % 5 == 3) {
                System.out.println(i);
            }
        }
        
        scanner.close();
    }
}