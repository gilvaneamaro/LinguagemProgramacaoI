package application;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio91List {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        // Leia os números e armazene na ArrayList
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        boolean existemRepetidos = false;

        // Verifique se existem números repetidos na ArrayList
        for (int i = 0; i < numeros.size(); i++) {
            for (int j = i + 1; j < numeros.size(); j++) {
                if (numeros.get(i).equals(numeros.get(j))) {
                    System.out.println("Número repetido: " + numeros.get(i) + " nas posições " + i + " e " + j);
                    existemRepetidos = true;
                }
            }
        }

        if (!existemRepetidos) {
            System.out.println("Não existem números repetidos na lista.");
        }
        scanner.close();
	}

}
