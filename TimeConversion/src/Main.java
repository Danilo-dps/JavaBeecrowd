import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int hours = a / 3600;
		int min = (a - hours * 3600) / 60;
		int sec = a - (hours * 3600)- (min * 60);
		
		
		System.out.printf("%d:%d:%d%n", hours, min, sec);
		sc.close();
	}
}
//time conversion 