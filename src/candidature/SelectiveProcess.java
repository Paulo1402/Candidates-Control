package candidature;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SelectiveProcess {
    public static void main(String[] args) throws Exception {
        String[] candidates = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        for (String candidate : candidates) {
            getInContact(candidate);
        }
    }

    static void getInContact(String candidate) {
        int attemptsMade = 1;
        boolean keepGoing = true;
        boolean answered = false;

        do {
            answered = answer();
            keepGoing = !answered;

            if (keepGoing) {
                attemptsMade++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        } while (keepGoing && attemptsMade < 3);

        if (answered) {
            System.out.println("CONSEGUIMOS CONTATO COM O " + candidate + "NA " + attemptsMade + " TENTATIVA");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM O " + candidate + ", NÚMERO MÁXIMO DE TENTATIVAS: 3");
        }
    }

    static boolean answer() {
        return new Random().nextInt(3) == 1;
    }

    static void printSelected() {
        String[] candidates = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

        for (String candidate : candidates) {
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
