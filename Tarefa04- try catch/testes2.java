package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class testes2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            System.out.println("Você digitou: " + numero);
        } catch (InputMismatchException e) {
            System.err.println("Erro: Entrada inválida. Por favor, digite um número inteiro. Message: " + e.getMessage());
        }
        scanner.close();
    }
}
