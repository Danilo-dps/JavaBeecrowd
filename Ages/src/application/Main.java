package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        int sum = 0;
        double avg = 0.0;
        int a;

        while (true) {
            a = sc.nextInt();
            if (a <= 0) {
                break;
            }
            sum += a;
            count++;
            avg = (double) sum / count;
        }

        System.out.printf("%.2f\n", avg);
        sc.close();
    }
}
