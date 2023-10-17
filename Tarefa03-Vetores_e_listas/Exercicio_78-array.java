// Escreva um algoritmo que permita a leitura dos nomes de 10 pessoas e armaze os nomes lidos em um vetor.
// Após isto, o algoritmo deve permitir a  leitura de mais 1 nome qualquer de pessoa e depois escrever a mensagem ACHEI,
// se o nome estiver entre os 10 nomes lidos anteriormente (guardados no vetor), ou NÃO ACHEI caso contrário. 

package Exercicios;

import java.util.Scanner;

public class Exercicio_78 {

	public static void main(String[] args) {
		String[] nomes = new String[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira os 10 nomes:");
		for(int i=0; i<nomes.length; i++ ) {
			nomes[i] = sc.nextLine();			
		}
		
		
		System.out.println("Qual nome você está buscando?");
		String nome = sc.nextLine();
		Boolean flag = false;
		
		for(int i=0; i< nomes.length; i++) {
			if(nome.equals(nomes[i])){
				flag = true;				
			}	
		}
		if (flag) System.out.println("Encontrei o nome " + nome + " na lista de nomes!" );
		else System.out.println("Não encontrei o nome " + nome+  " na lista :(");
		
		sc.close();
	}
	
}
