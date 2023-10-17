// 79) Escreva um algoritmo que permita a leitura das notas de uma turma de 20 alunos.
// Calcular a média da  turma  e  contar  quantos  alunos  obtiveram  nota  acima  desta  média  calculada.  
// Escrever  a  média  da turma e o resultado da contagem. 

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_79 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira os 20 números:");
		Double[] notas = new Double[20];
		Double soma = 0.0;
		for(int i=0; i<notas.length; i++) {
			notas[i] = sc.nextDouble();
			sc.nextLine();
			soma += notas[i];
		}
		
		Double media = soma / notas.length;
		
		int alunos = 0;
		for(int i=0; i<notas.length; i++) {
			if(notas[i]> media) alunos++;
		}	
		System.out.println("A média da turma foi " + String.format("%.2f", media) + " e " + alunos+ " alunos obtiveram nota acima da média");		
		
		sc.close();
	}
		

}
