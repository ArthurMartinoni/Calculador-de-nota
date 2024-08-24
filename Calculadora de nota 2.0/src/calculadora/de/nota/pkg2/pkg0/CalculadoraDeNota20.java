package calculadora.de.nota.pkg2.pkg0;

import java.util.Scanner;

public class CalculadoraDeNota20 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de alunos na turma: ");
        int numAlunos = scanner.nextInt();

        System.out.print("Digite o número de provas realizadas no semestre: ");
        int numProvas = scanner.nextInt();

        int aprovados = 0;
        int reprovados = 0;

        for (int i = 1; i <= numAlunos; i++) {
            System.out.println("\nAluno " + i);
            double notaFinal = 0;

            for (int j = 1; j <= numProvas; j++) {
                System.out.print("Digite a nota da prova " + j + ": ");
                double notaProva = scanner.nextDouble();
                notaFinal += notaProva;
            }

            notaFinal /= numProvas;
            System.out.println("Nota final do aluno " + i + ": " + notaFinal);

            if (notaFinal >= 70) {
                System.out.println("Aprovado!");
                aprovados++;
            } else {
                System.out.println("Reprovado!");
                reprovados++;
            }
        }

        System.out.println("\nTotal de alunos aprovados: " + aprovados);
        System.out.println("Total de alunos reprovados: " + reprovados);

        scanner.close();
    }
}


