/*
 * 88) Faça  um algoritmo para ler um vetor de 20 números. Após isto, deverá ser lido mais um número qualquer e 
 * verificar se esse número existe no vetor ou não. Se existir, o algoritmo deve gerar um novo vetor sem esse número. 
 * (Considere que não haverão números repetidos no vetor). 
 */
package application;
import java.util.Scanner;

public class Exercicio88Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] vet = new Integer[20];
		System.out.println("Entre com os valores do vetor");
		for(int i=0; i<vet.length; i++) {
			vet[i]= sc.nextInt();
		}
		
		System.out.println("Qual valor deseja remover da lista?");
		int valor = sc.nextInt();
		
		Integer[] newVect = removeN(vet,valor);
		for(int i=0; i<newVect.length; i++) {
			System.out.println(newVect[i]);
		}
		
		sc.close();
	}
	
	public static Integer[] removeN(Integer[] vect, Integer num) {
		Integer[] newVect = new Integer[vect.length];
		
		for(int i=0; i<vect.length; i++ ) {
			if(vect[i] != num) {
				newVect[i] = vect[i];
			}
		}
		return newVect;
	}
}
