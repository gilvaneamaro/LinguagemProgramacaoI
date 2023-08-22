// Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles

package principal;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um valor inteiro:");
		
		int valorA = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Insira outro valor inteiro:");
		
		int valorB = sc.nextInt();
		sc.nextLine();
		
		if(valorA > valorB) {
			System.out.println("O maior valor inserido foi" + valorA);
		}
		else {
			System.out.println("O maior valor inserido foi" + valorB);
		}
		
		sc.close();

	}

}
