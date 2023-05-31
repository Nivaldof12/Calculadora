package nivaldo.filho;

public class Calculadora {
    private int adicionar(int a, int b) {
        return a + b;
    }

    private int subtrair(int a, int b) {
        return a - b;
    }

    private int multiplicar(int a, int b) {
        return a * b;
    }

    private int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int soma = calculadora.adicionar(5, 3);
        System.out.println("Soma: " + soma);

        int subtração = calculadora.subtrair(10, 4);
        System.out.println("Subtração: " + subtração);

        int multiplicação = calculadora.multiplicar(6, 2);
        System.out.println("Multiplicação: " + multiplicação);

        int divisão = calculadora.dividir(12, 3);
        System.out.println("Divisão: " + divisão);
    }
}
