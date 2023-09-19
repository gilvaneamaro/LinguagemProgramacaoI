//  Ler  um  vetor  A  de  10  números.  Após,  ler  mais  um  número  e  guardar  em  uma  variável  X. 
// Armazenar em um vetor M o resultado de cada elemento de A multiplicado pelo valor X. Logo após, imprimir o vetor M. 

package Exercicios;

import java.util.Scanner;

public class Exercicio_82 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double[] vect = new Double[10];
		
		for(int i = 0; i<vect.length; i++ ) {
			vect[i] = sc.nextDouble();			
		}
		
		Double x = sc.nextDouble();
		Double[] m = new Double[10];
		
		for(int i=0; i<vect.length; i++) {
			m[i] = vect[i] * x;
		}
		
		for(int i=0; i<vect.length; i++) {
			System.out.printf("%.2f ", m[i]);
		}		
		sc.close();
	}
}
