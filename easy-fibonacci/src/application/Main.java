package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int lim = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = a;

        if (lim > 0 && lim <= 46){
            for (int i = 0; i < lim; i++) {
                if(i == (lim - 1)){
                    System.out.println(a);
                } else{
                    System.out.print(a + " ");
                    a = b;
                    b += c;
                    c = a;
                }
            }
        }

        sc.close();
    }
}