// Faça um algoritmo para ler um valor N qualquer (que será o tamanho dos vetores). Após, ler dois vetores  A  e  B  (de  tamanho  N  cada  um)  e  
// depois  armazenar  em  um  terceiro  vetor  Soma  a  soma  dos elementos do vetor A com os do vetor B (respeitando as mesmas posições) e escrever o vetor Soma. 
package Exercicios;

import java.util.Scanner;

public class Exercicio_83 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira quantos elementos cada vetor terá: ");
		Integer n = sc.nextInt();
		
		
		Double[] a = new Double[n];
		Double[] b = new Double[n];
		
		System.out.println("Insira os elementos do vetor A:");
		for(int i=0; i<a.length; i++){			
			a[i] = sc.nextDouble();
			
		}
		
		System.out.println("Insira os elementos do vetor B:");
		for(int i=0; i<b.length; i++){			
			b[i] = sc.nextDouble();
			
		}
		
		Double[] soma = new Double[n];
		for(int i=0; i<soma.length; i++){			
			soma[i] = a[i] + b[i];
		}
		
		System.out.println("A soma dos vetores é:");
		for(int i=0; i<soma.length; i++){			
			System.out.printf("%.2f ", soma[i]);
		}
		
		
		sc.close();
	}
}
