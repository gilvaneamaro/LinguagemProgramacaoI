// 80) Ler um vetor Q de 20 posições (aceitar somente números positivos). 
// Escrever a seguir o valor do maior elemento de Q e a respectiva posição que ele ocupa no vetor. 
package Exercicios;

import java.util.Scanner;

public class Exercicio_80 {

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
		Double maior = 0.0;
		for(int i=0; i<q.length; i++) {
			if(i == 0) {
				maior = q[i];
				pos = i;
			}
			else if(q[i] > maior) {
				maior = q[i];
				pos = i;
			}
		}
		
		System.out.printf("o maior numero digitado foi %.2f na posição %d.", maior, pos);
		
		
		
		sc.close();

	}

}
