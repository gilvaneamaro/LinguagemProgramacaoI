/*
 * 91)  Faça  um  algoritmo  para  ler  50  números  e  armazenar  em  um  vetor  VET,  verificar  e  escrever  se existem números repetidos
 *  no vetor VET e em que posições se encontram. 
 * 
 */

package application;

import java.util.Scanner;

public class Exercicio91Array {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        // Defina o tamanho do vetor
	        int tamanhoVetor = 50;
	        int[] VET = new int[tamanhoVetor];

	        // Leia os números e armazene no vetor
	        for (int i = 0; i < tamanhoVetor; i++) {
	            System.out.print("Digite o número " + (i + 1) + ": ");
	            VET[i] = scanner.nextInt();
	        }

	        boolean existemRepetidos = false;

	        // Verifique se existem números repetidos no vetor
	        for (int i = 0; i < tamanhoVetor; i++) {
	            for (int j = i + 1; j < tamanhoVetor; j++) {
	                if (VET[i] == VET[j]) {
	                    System.out.println("Número repetido: " + VET[i] + " nas posições " + i + " e " + j);
	                    existemRepetidos = true;
	                }
	            }
	        }

	        if (!existemRepetidos) {
	            System.out.println("Não existem números repetidos no vetor.");
	        }
	        scanner.close();
		
	}

}
