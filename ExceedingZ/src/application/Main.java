package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int z = sc.nextInt();
		int count = 1;
		int i = x + 1;
		int sum = x;

		while (z <= x) {
			z = sc.nextInt();
		}

		while (sum <= z) {
			sum += i;
			count++;
			i++;
		}

		System.out.println(count);
		sc.close();
	}
}


/* Códigos equivalentes, mas o beecrowd não aceitou o JAVA
# Leitura do valor de X
X = int(input())

# Leitura do valor de Z, garantindo que seja maior que X
while True:
    Z = int(input())
    if Z > X:
        break

# Inicialização das variáveis
soma = 0
contador = 0
atual = X

# Soma dos inteiros começando de X até que a soma exceda Z
while soma <= Z:
    soma += atual
    atual += 1
    contador += 1

# Impressão do resultado
print(contador)*/