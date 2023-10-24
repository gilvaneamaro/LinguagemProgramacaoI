package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio89List {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tam = 15;
		List<Integer> list1 = new ArrayList<>(tam);
		List<Integer> list2 = new ArrayList<>(tam);
		System.out.println("Insira os valores da lista 1");
		for(int i=0;i<tam;i++) {
			list1.add(sc.nextInt());
		}	
		
		System.out.println("Insira os valores da lista 2");
		for(int i=0;i<tam;i++) {
			list2.add(sc.nextInt());
		}
		int total = 0;
		for(Integer i: list1) {
			if(list1.indexOf(i) == list2.indexOf(i)) {
				total++;
			}
		}
		System.out.println("total: "+ total );
		sc.close();
	}
}
