/* Uma fábrica resolveu, no mês de Abril, pagar seus funcionários um valor diário conforme as regras descritas abaixo. Escreva um programa para ler o dia do mês de abril que será calculado o valor diário. O programa deve validar a leitura do dia deforma a aceitar apenas valores válidos para o mês de Abril (1 a 30). Caso o dia seja inválido, escrever a mensagem "Dia inválido" e repetir a leitura até que seja válido. A seguir deve ser lido o total de peças produzidas pelo funcionário no turno da manhã e o total de peças produzidas no turno da tarde. Escrever o valor que o respectivo funcionário receberá no dia. Logo após exibir a mensagem "Novo funcionário (1.sim 2.não)?". Caso a resposta seja 1 o programa deve ser repetido solicitando novamente o dia do mês e a produção de peças do funcionário em cada turno, caso contrário deve ser encerrado.

Regras:

para a primeira quinzena do mês (1 a 15) o funcionário recebe R$ 0,80 por peça caso tenha produzido mais de 100 no dia (considerando manhã e tarde), desde que a produção em cada um dos turnos não seja inferior a 30. Caso contrário recebe R$ 0,50 por peça.
para a segunda quinzena do mês (16 a 30) o funcionário recebe R$ 0,40 por peça produzida no turno da manhã e R$ 0,30 por peça produzida no turno da tarde.
Considere que a produção em cada turno nunca será a mesma (não é necessário validar) Responda também:

qual dia ocorreu a maior produção;
em qual período o funcionário mais produz (manhã ou tarde e a quantidade produzida).
*/

import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maiorProducaoDia = 0;
        int maiorProducaoQuantidade = 0;
        int totalProducaoManha = 0;
        int totalProducaoTarde = 0;

        int novoFuncionario = 1;

        while (novoFuncionario == 1) {
            int dia;
            do {
                System.out.print("Digite o dia do mês de Abril (1 a 30): ");
                dia = scan.nextInt();
                if (dia < 1 || dia > 30) {
                    System.out.println("Dia inválido");
                }
            } while (dia < 1 || dia > 30);

            System.out.print("Digite o total de peças produzidas no turno da manhã: ");
            int producaoManha = scan.nextInt();

            System.out.print("Digite o total de peças produzidas no turno da tarde: ");
            int producaoTarde = scan.nextInt();

            int producaoTotal = producaoManha + producaoTarde;
            double valorReceber = 0;

            if (dia >= 1 && dia <= 15) {
                if (producaoTotal > 100 && producaoManha >= 30 && producaoTarde >= 30) {
                    valorReceber = producaoTotal * 0.80;
                } else {
                    valorReceber = producaoTotal * 0.50;
                }
            } else if (dia >= 16 && dia <= 30) {
                valorReceber = (producaoManha * 0.40) + (producaoTarde * 0.30);
            }

            System.out.println("Valor a receber no dia: R$ " + valorReceber);

            if (producaoTotal > maiorProducaoQuantidade) {
                maiorProducaoQuantidade = producaoTotal;
                maiorProducaoDia = dia;
            }

            totalProducaoManha += producaoManha;
            totalProducaoTarde += producaoTarde;

            System.out.print("Novo funcionário (1.sim 2.não)? ");
            novoFuncionario = scan.nextInt();
        }

        System.out.println("Dia com maior produção: " + maiorProducaoDia + " com " + maiorProducaoQuantidade + " peças.");
        if (totalProducaoManha > totalProducaoTarde) {
            System.out.println("Maior produção foi no turno da manhã com " + totalProducaoManha + " peças.");
        } else {
            System.out.println("Maior produção foi no turno da tarde com " + totalProducaoTarde + " peças.");
        }

        scan.close();
    }
}
