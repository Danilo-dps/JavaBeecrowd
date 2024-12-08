package application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] n = new int[20];
        
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n.length; i++) {
            System.out.printf("N[%d] = %d%n", i, n[n.length - i - 1]);
        }
        
        sc.close();
    }
}
