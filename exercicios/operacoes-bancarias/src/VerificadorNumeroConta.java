import java.util.Scanner; 

public class VerificadorNumeroConta { 

    public static void main(String[] args) { 
 
        try (Scanner scanner = new Scanner(System.in)) {
            String numeroConta = scanner.next();
            verificarNumeroConta(numeroConta);
        } catch (IllegalArgumentException exception){
            System.out.println("Erro: " + exception.getMessage());
        } 
    }

    private static void verificarNumeroConta(String numeroConta) throws IllegalArgumentException { 
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
        System.out.println("Numero de conta valido.");
    }
}