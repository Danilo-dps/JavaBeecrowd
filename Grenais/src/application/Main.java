package application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int inter = 0;
        int gremio = 0;
        int empates = 0; 
        int totalGrenais = 0; 

        String[] pontos = sc.nextLine().split(" ");
        int in = Integer.parseInt(pontos[0]);
        int gr = Integer.parseInt(pontos[1]);

        if (in > gr) {
            inter++;
        } else if (gr > in) {
            gremio++;
        } else {
            empates++; 
        }

        totalGrenais++; 

        System.out.println("Novo grenal (1-sim 2-nao)");
        char a = sc.next().charAt(0);
        sc.nextLine(); // Consumir a quebra de linha pendente

        while (a != '2') {
            pontos = sc.nextLine().split(" ");
            in = Integer.parseInt(pontos[0]);
            gr = Integer.parseInt(pontos[1]);
            if (in > gr) {
                inter++;
            } else if (gr > in) {
                gremio++;
            } else {
                empates++;
            }
            totalGrenais++;
            System.out.println("Novo grenal (1-sim 2-nao)");
            a = sc.next().charAt(0);
            sc.nextLine(); // Consumir a quebra de linha pendente
        }

        System.out.println(totalGrenais + " grenais");
        System.out.println("Inter:" + inter);
        System.out.println("Gremio:" + gremio);
        System.out.println("Empates:" + empates);
        if(inter > gremio) {
        	System.out.println("Inter venceu mais");
        }
        else {
        	System.out.println("Gremio venceu mais");
        }
        sc.close();
    }
}


