import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        
        int escolha = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (escolha != 4) {
            
            if (escolha == 1) {
                alcool++;
            }
            if (escolha == 2) {
                gasolina++;
            }
            if (escolha == 3) {
                diesel++;
            }
            escolha = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Álcool: %d%n", alcool);
        System.out.printf("Gasolina: %d%n", gasolina);
        System.out.printf("Diesel: %d%n", diesel);
        sc.close();
    } 
}
