public class App {
    public static void main(String[] args) {
        // Loop para a variável I, variando de 0 a 2 com incremento de 0.2
        for (double i = 0; i <= 2; i += 0.2) {
            // Loop para a variável J, começando de (i + 1) até (i + 3)
            for (double j = 1; j <= 3; j++) {
                System.out.printf("I=%.1f J=%.1f%n", i, i + j);
            }
        }
    }
}

