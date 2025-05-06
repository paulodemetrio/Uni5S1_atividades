/* Astolfo resolveu fazer uma viagem para conhecer o nosso país Ele pretende visitar várias cidades, dividindo assim a viagem em vários trechos. Entretanto Astolfo se nega a passar por estradas cujo custo do pedágio exceda um determinado valor. Faça um programa que leia inicialmente o valor do pedágio ao qual Astolfo se nega a pagar. A seguir leia várias duplas de valores representando respectivamente o custo do pedágio e a distância (em Km) do trecho. Calcular e escrever:

quantos trechos da viagem possuem um valor de pedágio acima do qual Astolfo nega­se a pagar;
quantos trechos foram informados;
quantos trechos acima de 150Km de distância possuem um valor de pedágio que Astolfo concorda em pagar.
OBS: O programa será encerrado ao ser fornecido um valor de pedágio negativo. Neste caso a leitura da distância não deve ser executada. Os resultados devem ser impressos no final do programa.

Exemplo de entrada:

Valor máximo de pedágio: 7,00
*/

import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor máximo de pedágio que Astolfo aceita pagar: ");
        double valorMaximoPedagio = scan.nextDouble();

        int trechosAcimaDoLimite = 0;
        int totalTrechos = 0;
        int trechosLongosAceitaveis = 0;

        System.out.print("Digite o valor do pedágio (ou um valor negativo para encerrar): ");
        double valorPedagio = scan.nextDouble();

        while (valorPedagio >= 0) {
            totalTrechos++;

            if (valorPedagio > valorMaximoPedagio) {
                trechosAcimaDoLimite++;
            } else {
                System.out.print("Digite a distância do trecho (em Km): ");
                double distancia = scan.nextDouble();

                if (distancia > 150) {
                    trechosLongosAceitaveis++;
                }
            }

            System.out.print("Digite o valor do pedágio (ou um valor negativo para encerrar): ");
            valorPedagio = scan.nextDouble();
        }

        System.out.println("Quantidade de trechos com pedágio acima do limite: " + trechosAcimaDoLimite);
        System.out.println("Quantidade total de trechos informados: " + totalTrechos);
        System.out.println("Quantidade de trechos acima de 150Km com pedágio aceitável: " + trechosLongosAceitaveis);

        scan.close();
    }
}