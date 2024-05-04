import java.util.Scanner;

public class SimulacaoBancaria {
    public static final String SALDO_ATUAL = "Saldo atual: ";
    public static final String SALDO_INSUFICIENTE = "Saldo insuficiente.";
    public static final String OPCAO_INVALIDA = "Opção inválida. Tente novamente."; 
    public static final String PROGRAMA_ENCERRADO = "Programa encerrado.";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0;
        boolean continua = true; 
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (continua) {
            int opcao = scanner.nextInt(); 
            switch(opcao) {
            case 1:
                saldo = depositar(scanner, saldo);
                break;
            case 2:
                saldo = sacar(scanner, saldo);
                break;
            case 3:
                consultarSaldo(saldo);
                break;
            case 0:
                System.out.println(PROGRAMA_ENCERRADO);
                continua = false;
                break;
            // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:    
            default:
                System.out.println("Opção inválida. Tente novamente."); 
                break;
            }
        }
    }
    
    static double depositar(Scanner scanner, Double saldo) {
        saldo += scanner.nextInt();
        System.out.println(SALDO_ATUAL + saldo);
        return saldo;
    }
    
    static double sacar(Scanner scanner, Double saldo) {
        Double valorSaque = scanner.nextDouble(); 
        if (valorSaque > saldo) {
            System.out.println(SALDO_INSUFICIENTE);
            return saldo;
        }
        saldo -= valorSaque;
        System.out.println(SALDO_ATUAL + saldo);
        return saldo;
    }
    
    static void consultarSaldo(Double saldo) {
      System.out.println(SALDO_ATUAL + saldo);
    }
}