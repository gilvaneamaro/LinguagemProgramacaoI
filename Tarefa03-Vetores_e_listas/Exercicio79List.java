package application;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio79List {

	public static void main(String[] args) {
		 	Scanner scanner = new Scanner(System.in);
	        ArrayList<Double> notas = new ArrayList<>();
	        double somaDasNotas = 0;
	        int tam = 6;
	        for (int i = 1; i <= tam; i++) {
	            System.out.print("Digite a nota do aluno " + i + ": ");
	            double nota = scanner.nextDouble();
	            notas.add(nota);
	            somaDasNotas += nota;
	        }

	        double mediaDaTurma = somaDasNotas / tam;

	        int alunosAcimaDaMedia = 0;
	        for (Double nota : notas) {
	            if (nota > mediaDaTurma) {
	                alunosAcimaDaMedia++;
	            }
	        }

	        System.out.println("Média da turma: " + mediaDaTurma);
	        System.out.println("Alunos com notas acima da média: " + alunosAcimaDaMedia);
	        scanner.close();
	}
}
