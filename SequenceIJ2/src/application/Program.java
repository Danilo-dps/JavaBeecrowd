package application;

public class Program {

	public static void main(String[] args) {
		
        // Loop para a variável I, variando de 1 a 9 com passo de 2
        for (int i = 1; i <= 9; i += 2) {
            // Loop para a variável J, começando em 7 e decrementando até 5
            for (int j = 7; j >= 5; j--) {
                System.out.printf("I=%d J=%d%n", i, j);
            }
        }
    }
}
