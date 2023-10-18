package application;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio86List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();

        System.out.println("Insira os 10 valores a serem ordenados:");

        for (int i = 0; i < 10; i++) {
            int valor = sc.nextInt();
            lista.add(valor);
        }

        
        int n = lista.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (lista.get(j) < lista.get(minIndex)) {
                    minIndex = j;
                }
            }

            // Troca os elementos
            int temp = lista.get(minIndex);
            lista.set(minIndex, lista.get(i));
            lista.set(i, temp);
        }

        System.out.println("Lista ordenada:");
        for (int valor : lista) {
            System.out.print(valor + " ");
        }

        sc.close();
    }
}