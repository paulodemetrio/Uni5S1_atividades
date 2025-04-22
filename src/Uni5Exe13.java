/* Um motorista acaba de voltar de um feriado prolongado. Antes de sair de viagem e imediatamente após retornar, o motorista encheu o tanque do veículo e registrou as medidas do odômetro. Em cada parada feita durante a viagem, foi registrado o valor do odômetro e a quantidade de combustível comprado para reabastecer o veículo (suponha que o tanque foi enchido a cada parada). Descreva um algoritmo que leia o número total de reabastecimentos feitos e os dados registrados relativos à compra de combustível. Calcule e escreva:

a quilometragem obtida por litro de combustível em cada parada;
a quilometragem média obtida por litro de combustível em toda a viagem.
*/
import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número total de reabastecimentos: ");
        int nReabastecimentos = scan.nextInt();

        double odometroAnterior = 0;
        double totalKm = 0;
        double totalCombustivel = 0;

        for (int i = 1; i <= nReabastecimentos; i++) {
            System.out.printf("Digite o valor do odômetro no reabastecimento " + i + ": ");
            double odometroAtual = scan.nextDouble();

            System.out.printf("Digite a quantidade de combustível abastecida no reabastecimento " + i + ": ");
            double combustivel = scan.nextDouble();

            if (i > 1) {
                double kmParada = odometroAtual - odometroAnterior;
                double kmPorLitro = kmParada / combustivel;
                System.out.printf("Reabastecimento " + i + ": " + kmPorLitro);

                totalKm += kmParada;
            }

            totalCombustivel += combustivel;
            odometroAnterior = odometroAtual;
        }

        double mediaKmPorLitro = totalKm / totalCombustivel;
        System.out.printf("Média de quilometragem obtida por litro de combustível: " + mediaKmPorLitro);

        scan.close();
    }
}