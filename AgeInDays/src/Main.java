import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int ano = a /365;
		int mes = (a - (ano * 365))/30;
		int dia = (a - (ano * 365) - (mes * 30))/1;
		
		System.out.printf("%d ano(s)%n", ano);
		System.out.printf("%d mês(es)%n", mes);
		System.out.printf("%d dia(s)%n", dia);
		
		sc.close();
	}
}
//age in days, Beecrowd aceitou sem acento no E