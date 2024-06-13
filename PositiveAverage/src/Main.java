import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int y = 0;
		double z = 0;
		
		for(int i = 1; i <= 6; i++){
			double x = sc.nextDouble();
			if(x > 0) {
				y ++;	
				z += x;
			}
		}
		
		double a = z/y;
		
		System.out.printf("%d valores positivos%n",y);
		System.out.printf("%.1f%n", a);
		
		sc.close();
	}
}
//positive and average
