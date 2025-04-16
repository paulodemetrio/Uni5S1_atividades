/* Uma turma tem n alunos. Dado n, o nome e idade de cada aluno descreva um algoritmo que:

escreva os nomes dos alunos que tem 18 anos;
escreva a quantidade de alunos que tem idade acima de 20 anos.
*/

import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtdeMais20 = 0;
        String nomes18 = "";

        System.out.println("Quantos alunos serão informados? ");
        int nAlunos = scan.nextInt();
        System.out.println("Serão informados " + nAlunos + " alunos.");
        for (int i = 1; i <= nAlunos; i++) {
            System.out.println("Digite o nome do " + i + "º aluno:");
            String nome = scan.next();
            System.out.println("Digite a idade do " + i + "º aluno:");
            int idade = scan.nextInt();
            if (idade > 20) {
                qtdeMais20++;
            }
            if (idade == 18) {
                nomes18 += "- " + nome + "\n";
            }
        }
        System.out.println("\nAlunos com 18 anos:");
        if (nomes18.isEmpty()) {
            System.out.println("Nenhum aluno tem 18 anos.");
        } else {
            System.out.println(nomes18);
        }
        if (qtdeMais20 == 0) {
            System.out.println("Nenhum aluno tem mais que 20 anos.");
        } else {
            System.out.println("A quantidade de alunos com mais de 20 anos é " + qtdeMais20 + ".");
        }
        scan.close();
    }
}
