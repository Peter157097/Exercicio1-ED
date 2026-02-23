import controller.Somatorio;

public class Main {

    public static void main(String[] args) {

        int quantidade = 5;

        // Criando o objeto da classe Somatorio
        Somatorio calc = new Somatorio();

        // Executando o método recursivo
        int somaFinal = calc.calcularSomatorio(quantidade);

        System.out.println("A soma acumulada até " + quantidade + " é: " + somaFinal);
    }
}