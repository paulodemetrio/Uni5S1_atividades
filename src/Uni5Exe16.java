//Dado um determinado grupo de pessoas, descreva um algoritmo que a partir da altura e do gênero (gênero = 'M' ou gênero = 'm' para masculino; gênero = 'F' e gênero = 'f' para feminino ou gênero = 'O' ou gênero = 'o' para outro) de cada pessoa informe a média da altura das mulheres e a média de altura do grupo. A leitura deve ser finalizada ao digitar 0 para a altura.

import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double altura, somaAlturaMulheres = 0, somaAlturaGrupo = 0;
        int contadorMulheres = 0, contadorGrupo = 0;

        while (true) {
            System.out.print("Digite a altura da pessoa (ou 0 para sair): ");
            altura = scan.nextDouble();

            if (altura == 0) {
                break;
            }

            System.out.print("Digite o gênero da pessoa (M/F/O): ");
            char genero = scan.next().charAt(0);

            somaAlturaGrupo += altura;
            contadorGrupo++;

            if (genero == 'F' || genero == 'f') {
                somaAlturaMulheres += altura;
                contadorMulheres++;
            }
        }

        double mediaAlturaGrupo = somaAlturaGrupo / contadorGrupo;
        double mediaAlturaMulheres = (contadorMulheres > 0) ? (somaAlturaMulheres / contadorMulheres) : 0;

        System.out.printf("Média de altura do grupo: %.2f\n", mediaAlturaGrupo);
        System.out.printf("Média de altura das mulheres: %.2f\n", mediaAlturaMulheres);

        scan.close();
    }
}
