import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int y = 0;
		
		for(int i = 0; i < 6; i++){
			double x = sc.nextDouble();
			if(x > 0) {
				y ++;	
			}
		}
		System.out.printf("%d valores positivos%n",y);
		sc.close();
	}
}
//positive numbers
