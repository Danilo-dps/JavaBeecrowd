import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double delta = ((Math.pow(b, 2) - 4 * a * c));
		double r1 = (-b + Math.sqrt(delta))/(2*a);
		double r2 = (-b - Math.sqrt(delta))/(2*a);
		
		if(a > 0 && delta > 0) {
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
		}
		else {
			System.out.println("Impossível calcular");
		}
		sc.close();
	}
}
//bhaskara's formula, beecrowd aceitou sem acento  no I
