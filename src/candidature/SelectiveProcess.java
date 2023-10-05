package candidature;

public class SelectiveProcess {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    static void analyzeCandidate(double intendedSalary) {
        double baseSalary = 2000.0;

        if (baseSalary > intendedSalary) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (baseSalary == intendedSalary) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }

    }
}
