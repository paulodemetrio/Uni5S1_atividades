//Um caixa automático possui cédulas de 1, 2, 5, 10 e 20. Faça um programa que leia um valor e informe a quantidade mínima de cédulas que ele precisará combinar para entregar o valor solicitado. Por exemplo: se o valor for 6, então ele fornecerá uma cédula de 5 e outra de 1. Se o número for 47, então ele fornecerá duas cédulas de 20, uma de 5 e outras de 2.

import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor a ser sacado: ");
        int valor = scan.nextInt();

        int cedulas20 = 0, cedulas10 = 0, cedulas5 = 0, cedulas2 = 0, cedulas1 = 0;

        while (valor > 0) {
            if (valor >= 20) {
                cedulas20++;
                valor -= 20;
            } else if (valor >= 10) {
                cedulas10++;
                valor -= 10;
            } else if (valor >= 5) {
                cedulas5++;
                valor -= 5;
            } else if (valor >= 2) {
                cedulas2++;
                valor -= 2;
            } else {
                cedulas1++;
                valor -= 1;
            }
        }

        System.out.println("Quantidade de cédulas:");
        System.out.println("20: " + cedulas20);
        System.out.println("10: " + cedulas10);
        System.out.println("5: " + cedulas5);
        System.out.println("2: " + cedulas2);
        System.out.println("1: " + cedulas1);

        scan.close();
    }
}
