//Uma grande loja de departamentos paga aos vendedores um salário com base nas vendas efetuadas durante o mês, que é igual a 30% de comissão sobre o preço de cada produto vendido. Cada vendedor, em um determinado mês, vende n produtos, onde, para cada produto tem-se o preço unitário e a quantidade vendida. O departamento de pessoal deseja obter um relatório com: nome, total de vendas (em R$) e salário de cada vendedor. Descreva um algoritmo que gere o relatório desejado. Para prosseguir com a entrada de dados o algoritmo deve apresentar a seguinte mensagem: “deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?”. O número de produtos (n) de cada vendedor deve ser informado.

import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Digite o nome do vendedor: ");
            String nome = scan.nextLine();

            System.out.print("Digite o número de produtos vendidos: ");
            int numProdutos = scan.nextInt();

            double totalVendas = 0;
            int contador = 0;

            while (contador < numProdutos) {
                System.out.print("Digite o preço unitário do produto: ");
                double preco = scan.nextDouble();

                System.out.print("Digite a quantidade vendida: ");
                int quantidade = scan.nextInt();

                totalVendas += preco * quantidade;
                contador++;
            }

            double salario = totalVendas * 0.30;

            System.out.println("Nome: " + nome);
            System.out.println("Total de vendas: R$ " + totalVendas);
            System.out.println("Salário: R$ " + salario);

            System.out.print("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)? ");
            scan.nextLine();
            continuar = scan.nextLine();
        }

        scan.close();
    }
}