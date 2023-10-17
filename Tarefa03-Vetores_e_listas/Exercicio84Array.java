/*84) Faça um algoritmo para ler um valor N qualquer (que será o tamanho dos vetores). 
 * Após, ler dois vetores  A  e  B  (de  tamanho  N  cada  um)  e  depois  armazenar  em  um  terceiro  vetor  Soma  
 * a  soma  dos elementos do vetor A com os do vetor B (respeitando as mesmas posições) e escrever o vetor Soma. 
 * 
 * 
 */

package application;

import java.util.Scanner;

public class Exercicio84Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o tamanho do vetor:");
		int n = sc.nextInt();
		
		Double[] vetA = new Double[n];
		Double[] vetB = new Double[n];
		Double[] soma = new Double[n];
		
		System.out.println("Insira os valores do primeiro vetor:");
		for(int i=0; i<vetA.length; i++) {
			vetA[i] = sc.nextDouble();
		}
		
		System.out.println("Insira os valores do segundo vetor:");
		for(int i=0; i<vetB.length; i++) {
			vetB[i] = sc.nextDouble();
		}
		
		for(int i=0; i<vetB.length; i++) {
			soma[i] = vetA[i] + vetB[i];
		}
		
		System.out.println("A soma dos vetores é:");
		
		for(int i=0; i<vetB.length; i++) {
			System.out.print(soma[i] + " ");
		}		
		
		sc.close();
		
	}

}
