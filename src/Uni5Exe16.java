//Dado um determinado grupo de pessoas, descreva um algoritmo que a partir da altura e do gênero (gênero = 'M' ou gênero = 'm' para masculino; gênero = 'F' e gênero = 'f' para feminino ou gênero = 'O' ou gênero = 'o' para outro) de cada pessoa informe a média da altura das mulheres e a média de altura do grupo. A leitura deve ser finalizada ao digitar 0 para a altura.

import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaAlturaMulheres = 0; 
        double somaAlturaGrupo = 0;    
        int contadorMulheres = 0;      
        int contadorGrupo = 0;         

        System.out.print("Digite a altura da pessoa (ou 0 para sair): ");
        double altura = scanner.nextDouble();

        while (altura != 0) {
            System.out.print("Digite o gênero da pessoa (M/F/O): ");
            char genero = scanner.next().charAt(0);

            somaAlturaGrupo += altura; 
            contadorGrupo++;   

            if (genero == 'F' || genero == 'f') { 
                somaAlturaMulheres += altura;
                contadorMulheres++;          
            }

            System.out.print("Digite a altura da pessoa (ou 0 para sair): ");
            altura = scanner.nextDouble();
        }

        double mediaAlturaGrupo = contadorGrupo > 0 ? somaAlturaGrupo / contadorGrupo : 0;
        double mediaAlturaMulheres = contadorMulheres > 0 ? somaAlturaMulheres / contadorMulheres : 0;

        System.out.println("Média de altura do grupo: " + mediaAlturaGrupo);
        System.out.println("Média de altura das mulheres: " + mediaAlturaMulheres);

        scanner.close();
    }
}