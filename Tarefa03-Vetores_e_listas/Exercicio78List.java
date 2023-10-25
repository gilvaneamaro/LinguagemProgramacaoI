package application;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio78List {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            nomes.add(nome);
        }

        System.out.print("Digite um nome para verificar se está na lista: ");
        String nomeAProcurar = scanner.nextLine();

        if (nomes.contains(nomeAProcurar)) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }
        scanner.close();
	}

}
