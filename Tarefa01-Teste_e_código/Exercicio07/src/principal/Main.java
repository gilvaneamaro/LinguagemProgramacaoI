// 7) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade 
// dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.

package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira quantos anos, meses e dias:");
		int anos = sc.nextInt();
		sc.nextLine();
		
		int meses = sc.nextInt();
		sc.nextLine();
		
		int dias = sc.nextInt();
		sc.nextLine();
		
		int totalDias = dias + meses * 30 + anos * 365;
		
		System.out.println("Essa pessoa já viveu "+ totalDias + " dias.");
		
		sc.close();

	}

}
