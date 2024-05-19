import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		
		int n100 = (int)n/100;
		n -= n100 * 100;
		int n50 = (int)n / 50;
		n -= n50 * 50;
	    int n20 = (int)n /20;
	    n -= n20 * 20;
	    int n10 = (int)n /10;
	    n -= n10 * 10;
	    int n5 = (int)n /5;
	    n-= n5 * 5;
	    int n2 = (int)n /2;
	    n -= n2 * 2;
	    int n1 = (int)n /1;
	    n -= n1 * 1;
	    double n05 = (int)(n * 2)/1; //usei o conceito de frações equivalentes para funcionar
	    n -= n05 * 0.5;
	    double n025 = (int)(n * 4) /1; 
	    n -= n025 * 0.25;
	    double n010 = (int)(n * 10) /1;
	    n -= n010 * 0.10;
	    double n005 = (int)(n * 20) /1;
	    n -= n005 * 0.05;
	    double n001 = (n * 100) /1; //não entendi pq aqui não foi necessária a conversão para int
	    
	    
	    System.out.println("NOTAS:");
	    System.out.printf("%d nota(s) de R$ 100.00%n", n100);
	    System.out.printf("%d nota(s) de R$ 50.00%n", n50);
	    System.out.printf("%d nota(s) de R$ 20.00%n", n20);  
	    System.out.printf("%d nota(s) de R$ 10.00%n", n10);
	    System.out.printf("%d nota(s) de R$ 5.00%n", n5);
	    System.out.printf("%d nota(s) de R$ 2.00%n", n2);
	    
	    System.out.println("MOEDAS:");
	    System.out.printf("%d moeda(s) de R$ 1.00%n", n1);
	    System.out.printf("%.0f moeda(s) de R$ 0.50%n", n05);
	    System.out.printf("%.0f moeda(s) de R$ 0.25%n", n025);
	    System.out.printf("%.0f moeda(s) de R$ 0.10%n", n010);
	    System.out.printf("%.0f moeda(s) de R$ 0.05%n", n005);
	    System.out.printf("%.0f moeda(s) de R$ 0.01%n", n001);
	    
		sc.close();
	}
}

//banknotes and coins 0.25, 0.10, 0.05 and 0.01
