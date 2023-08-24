// Faça um algoritmo para ler um valor N qualquer (que será o tamanho dos vetores). Após, ler dois vetores  A  e  B  
// (de  tamanho  N  cada  um)  e  depois  armazenar  em  um  terceiro  vetor  Soma  a  soma  dos elementos do vetor A 
// com os do vetor B (respeitando as mesmas posições) e escrever o vetor Soma. 

package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Insira o tamanho dos vetores");
	Integer tamanho = sc.nextInt();
	sc.nextLine();
			
	Integer[] vectA = new Integer[tamanho];
	Integer[] vectB = new Integer[tamanho];
		
	System.out.println("Insira os valores do vetor A");
	for (int i = 0; i < vectA.length; i++) {
		vectA[i] = sc.nextInt();	
	}
	
	System.out.println("Insira os valores do vetor B");
	for (int i = 0; i < vectB.length; i++) {
		vectB[i] = sc.nextInt();	
	}	
	
	Integer[] vectSoma = new Integer[tamanho];
	System.out.println("A soma de cada elemento do vetor A com o vetor B seria:");
	for(int i = 0; i < vectSoma.length; i++) {
		vectSoma[i] = vectA[i] + vectB[i]; 
	}
	
	for(int i = 0; i < vectSoma.length; i++) {
		System.out.println(vectSoma[i]); 
	}
	
			
	sc.close();
	

	}

}
