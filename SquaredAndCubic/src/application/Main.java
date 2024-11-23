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
        }

        scanner.close();
    }
}

// uma estrutura alternativa, que permite mais números como expoentes
/*int num = sc.nextInt();
int j = 0;
int inc = 1;
int y = 0;

for (int i = 1; i <= num; i++) {
	
	inc = 1;
	j = i;
	
	while (inc <= 3) {			
		y = (int) Math.pow(j, inc);
		if(inc == 3) {
			System.out.print(y);
		}
		System.out.print(y + " ");
		inc++;
	}		
	System.out.println();
}*/
