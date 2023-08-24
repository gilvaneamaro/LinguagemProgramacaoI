// Faça  um  algoritmo  para  ler  20  números  e  armazenar  em  um  vetor.  Após  a  leitura  total  dos  20 números,
// o algoritmo deve escrever esses 20 números lidos na ordem inversa. 

package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] vect = new Integer[20];
		
		System.out.println("Insira os 20 números: ");
		for (int i = 0; i < vect.length; i ++) {
			vect[i] = sc.nextInt();
			sc.nextLine();		
		}	
		
		System.out.println("Os 20 elementos em ordem reversa seria:");
		
		for(int i = vect.length - 1; i >= 0; i--) {
			System.out.println(vect[i]);
			
		}
		
		sc.close();
		
		
	}

}
