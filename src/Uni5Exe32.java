/* Escreva um programa que imprime um calendário para um determinado mês. O calendário deve conter cada dia do mês e o dia da semana correspondente. A entrada consiste de um inteiro especificando em que dia da semana cai o primeiro dia do mês (1=Domingo, 2=Segunda,...,7=Sábado) e um inteiro especificando o número de dias que o mês possui.

Exemplo: p = 3 n = 31

*/

import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o dia da semana do primeiro dia do mês (1=Domingo, 2=Segunda,...,7=Sábado): ");
        int primeiroDia = scan.nextInt();

        System.out.print("Digite o número de dias do mês: ");
        int numeroDias = scan.nextInt();

        String[] diasSemana = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};

        int dia = 1;
        while (dia <= numeroDias) {
            int diaSemanaIndex = (primeiroDia + dia - 2) % 7;
            System.out.println("Dia " + dia + " - " + diasSemana[diaSemanaIndex]);
            dia++;
        }

        scan.close();
    }
}