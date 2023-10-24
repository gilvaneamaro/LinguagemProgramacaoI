/*
 * 89)  Faça  um  algoritmo  para  ler  dois  vetores  V1  e  V2  de  15  números  cada. Calcular  e  escrever  a quantidade de vezes que
 *  V1 e V2 possuem os mesmos números e nas mesmas posições. 
 * 
 */
package application;

import java.util.Scanner;

public class Exercicio89Array {

	public static void main(String[] args) {
		int tam = 6;
		Scanner sc =  new Scanner(System.in);
		Integer[] v1 = new Integer[tam];
		Integer[] v2 = new Integer[tam];
		System.out.println("Insira os valores do vetor 1:");
		
		for(int i=0; i<v1.length; i++) {
			v1[i] = sc.nextInt();
		}
		System.out.println("Insira os valores do vetor 2:");
		for(int i=0; i<v2.length; i++) {
			v2[i] = sc.nextInt();
		}
		
		int total =0;
		for(int i =0; i<v1.length; i++) {
			if(v1[i] == v2 [i]) {
				total++;
			}
		}
		System.out.println(total);
		
		sc.close();
	}
}
