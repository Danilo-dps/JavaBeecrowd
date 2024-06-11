import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int i = 0;
		
		for(i = x; x > 0 && i <=100; i++) {
			System.out.println(i);
		}
		
		sc.close();
	}
}

