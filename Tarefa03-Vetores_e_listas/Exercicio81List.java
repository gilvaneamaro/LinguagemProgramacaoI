package application;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio81List {

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

        int menorElemento = Q.get(0);
        int posicaoMenor = 0;

        for (int i = 1; i < Q.size(); i++) {
            if (Q.get(i) < menorElemento) {
                menorElemento = Q.get(i);
                posicaoMenor = i;
            }
        }

        System.out.println("Menor elemento: " + menorElemento);
        System.out.println("Posição do menor elemento: " + posicaoMenor);
        scanner.close();

	}

}
