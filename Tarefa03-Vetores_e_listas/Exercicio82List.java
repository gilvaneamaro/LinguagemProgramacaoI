package application;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio82List {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> M = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();
            A.add(numero);
        }

        System.out.print("Digite o valor de X: ");
        int X = scanner.nextInt();

        for (int i = 0; i < A.size(); i++) {
            int resultado = A.get(i) * X;
            M.add(resultado);
        }

        System.out.print("Vetor M: ");
        for (int i = 0; i < M.size(); i++) {
            System.out.print(M.get(i) + " ");
        }
        scanner.close();
    }

}
