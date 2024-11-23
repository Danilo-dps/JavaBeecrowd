public class Main {
    public static void main(String[] args) {
        // Loop para a variável I, variando de 1 a 9 com incremento de 2
        for (int i = 1; i <= 9; i += 2) {
            // Loop para a variável J, que começa em um valor específico e decrementa
            for (int j = i + 6; j >= i + 4; j--) {
                System.out.printf("I=%d J=%d%n", i, j);
            }
        }
    }
}

