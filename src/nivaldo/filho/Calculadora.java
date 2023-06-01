package nivaldo.filho;

/**
 * A classe Calculadora é responsável por realizar operações matemáticas simples,
 * como adição, subtração, multiplicação e divisão.
 */
public class Calculadora {

    /**
     * Realiza a operação de adição entre dois números inteiros.
     *
     * @param a o primeiro número inteiro
     * @param b o segundo número inteiro
     * @return o resultado da adição de a e b
     */
    private int adicionar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a operação de subtração entre dois números inteiros.
     *
     * @param a o primeiro número inteiro (o valor a ser subtraído)
     * @param b o segundo número inteiro (o valor a ser subtraído de a)
     * @return o resultado da subtração de b de a
     */
    private int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a operação de multiplicação entre dois números inteiros.
     *
     * @param a o primeiro número inteiro
     * @param b o segundo número inteiro
     * @return o resultado da multiplicação de a e b
     */
    private int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a operação de divisão entre dois números inteiros.
     * Lança uma exceção se o divisor for igual a zero.
     *
     * @param a o dividendo (o número a ser dividido)
     * @param b o divisor (o número pelo qual a é dividido)
     * @return o resultado da divisão de a por b
     * @throws ArithmeticException se o divisor for zero
     */
    private int dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return a / b;
    }

    /**
     * O método main é responsável por criar uma instância da classe Calculadora
     * e realizar chamadas aos métodos para executar operações matemáticas.
     *
     * @param args os argumentos de linha de comando (não utilizados neste exemplo)
     */
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

