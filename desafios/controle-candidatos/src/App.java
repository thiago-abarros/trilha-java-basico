import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        selecaoCandidatos();
    }
    static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "ALGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        int maximoCandidatos = 5;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < maximoCandidatos && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " pretende um salaírio de " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                candidatosSelecionados++;
                System.out.println("Candidato selecionado: " + candidato);
            } else {
                System.out.println("Candidato rejeitado: " + candidato);
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } 
        else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        }
        else {
            System.out.println("Aguardando resultado demais candidatos");
        }
    }
}
