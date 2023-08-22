// Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. 
// Calcular e escrever o valor do novo salário.

package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor do salário mensal: ");
		double salario = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Insira o percentual do reajuste: ");
		double reajuste = sc.nextDouble();
		sc.nextLine();
		
		salario = salario + salario * (reajuste/100);
		
		System.out.println("O valor do novo salário será de R$" + salario);	
				
		sc.close();

	}

}
