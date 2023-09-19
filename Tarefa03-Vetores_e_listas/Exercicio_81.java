//81) O  mesmo  exercício  anterior,  mas  agora  deve  escrever  o menor  elemento  do  vetor  
// e  a  respectiva posição dele nesse vetor
package Exercicios;

import java.util.Scanner;

public class Exercicio_81 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double[] q = new Double[20];
		Double entrada = -1.0;
		
		System.out.println("Insira 20 numero positivo:");
		
		for(int i=0; i<q.length; i++ ) {
			do {
				entrada = sc.nextDouble();
				q[i] = entrada;
			}while(entrada < 0);
		}
		Integer pos = -1;
		Double menor = 0.0;
		for(int i=0; i<q.length; i++) {
			if(i == 0) {
				menor = q[i];
				pos = i;
			}
			else if(q[i] < menor) {
				menor = q[i];
				pos = i;
			}
		}
		System.out.printf("o menor numero digitado foi %.2f na posição %d.", menor, pos);
		sc.close();

	}
}
