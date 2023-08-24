// 6) Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo. 

package principal;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a base do retângulo: ");
		double base = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Insira a altura do retângulo: ");
		double altura = sc.nextDouble();
		sc.nextLine();
		
		double area = altura * base;
		
		System.out.printf("A área do retângulo é %.2f ", area);
		
		
		sc.close();
	}

}
