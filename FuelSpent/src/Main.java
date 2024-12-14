import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int hours = sc.nextInt();
		int km = sc.nextInt();
		double consumo = ((double)km * (double)hours)/12;
		
		System.out.printf("%.3f%n", consumo);
		sc.close();
	}
}
//erro de apresentação, fuel spent
