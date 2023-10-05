package candidature;

import java.util.concurrent.ThreadLocalRandom;

public class SelectiveProcess {
    public static void main(String[] args) throws Exception {
        printSelected();
    }

    static void printSelected() {
        String[] candidates = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

        for (String candidate: candidates) {
            System.out.println("O candidato selecionado foi " + candidate);
        }
    }

    static void candidatesSelection() {
        String[] candidates = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int selectedCandidates = 0;
        int currentCandidate = 0;
        double baseSalary = 2000;

        while (selectedCandidates < 5 && currentCandidate < candidates.length) {
            String candidate = candidates[currentCandidate];
            double intendedSalary = intendedValue();

            System.out.println("O candidato " + candidate + " solicitou este valor de salário " + intendedSalary);

            if (baseSalary >= intendedSalary) {
                System.out.println("O candidato " + candidate + " foi selecionado para a vaga");
                selectedCandidates++;
            }

            currentCandidate++;
        }
    }

    static double intendedValue() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
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
