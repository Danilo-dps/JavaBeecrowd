package application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] tips = sc.nextLine().split(" ");
        double a = Double.parseDouble(tips[0]);
        double b = Double.parseDouble(tips[1]);
        double c = Double.parseDouble(tips[2]);

        // Reordenar a, b, c em ordem decrescente para garantir que a seja o maior valor
        // Demorei para garantir que a fosse o maior valor sempre
        if (a < b) {
            double temp = a;
            a = b;
            b = temp;
        }
        if (a < c) {
            double temp = a;
            a = c;
            c = temp;
        }
        if (b < c) {
            double temp = b;
            b = c;
            c = temp;
        }

        // Verificar se os valores podem formar um triângulo
        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            // Verificar o tipo do triângulo
            if ((a * a) == ((b * b) + (c * c))) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if ((a * a) > ((b * b) + (c * c))) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if ((a * a) < ((b * b) + (c * c))) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if ((a == b && b != c) || (b == c && c != a) || (c == a && a != b)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        sc.close();
    }
}

