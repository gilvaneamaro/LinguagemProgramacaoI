package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio88List {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		System.out.println("Entre com os valores do vetor");
		for(int i=0; i<20; i++) {
			int num = sc.nextInt();
			list.add(num);
		}
		
		System.out.println("Qual valor deseja remover da lista?");
		int valor = sc.nextInt();
		list.remove(list.indexOf(valor));
				
		
		for(Integer i: list) {
			System.out.println(i);
		}
		
		sc.close();
			
	}
}
