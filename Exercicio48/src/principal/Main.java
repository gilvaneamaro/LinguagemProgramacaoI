// 48) Escreva um algoritmo para ler as notas da 1a. e 2a. avaliações de um aluno, calcule e imprima a 
// média (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota. 

package principal;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double p1 = -1;
		double p2 = p1;
		
		while (p1 < 0 || p1 > 10){
		
			System.out.println("Insira a nota da p1:");
			p1 = sc.nextDouble();
			sc.nextLine();
		}
		
		while (p2 < 0 || p2 > 10) {
			System.out.println("Insira a nota da p2:");
			p2 = sc.nextDouble();
			sc.nextLine();
		}
		
		double media = (p1 + p2) / 2;
		
		System.out.println("A média das provas foi " + media);
		
		sc.close();

	}

}