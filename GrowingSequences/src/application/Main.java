package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		while (n != 0) {
			for (int i = 1; i <= n; i++) {
				if (i == n) {
					System.out.println(i);
				} else {
					System.out.print(i + " ");
				}
			}
			n = sc.nextInt();
		}
		sc.close();
	}
}

// Versão que corrige o erro de Time limit exceeded
/*import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n != 0) {
            StringBuilder output = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                if (i == n) {
                    output.append(i);
                } else {
                    output.append(i).append(" ");
                }
            }
            System.out.println(output.toString());
            n = sc.nextInt();
        }

        sc.close();
    }
}
*/