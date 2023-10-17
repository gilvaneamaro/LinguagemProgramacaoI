package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio84Lista {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o tamanho dos vetores: ");
		Integer n = sc.nextInt();
		
		List<Double> listA = new ArrayList<>();
		List<Double> listB = new ArrayList<>();
		List<Double> soma = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			Double valor = sc.nextDouble();
			listA.add(valor);
		}
		
		for(int i=0; i<n; i++) {
			Double valor = sc.nextDouble();
			listB.add(valor);				
		}
		
		for(int i=0; i<n; i++) {
			soma.add((listA.get(i) + listB.get(i)));
		}
		
		System.out.println("A soma dos valores é:");
		for(Double valor: soma) {
			System.out.print(valor + " ");
		}
		
		sc.close();
	}
}
