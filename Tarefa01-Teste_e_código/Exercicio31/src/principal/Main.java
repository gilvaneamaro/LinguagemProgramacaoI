// 31) Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam 
// ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados. 

package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira os lados do triângulo:");
		int a = sc.nextInt();
		sc.nextLine();
		int b = sc.nextInt();
		sc.nextLine();
		int c = sc.nextInt();
		sc.nextLine();
		
		if (a < b + c && b < a + c && c < a + b ) {
			System.out.println("É possível formar um triângulo");
		}
		else {
			System.out.println("Não possível formar um triângulo");
		}
		sc.close();
	}

}
