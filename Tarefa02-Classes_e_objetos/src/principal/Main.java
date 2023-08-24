package principal;

import java.util.Scanner;

import entities.Produto;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o nome do produto:");
		String nome = sc.nextLine();
		
		System.out.println("Insira o valor do produto:");
		Double preco = sc.nextDouble();
		
		System.out.println("Insira o id do produto:");
		Integer id = sc.nextInt();
		
		Produto prod = new Produto(nome, preco, id);
		
		
		System.out.println("Produto cadastrado com sucesso!");
		System.out.println(prod);
		
		
		System.out.println("Insira a taxa de inflação do produto:");
		Double taxa = sc.nextDouble();
		prod.calcularInflacao(taxa);
		
		System.out.println("Produto atualizado com sucesso!");
		System.out.println(prod);
		
		
		sc.close();

	}

}
