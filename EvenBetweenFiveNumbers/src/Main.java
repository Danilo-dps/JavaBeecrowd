import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int y = 0;
		for(int i = 1; i <=5; i++){
			int x = sc.nextInt();
			if(x % 2 == 0){
				y++;
			}
		}
		System.out.printf("%d valores pares%n", y);
        sc.close();
	}
}
//even between five numbers
