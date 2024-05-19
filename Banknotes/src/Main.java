import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int n100 = n/100;
		int n50 = (n -(n100 * 100))/50;
	    int n20 = (n -(n100 * 100) - (n50 * 50))/20;
	    int n10 = (n -(n100 * 100) - (n50 * 50) - (n20 * 20))/10;
	    int n5 = (n -(n100 * 100) - (n50 * 50) - (n20 * 20) - (n10 * 10))/5;
	    int n2 = (n -(n100 * 100) - (n50 * 50) - (n20 * 20) - (n10 * 10) - (n5 * 5))/2;
	    int n1 = (n -(n100 * 100) - (n50 * 50) - (n20 * 20) - (n10 * 10) - (n5 * 5) - (n2 * 2))/1;
	    
	    System.out.println(n);
	    System.out.printf("%d nota(s) de R$ 100,00%n", n100);
	    System.out.printf("%d nota(s) de R$ 50,00%n", n50);
	    System.out.printf("%d nota(s) de R$ 20,00%n", n20);
	    System.out.printf("%d nota(s) de R$ 10,00%n", n10);
	    System.out.printf("%d nota(s) de R$ 5,00%n", n5);
	    System.out.printf("%d nota(s) de R$ 2,00%n", n2);
	    System.out.printf("%d nota(s) de R$ 1,00%n", n1);
	    
		sc.close();
	}
}
//banknotes