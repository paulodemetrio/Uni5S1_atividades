/* Descreva um algoritmo que leia um número inteiro n e, dados n números inteiros, descreva um algoritmo que:

escreva o menor valor negativo;
escreva a média dos números positivos.
*/

import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menor = 0;
        int soma = 0;
        int media = 0;
        int contadorPositivos = 0;

        System.out.println("Quantos números serão digitados? ");
        int n = scan.nextInt();
        System.out.println("Serão digitados " + n + " números inteiros.");
        for (int i = 1; i <= n; i++) {
            System.out.println("Digite o " + i + "º número:");
            int num = scan.nextInt();
            if (num > 0) {
                contadorPositivos++;
                soma += num;
            }
            if (i == 1) {
                menor = num;
            } else {
                if (num < menor) {
                    menor = num;
                }
            }
        }
        media = soma / contadorPositivos;
        System.out.println("O menor é: " + menor);
        System.out.println("O média dos positivos é: " + media);
        scan.close();
    }
}
