package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // Consumir a nova linha restante
        int a = 0;

        String[] s;
        int x;
        int y;

        while (a < n) {
            s = sc.nextLine().split(" ");
            x = Integer.parseInt(s[0]);
            y = Integer.parseInt(s[1]);
            int sum = 0; // Redefinir a soma para cada iteração do loop

            for (int i = 0; i < y; i++) {
                if (x % 2 == 0) {
                    x++; // Se x for par, incrementa para tornar ímpar
                }
                sum += x;
                x += 2; // Pula para o próximo número ímpar
            }
            System.out.println(sum);
            a++;
        }

        sc.close();
    }
}
