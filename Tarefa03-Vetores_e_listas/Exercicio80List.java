package application;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio80List {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> Q = new ArrayList<>();
        int tam = 6;
        for (int i = 1; i <= tam; i++) {
            int numero;
            do {
                System.out.print("Digite o número positivo " + i + ": ");
                numero = scanner.nextInt();
            } while (numero <= 0);

            Q.add(numero);
        }

        int maiorElemento = Q.get(0);
        int posicaoMaior = 0;
        for (int i = 1; i < Q.size(); i++) {
            if (Q.get(i) > maiorElemento) {
                maiorElemento = Q.get(i);
                posicaoMaior = i;
            }
        }

        System.out.println("Maior elemento: " + maiorElemento);
        System.out.println("Posição do maior elemento: " + posicaoMaior);

        scanner.close();
	}

}
