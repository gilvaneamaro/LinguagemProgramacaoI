package test;

public class Testes {

    public static void main(String[] args) {
        try {
            // Tente executar um código que pode lançar uma exceção
            int resultado = dividir(10, 0);
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            // Capture e trate a exceção que ocorreu
            System.err.println("Erro: Divisão por zero não é permitida." + e.getMessage());
        }
    }

    public static int dividir(int a, int b) {
        // Tente fazer a divisão
        return a / b;
    }
}
