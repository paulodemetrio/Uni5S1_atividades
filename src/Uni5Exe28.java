/* Uma emissora de rádio decidiu promover uma eleição para determinar o melhor conjunto do ano segundo a opinião dos ouvintes. Entraram na disputa apenas os quatro conjuntos mais solicitados durante o ano. Os votos são informados através de códigos:

código	conjunto
1	Nenhum de Nós
2	CPM22
3	Skank
4	Jota Quest
Descreva um algoritmo que:

informe o total de votos para cada grupo;
informe o percentual dos votos para cada grupo;
informe o grupo vencedor.
O algoritmo deve apresentar ao usuário a seguinte mensagem: mais um voto: s (SIM) / n (NÃO)? antes de prosseguir com a entrada de dados.

*/

import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int votosNenhumDeNos = 0;
        int votosCPM22 = 0;
        int votosSkank = 0;
        int votosJotaQuest = 0;
        int totalVotos = 0;

        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.println("Vote no seu conjunto favorito:");
            System.out.println("1 - Nenhum de Nós");
            System.out.println("2 - CPM22");
            System.out.println("3 - Skank");
            System.out.println("4 - Jota Quest");
            System.out.print("Digite o código do conjunto: ");
            int voto = scan.nextInt();

            switch (voto) {
                case 1:
                    votosNenhumDeNos++;
                    break;
                case 2:
                    votosCPM22++;
                    break;
                case 3:
                    votosSkank++;
                    break;
                case 4:
                    votosJotaQuest++;
                    break;
                default:
                    System.out.println("Voto inválido.");
                    continue;
            }

            totalVotos++;

            System.out.print("Mais um voto: s (SIM) / n (NÃO)? ");
            scan.nextLine();
            continuar = scan.nextLine();
        }

        System.out.println("Total de votos:");
        System.out.println("Nenhum de Nós: " + votosNenhumDeNos);
        System.out.println("CPM22: " + votosCPM22);
        System.out.println("Skank: " + votosSkank);
        System.out.println("Jota Quest: " + votosJotaQuest);

        if (totalVotos > 0) {
            System.out.println("Percentual de votos:");
            System.out.println("Nenhum de Nós: " + (votosNenhumDeNos * 100 / totalVotos) + "%");
            System.out.println("CPM22: " + (votosCPM22 * 100 / totalVotos) + "%");
            System.out.println("Skank: " + (votosSkank * 100 / totalVotos) + "%");
            System.out.println("Jota Quest: " + (votosJotaQuest * 100 / totalVotos) + "%");
        }

        int vencedor = Math.max(Math.max(votosNenhumDeNos, votosCPM22), Math.max(votosSkank, votosJotaQuest));
        System.out.print("Grupo vencedor: ");
        if (vencedor == votosNenhumDeNos) {
            System.out.println("Nenhum de Nós");
        } else if (vencedor == votosCPM22) {
            System.out.println("CPM22");
        } else if (vencedor == votosSkank) {
            System.out.println("Skank");
        } else {
            System.out.println("Jota Quest");
        }

        scan.close();
    }
}
