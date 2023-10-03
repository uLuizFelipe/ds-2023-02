package br.ufg;

public class newton {
    public static double calcularRaizQuadrada(double numero, double tolerancia, int maxIter) {
            // Comece com uma estimativa inicial (pode ser o próprio número)
            double estimativa = numero;

            for (int i = 0; i < maxIter; i++) {
                // Aplique o método de Newton para refinar a estimativa
                estimativa = 0.5 * (estimativa + numero / estimativa);

                // Verifique a convergência com base na tolerância
                double erro = Math.abs(estimativa * estimativa - numero);
                if (erro < tolerancia) {
                    break;
                }
            }

            return estimativa;
        }

        public static void main(String[] args) {
            double numero = 25;
            double tolerancia = 1e-6;
            int maxIter = 100;

            double raizQuadrada = calcularRaizQuadrada(numero, tolerancia, maxIter);
            System.out.println("A raiz quadrada de " + numero + " é aproximadamente " + raizQuadrada);
    }
}