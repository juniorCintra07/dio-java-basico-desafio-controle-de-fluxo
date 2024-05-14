import java.util.Scanner;

// Definição da classe ParametrosInvalidosException
class ParametrosInvalidosException extends Exception {
    // Construtor padrão
    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in); // Inicializando o Scanner uma vez

        System.out.println("Digite o primeiro número inteiro: ");
        int parametroUm = terminal.nextInt(); // Capturando o primeiro número inteiro

        System.out.println("Digite o segundo número inteiro: ");
        int parametroDois = terminal.nextInt(); // Capturando o segundo número inteiro

        try {
            contar(parametroUm, parametroDois); // Chamando o método contar com os parâmetros capturados
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage()); // Imprimindo a mensagem da exceção
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) { // Verificando se o primeiro parâmetro é maior ou igual ao segundo
            throw new ParametrosInvalidosException(); // Lançando a exceção se o primeiro parâmetro for maior ou igual ao segundo
        } else { // Realizando a contagem e imprimindo os números
            for (int i = parametroUm; i <= parametroDois; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}
