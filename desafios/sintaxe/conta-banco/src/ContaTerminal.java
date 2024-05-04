import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem vindo ao ByteBank, qual é o seu nome?");
        String nome = scanner.next();

        System.out.println("Por favor, informe o número da sua conta");
        Integer numero = scanner.nextInt();

        System.out.println("Por favor, informe a agência da sua conta");
        String agencia = scanner.next();

        System.out.println("Por favor, informe o saldo da sua conta");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
