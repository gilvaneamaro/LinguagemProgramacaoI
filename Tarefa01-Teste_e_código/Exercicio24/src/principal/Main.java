package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o salário fixo do vendedor: ");
		double salarioFixo = sc.nextDouble();
		sc.nextLine();

		System.out.println("Insira o valor das vendas efetuadas: ");
		double vendas = sc.nextDouble();
		sc.nextLine();

		double comissao;
		if (vendas <= 1500.0) {
			comissao = 0.03 * vendas;
		} else {
			comissao = 0.03 * 1500.0 + 0.05 * (vendas - 1500.0);
		}

		double salarioTotal = salarioFixo + comissao;

		System.out.println("O salário total do vendedor é: " + salarioTotal);

		sc.close();
	}

}
