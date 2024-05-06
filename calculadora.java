import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcao;

        do {
            System.out.println("Escolha a operação:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("6 - Raiz Quadrada");
            System.out.println("Q - Sair");

            opcao = scanner.next().charAt(0);

            if (opcao != 'Q') {
                switch (opcao) {
                    case '1':
                        realizarOperacao("adição", scanner);
                        break;
                    case '2':
                        realizarOperacao("subtração", scanner);
                        break;
                    case '3':
                        realizarOperacao("multiplicação", scanner);
                        break;
                    case '4':
                        realizarDivisao(scanner);
                        break;
                    case '5':
                        realizarOperacao("potência", scanner);
                        break;
                    case '6':
                        calcularRaizQuadrada(scanner);
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha novamente.");
                }
            }

        } while (opcao != 'Q');
    }

    public static void realizarOperacao(String operacao, Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        double numeroUm = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numeroDois = scanner.nextDouble();

        switch (operacao) {
            case "adição":
                System.out.println("Resultado: " + (numeroUm + numeroDois));
                break;
            case "subtração":
                System.out.println("Resultado: " + (numeroUm - numeroDois));
                break;
            case "multiplicação":
                System.out.println("Resultado: " + (numeroUm * numeroDois));
                break;
            case "potência":
                System.out.println("Resultado: " + Math.pow(numeroUm, numeroDois));
                break;
        }
    }

    public static void realizarDivisao(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        double numeroUm = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numeroDois = scanner.nextDouble();

        if (numeroDois == 0) {
            System.out.println("Impossível realizar uma divisão por zero.");
        } else {
            System.out.println("Resultado: " + (numeroUm / numeroDois));
        }
    }

    public static void calcularRaizQuadrada(Scanner scanner) {
        System.out.print("Digite o número para calcular a raiz quadrada: ");
        double numero = scanner.nextDouble();

        if (numero < 0) {
            System.out.println("Não existe raiz de número negativo.");
        } else {
            System.out.println("Resultado: " + Math.sqrt(numero));
        }
    }
}