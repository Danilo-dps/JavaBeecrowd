import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();	
		int b = sc.nextInt();
		int c = sc.nextInt();
		
	    int maiorAB = (a + b + (a * b * c) * (a - b))/2;
	    
	    System.out.println(maiorAB);
	    //erro nesse código 
		
		sc.close();
	}

}
