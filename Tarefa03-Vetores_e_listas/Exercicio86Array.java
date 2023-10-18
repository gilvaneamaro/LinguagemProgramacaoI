/*86)  Faça  um  algoritmo  para  ler  10  números  e  armazenar  em  um  vetor. Após  isto,  o  algoritmo  deve ordenar
 *  os números no vetor em ordem crescente. Escrever o vetor ordenado. 
 * 
 */

package application;

import java.util.Scanner;

public class Exercicio86Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vet = new int[10];
		System.out.println("Insira os 10 valores a serem ordenados:");
		for(int i=0; i< vet.length; i++) {
			vet[i]= sc.nextInt();		
		}
		
		
		int n = vet.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (vet[j] < vet[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = vet[minIndex];
            vet[minIndex] = vet[i];
            vet[i] = temp;
		
        }
        System.out.println("Vetor ordenado:");
        for(int valor:vet) {
        	System.out.print(valor + " ");
        }
		
		sc.close();
	}
}
