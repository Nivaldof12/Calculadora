package nivaldo.filho;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * A classe CalculadoraTest está garantindo que os métodos estão sendo executadas corretamente.
 */
public class CalculadoraTest {

    /**
     * Teste do método adicionar.
     */
    @Test
    public void testAdicionar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.adicionar(5, 3);
        Assertions.assertEquals(8, resultado);
    }

    /**
     * Teste do método subtrair.
     */
    @Test
    public void testSubtrair() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.subtrair(10, 4);
        Assertions.assertEquals(6, resultado);
    }

    /**
     * Teste do método multiplicar.
     */
    @Test
    public void testMultiplicar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicar(6, 2);
        Assertions.assertEquals(12, resultado);
    }

    /**
     * Teste do método dividir.
     */
    @Test
    public void testDividir() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dividir(12, 3);
        Assertions.assertEquals(4, resultado);
    }

    /**
     * Testa para verificar o tratamento de divisão por zero.
     * Verifica se a divisão por zero lança a exceção ArithmeticException.
     */
    @Test
    public void testDividirPorZero() {
        Calculadora calculadora = new Calculadora();
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(10, 0);
        });
    }
}

