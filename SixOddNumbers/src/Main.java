import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for(int i = x; i <= x + 11; i++ ) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
