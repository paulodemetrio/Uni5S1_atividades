//Descreva um algoritmo que leia um número inteiro n e, dados n números reais informe o maior e o menor número.

import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a quantidade de número: ");
        int n = scan.nextInt();
        double maior = 0;
        double menor = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Informe o valor: ");
            double valor = scan.nextDouble();
            if (i == 1) {
                maior = valor;
                menor = valor;
            } else {
                if (valor > maior) {
                    maior = valor;
                }
                if (valor < menor) {
                    menor = valor;
                }
            }
        }
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        scan.close();
    }
}
