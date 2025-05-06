/* Descreva um algoritmo que leia o número de inscrição e a altura de um atleta em uma competição e informe:

o número de inscrição e a altura do atleta mais alto;
o número de inscrição e a altura do atleta mais baixo;
a altura média do grupo de atletas.
A leitura deve ser finalizada ao digitar 0 para o número de inscrição.*/

import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroInscricao;
        int atletaMaisAlto = 0;
        int atletaMaisBaixo = 0;
        double altura;
        double alturaMaisAlta = 0;
        double alturaMaisBaixa = Double.MAX_VALUE;
        double somaAltura = 0;
        int contadorAtletas = 0;

        System.out.print("Digite o número de inscrição do atleta (ou 0 para sair): ");
        numeroInscricao = scan.nextInt();

        while (numeroInscricao != 0) {
            System.out.print("Digite a altura do atleta: ");
            altura = scan.nextDouble();

            if (altura > alturaMaisAlta) {
                alturaMaisAlta = altura;
                atletaMaisAlto = numeroInscricao;
            }

            if (altura < alturaMaisBaixa) {
                alturaMaisBaixa = altura;
                atletaMaisBaixo = numeroInscricao;
            }

            somaAltura += altura;
            contadorAtletas++;

            System.out.print("Digite o número de inscrição do atleta (ou 0 para sair): ");
            numeroInscricao = scan.nextInt();
        }

        if (contadorAtletas > 0) {
            double mediaAltura = somaAltura / contadorAtletas;
            System.out.println("Atleta mais alto: Número de Inscrição " + atletaMaisAlto + ", Altura " + alturaMaisAlta);
            System.out.println("Atleta mais baixo: Número de Inscrição " + atletaMaisBaixo + ", Altura " + alturaMaisBaixa);
            System.out.printf("Altura média do grupo de atletas: " + mediaAltura);
        } else {
            System.out.println("Nenhum atleta foi registrado.");
        }

        scan.close();
    }
}