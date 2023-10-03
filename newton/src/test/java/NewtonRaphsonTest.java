import static org.junit.jupiter.api.Assertions.*;

import br.ufg.newton;
import org.junit.jupiter.api.Test;

public class NewtonRaphsonTest {
    @Test
    public void testCalcularRaizQuadrada() {
        // Teste com um número positivo
        double numeroPositivo = 25;
        double tolerancia = 1e-6;
        int maxIter = 100;
        double resultadoPositivo = newton.calcularRaizQuadrada(numeroPositivo, tolerancia, maxIter);
        assertEquals(Math.sqrt(numeroPositivo), resultadoPositivo, tolerancia);

        // Teste com um número negativo (deve lançar uma exceção)
        double numeroNegativo = -25;
        assertThrows(IllegalArgumentException.class, () -> {
            newton.calcularRaizQuadrada(numeroNegativo, tolerancia, maxIter);
        });

        // Teste com tolerância zero (deve lançar uma exceção)
        double numeroToleranciaZero = 25;
        double toleranciaZero = 0;
        assertThrows(IllegalArgumentException.class, () -> {
            newton.calcularRaizQuadrada(numeroToleranciaZero, toleranciaZero, maxIter);
        });
    }
}