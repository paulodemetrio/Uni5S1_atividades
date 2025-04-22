//Dada uma turma de alunos, contendo seu nome e nota de duas provas descreva um algoritmo para informar a média de cada aluno. Considere que a leitura dos dados deve ser finalizada quando o nome do aluno for “fim”.

import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = "";

        while (!nome.equalsIgnoreCase("fim")) {
            System.out.print("Digite o nome do aluno (ou 'fim' para encerrar): ");
            nome = scan.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                System.out.println("Encerrando o programa.");
                break;
            }

            System.out.print("Digite a nota da primeira prova: ");
            double nota1 = scan.nextDouble();

            System.out.print("Digite a nota da segunda prova: ");
            double nota2 = scan.nextDouble();

            scan.nextLine();

            double media = (nota1 + nota2) / 2;
            System.out.printf("A média do aluno %s é: %.2f\n", nome, media);
        }

        scan.close();
    }
}