package application;

import java.io.IOException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // Correção na troca de valores
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        for (int i = a; i < b; i++) {
            if ((i % 5 == 2 && i > 4) || (i % 5 == 3 && i > 4)) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
