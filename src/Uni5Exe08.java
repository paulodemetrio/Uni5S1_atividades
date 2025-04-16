/* Descreva um algoritmo que leia um número inteiro n e, dados n números inteiros, descreva um algoritmo que:

escreva o menor valor negativo;
escreva a média dos números positivos.
*/

import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Integer menorNegativo = null;
        int somaPositivos = 0;
        int contadorPositivos = 0;

        System.out.println("Digite os " + n + " números inteiros:");
        for (int i = 0; i < n; i++) {
            int numero = scan.nextInt();

            if (numero < 0) {
                if (menorNegativo == null || numero < menorNegativo) {
                    menorNegativo = numero;
                }
            } else if (numero > 0) {
                somaPositivos += numero;
                contadorPositivos++;
            }
        }

        if (menorNegativo != null) {
            System.out.println("O menor valor negativo é: " + menorNegativo);
        } else {
            System.out.println("Nenhum número negativo foi inserido.");
        }

        if (contadorPositivos > 0) {
            double mediaPositivos = (double) somaPositivos / contadorPositivos;
            System.out.println("A média dos números positivos é: " + mediaPositivos);
        } else {
            System.out.println("Nenhum número positivo foi inserido, portanto a média não pode ser calculada.");
        }

        scan.close();

    }
}
