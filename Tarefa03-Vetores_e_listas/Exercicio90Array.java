/*
 * 90)  Faça  um  algoritmo  para  ler  um  vetor  de  30  números.  Após  isto,  ler  mais  um  número  qualquer, calcular e
 *  escrever quantas vezes esse número aparece no vetor.
 * 
 */
package application;

import java.util.Scanner;

public class Exercicio90Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tam = 30;
		Integer[] vect = new Integer[tam];
		
		System.out.println("Insira os valores do vetor:");
		for(int i=0; i<vect.length; i++) {
			vect[i] = sc.nextInt();
		}
		int total =0;
		System.out.println("Insira o numero buscado");
		int num = sc.nextInt();
		for(int i=0; i<vect.length; i++) {
			if(vect[i] == num) total++;
		}
		System.out.println("O numero aparece " + total + " vezes");
		sc.close();
	}
}
