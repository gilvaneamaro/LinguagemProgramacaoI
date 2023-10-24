package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio90List {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tam = 6;
		List<Integer> list = new ArrayList<>(tam);
		
		System.out.println("Insira os valores da lista");
		for(int i=0; i<tam; i++) {
			list.add(sc.nextInt());
		}
		
		System.out.println("Qual elemento deseja buscar?");
		int num = sc.nextInt();
		
		int total = 0;
		
		for(Integer i: list) {
			if(i == num) total++;
		}
		System.out.println("O numero aparece "+ total + " vezes");
		
		sc.close();
	}
}
