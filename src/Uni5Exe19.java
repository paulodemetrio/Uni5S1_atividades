//Uma loja de departamentos oferece para seus clientes um determinado desconto de acordo com o valor da compra efetuada. O desconto é de 20% caso o valor da compra seja maior que R$ 500,00 e de 15% caso seja menor ou igual. Descreva um algoritmo que leia o valor da compra e escreva o total a pagar a cada compra. Informe também o valor total recebido pela loja ao final do dia. A leitura deve ser finalizada com a leitura 0 para o valor da compra.

import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valorCompra;
        double totalRecebido = 0;

        System.out.print("Digite o valor da compra (ou 0 para encerrar): ");
        valorCompra = scan.nextDouble();

        while (valorCompra != 0) {
            double desconto;
            if (valorCompra > 500) {
                desconto = valorCompra * 0.20;
            } else {
                desconto = valorCompra * 0.15;
            }

            double totalPagar = valorCompra - desconto;
            totalRecebido += totalPagar;

            System.out.println("Total a pagar com desconto: R$ " + totalPagar);

            System.out.print("Digite o valor da próxima compra (ou 0 para encerrar): ");
            valorCompra = scan.nextDouble();
        }

        System.out.println("Valor total recebido pela loja no dia: R$ " + totalRecebido);

        scan.close();
    }
}
