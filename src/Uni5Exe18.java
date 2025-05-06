//Foi feita uma pesquisa de audiência de canal de TV em n casas de um determinado bairro de uma cidade, em um certo dia do mês. Na pesquisa foi utilizado um coletor de dados portátil. Para cada casa visitada, foi fornecido o número do canal (4, 5, 9, 12) e o número de pessoas que estavam assistindo a TV naquele horário, considerando que em cada casa só existia uma televisão. Em casas onde a televisão estava desligada, foi registrado zero para o número do canal e para o número de pessoas. Baseado nisto descreva um algoritmo que calcule e escreva, para cada emissora, o percentual de audiência. A leitura deve ser finalizada quando for informado canal 0.

import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pessoasCanal4 = 0;
        int pessoasCanal5 = 0;
        int pessoasCanal9 = 0;
        int pessoasCanal12 = 0;
        int totalPessoas = 0;

        System.out.print("Digite o número do canal (4, 5, 9, 12 ou 0 para encerrar): ");
        int canal = scan.nextInt();

        while (canal != 0) {
            System.out.print("Digite o número de pessoas assistindo: ");
            int pessoas = scan.nextInt();

            if (canal == 4) {
                pessoasCanal4 += pessoas;
            } else if (canal == 5) {
                pessoasCanal5 += pessoas;
            } else if (canal == 9) {
                pessoasCanal9 += pessoas;
            } else if (canal == 12) {
                pessoasCanal12 += pessoas;
            }

            totalPessoas += pessoas;

            System.out.print("Digite o número do canal (4, 5, 9, 12 ou 0 para encerrar): ");
            canal = scan.nextInt();
        }

        if (totalPessoas > 0) {
            System.out.println("Percentual de audiência do canal 4: " + (pessoasCanal4 * 100 / totalPessoas) + "%");
            System.out.println("Percentual de audiência do canal 5: " + (pessoasCanal5 * 100 / totalPessoas) + "%");
            System.out.println("Percentual de audiência do canal 9: " + (pessoasCanal9 * 100 / totalPessoas) + "%");
            System.out.println("Percentual de audiência do canal 12: " + (pessoasCanal12 * 100 / totalPessoas) + "%");
        } else {
            System.out.println("Nenhuma audiência registrada.");
        }

        scan.close();
    }
}