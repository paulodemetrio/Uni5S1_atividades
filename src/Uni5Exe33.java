/* Em uma eleição para presidência, existem 4 candidatos. Os votos são informados através de código. Os dados utilizados para votação obedecem a seguinte codificação:

1, 2, 3, 4 = voto para o respectivo candidato;
5 = voto nulo;
6 = voto em branco.
Elabore um programa que calcule e escreva:

total de votos para cada candidato;
total de votos nulos;
total de votos em branco;
percentual dos votos em branco e nulos sobre o total.
Se o usuário informar um número de operação incorreto, emitir a mensagem “Opção incorreta” e persistir solicitando um número de opção correto. Para interromper a operação, o usuário poderá fornecer o número 0.

*/

import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosCandidato4 = 0;
        int votosNulos = 0;
        int votosBrancos = 0;
        int totalVotos = 0;

        int voto;

        do {
            System.out.print("Digite o código do voto (1-4 para candidatos, 5 para nulo, 6 para branco, 0 para encerrar): ");
            voto = scan.nextInt();

            if (voto == 0) {
                break;
            }

            switch (voto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                case 4:
                    votosCandidato4++;
                    break;
                case 5:
                    votosNulos++;
                    break;
                case 6:
                    votosBrancos++;
                    break;
                default:
                    System.out.println("Opção incorreta");
                    continue;
            }

            totalVotos++;
        } while (voto != 0);

        System.out.println("Total de votos para o candidato 1: " + votosCandidato1);
        System.out.println("Total de votos para o candidato 2: " + votosCandidato2);
        System.out.println("Total de votos para o candidato 3: " + votosCandidato3);
        System.out.println("Total de votos para o candidato 4: " + votosCandidato4);
        System.out.println("Total de votos nulos: " + votosNulos);
        System.out.println("Total de votos em branco: " + votosBrancos);

        if (totalVotos > 0) {
            double percentualNulos = (votosNulos * 100.0) / totalVotos;
            double percentualBrancos = (votosBrancos * 100.0) / totalVotos;

            System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
            System.out.println("Percentual de votos em branco: " + percentualBrancos + "%");
        }

        scan.close();
    }
}
