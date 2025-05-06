/* Um comerciante deseja fazer um levantamento do lucro das 20 mercadorias que comercializa. Para cada mercadoria ele tem o nome, o preço de compra (PC) e o preço de venda (PV). Descreva um algoritmo que:

escreva quantas mercadorias proporcionam: (lucro < 10%), (10% <= lucro <= 20%) e (lucro > 20%), onde o percentual de lucro é calculado da seguinte forma: % = (PV - PC) / PC * 100;
determine e escreva o valor total de compra e de venda de todas as mercadorias, assim como o lucro total.
*/

import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lucroMenor10 = 0, lucroEntre10e20 = 0, lucroMaior20 = 0;
        double totalCompra = 0, totalVenda = 0, lucroTotal = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o nome da mercadoria " + i + ": ");
            String nome = scanner.next();

            System.out.print("Digite o preço de compra da mercadoria " + i + ": ");
            double precoCompra = scanner.nextDouble();

            System.out.print("Digite o preço de venda da mercadoria " + i + ": ");
            double precoVenda = scanner.nextDouble();

            double lucroPercentual = ((precoVenda - precoCompra) / precoCompra) * 100;

            if (lucroPercentual < 10) {
                lucroMenor10++;
            } else if (lucroPercentual <= 20) {
                lucroEntre10e20++;
            } else {
                lucroMaior20++;
            }

            totalCompra += precoCompra;
            totalVenda += precoVenda;
            lucroTotal += (precoVenda - precoCompra);
        }

        System.out.println("\nResumo do levantamento:");
        System.out.println("Mercadorias com lucro menor que 10%: " + lucroMenor10);
        System.out.println("Mercadorias com lucro entre 10% e 20%: " + lucroEntre10e20);
        System.out.println("Mercadorias com lucro maior que 20%: " + lucroMaior20);
        System.out.println("Valor total de compra: R$ " + totalCompra);
        System.out.println("Valor total de venda: R$ " + totalVenda);
        System.out.println("Lucro total: R$ " + lucroTotal);

        scanner.close();
    }
}
