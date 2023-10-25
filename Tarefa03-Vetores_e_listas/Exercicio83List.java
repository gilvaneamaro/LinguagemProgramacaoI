package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio83List {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int tam = 20;

        for (int i = 1; i <= tam; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }
        Collections.reverse(numeros);

        System.out.println("Números na ordem inversa:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
        scanner.close();
	}

}
