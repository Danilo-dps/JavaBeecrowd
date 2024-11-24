package application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" "); 
        int x = Integer.parseInt(input[0]); 
        int y = Integer.parseInt(input[1]);
        int i = 1;

        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }

        while (i <= y) {
            for (int j = 1; j <= x; j++) {
                if (j == x) {
                    System.out.print(i);
                } else {
                    System.out.print(i + " ");
                }
                i++;
            }
            System.out.println();
        }
        sc.close();
    }
}
