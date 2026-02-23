public class Somatorio {

    // Construtor padrão
    public Somatorio() {
        // Apenas instancia o objeto
    }

    // Método recursivo responsável pelo cálculo
    public int calcularSomatorio(int valor) {

        /*
         * Caso base:
         * Se o valor for menor ou igual a zero,
         * a execução retorna 0.
         */
        if (valor <= 0) {
            return 0;
        }

        /*
         * Chamada recursiva:
         * Soma o valor atual com o resultado da chamada anterior.
         */
        return valor + calcularSomatorio(valor - 1);
    }
}