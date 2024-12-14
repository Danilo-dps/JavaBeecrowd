import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0; 
		int c = 0;
		int d = 0;
		
		for(int i = 0; i < 5; i++) {
			int x = sc.nextInt();
			if(x % 2 == 0){
				a++;
			}
			if(x % 2 != 0){
				b++;
			}
			if(x > 0){
				c++;
			}
			if(x < 0){
				d++;
			}
		}
		System.out.printf("%d valor(es) par(es)%n", a);
		System.out.printf("%d valor(es) impar(es)%n", b);
		System.out.printf("%d valor(es) positivo(s)%n", c);
		System.out.printf("%d valor(es) negativo(s)%n", d);
		sc.close();
	}
}