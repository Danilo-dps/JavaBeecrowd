package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int x = 0;
        int y = 0;
        int sum = 0;
        int mX = 0;
        int mY = 0;
        
        // Encontrar o maior valor positivo (x)
        for (int i = 0; i < input.length; i++) {
            int value = Integer.parseInt(input[i]);
            if (value > 0) {
                if (mX < value) {
                    mX = value;
                }
            }
        }
        
        x = mX;
        
        // Encontrar o próximo maior valor positivo distinto de x (y)
        for (int j = 0; j < input.length; j++) {
            int value = Integer.parseInt(input[j]);
            if (value > 0 && value != x) {
                if (mY < value) {
                    mY = value;
                }
            }
        }
        
        y = mY;

        // Calcular a soma dos valores de 1 a x
        for (int i = 1; i <= x; i++) {
            sum += i;
        }
        // Calcular a soma dos valores de 1 a y
        for (int i = 1; i < y; i++) {
            sum += i;
        }
        
        System.out.println("Soma: " + sum);
        System.out.println("Maior valor (x): " + mX);
        System.out.println("Segundo maior valor (y): " + mY);
        sc.close();
    }
}
