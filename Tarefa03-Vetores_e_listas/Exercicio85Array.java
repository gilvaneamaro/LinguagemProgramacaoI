/*
 * 85) Faça um algoritmo para ler e armazenar em um vetor a temperatura média de todos os dias do ano.
 *  Calcular e escrever: 
 *  
 *  a) Menor temperatura do ano 
 *  b) Maior temperatura do ano 
 *  c) Temperatura média anual 
 *  d) O número de dias no ano em que a temperatura foi inferior a média anual
 *  
 */
// 16,4 16,3 36,7 35,5 33,0 34,3 21,5 35,5 29,7 30,5 25,8 36,4 28,5 19,9 19,2 27,1 21,8 32,2 19,7 16,0 26,2 20,5 32,6 35,1 36,0 33,3 23,7 20,3 20,4 25,2 19,5 22,9 35,2 23,4 23,7 17,2 34,1 35,9 26,5 30,1 27,2 35,6 25,7 16,8 25,2 35,2 35,7 33,0 30,2 25,0 23,8 35,4 25,3 25,8 27,2 33,4 18,5 30,1 36,6 26,0 31,5 21,6 20,5 26,0 19,2 27,3 20,6 28,5 20,3 19,8 30,0 28,8 16,5 18,3 16,2 29,2 16,7 23,4 27,5 33,2 16,8 29,8 28,3 27,7 34,0 30,7 22,6 28,9 31,2 29,3 32,6 29,9 19,3 22,1 35,1 29,3 23,3 33,0 28,7 36,0 28,3 16,6 16,2 34,5 28,0 28,0 36,9 23,1 18,0 22,9 36,0 36,9 17,3 27,9 35,6 34,9 30,2 21,3 25,0 21,8 36,1 34,9 22,0 36,2 35,6 32,7 18,2 20,5 21,4 17,4 26,2 25,3 19,3 31,5 27,0 29,0 22,3 30,7 34,5 36,0 17,5 36,7 33,0 35,2 26,9 33,6 29,0 32,2 28,0 29,3 33,1 30,9 35,3 18,2 28,0 29,4 28,0 20,4 18,9 21,7 36,1 18,3 33,0 35,6 23,3 25,0 19,8 31,8 32,6 16,4 32,8 28,5 19,6 35,7 22,2 23,3 20,4 22,0 31,8 25,7 35,3 20,6 32,4 19,9 32,5 19,5 36,5 34,6 27,8 21,7 29,4 16,3 21,4 32,6 25,2 26,3 28,7 17,8 18,3 20,4 19,7 27,4 28,0 33,4 18,7 32,0 20,4 29,3 36,6 25,7 36,5 21,2 35,9 17,7 30,5 21,3 21,0 30,3 20,3 27,7 23,7 28,4 16,3 29,8 26,6 31,2 29,3 34,7 36,4 33,5 28,7 31,8 36,4 23,4 33,2 21,7 32,7 33,1 32,9 27,1 17,3 36,8 26,6 16,0 27,1 32,6 26,4 28,3 28,2 33,7 22,3 25,3 29,1 27,7 35,5 19,6 27,7 35,4 27,5 36,5 31,0 35,8 32,0 17,5 18,1 23,9 28,6 21,9 25,3 16,7 26,2 31,1 27,9 22,9 30,9 27,2 29,3 32,3 33,2 28,5 20,5 28,1 25,5 17,3 20,8 27,2 34,2 32,7 27,1 32,9 19,3 25,0 20,9 19,7 17,5 28,0 35,8 33,7 27,1 19,7 33,9 26,7 17,7 18,4 19,2 34,2 19,7 19,7 25,9 23,5 27,5 33,1 23,0 30,1 30,9 22,0 36,2 36,3 34,4 36,1 33,2 21,3 26,4 35,2 26,0 25,2 36,2 30,2 17,3 34,2 34,4 22,0 30,3 36,0 19,9 33,3 32,2 17,3 35,0 19,7 35,1 17,7 32,1 29,1 28,9 35,0 18,1 21,2 23,6 26,7 29,2 35,6 22,4 20,4 36,2 22,0 32,8 20,3 20,8 20,4 18,0 28,9 32,9 35,9 36,5 26,5 23,8 25,7 25,3 28,2 16,4 28,3 28,4 20,6 36,6 34

package application;

import java.util.Scanner;

public class Exercicio85Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Double[] dias = new Double[365];
		Double menor = 0.0;
		Double maior = 0.0;
		Double soma = 0.0;
		
		System.out.println("Insira a temperatura de cada dia do ano");

		for(int i=0; i<dias.length; i++) {
			System.out.println("dia " + (i+1) + ": ");
			dias[i] = sc.nextDouble();
			soma += dias[i];
			
			if(i==0) {
				menor = dias[i];
				maior = dias[i];
			}
			else if(dias[i] < menor) {
				menor = dias[i];
			}
			else if(dias[i] > maior) {
				maior = dias[i];
			}
		}
		
		Double media = soma / 365;
		Integer num =0;
		
		for(int i =0; i<dias.length; i++) {
			if(dias[i] < media) {
				num++;
			}
		}
		
		System.out.println("A maior temperatura do ano foi: " + maior + "Cº");
		System.out.println("A menor temperatura do ano foi: " + menor + "Cº");
		System.out.printf("A temperatura media foi %.1fCº", media);
		System.out.println("\nO ano teve " + num + " dias com temperatura abaixo da media atual");
		
		
		
		sc.close();
	}
}
