/* Descreva um algoritmo que escreva os n primeiros termos da seguinte sequência de números:

8, 10, 16, 18, 32, 34, 64

O valor n deve ser lido e deve ser maior do que 2.*/

import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        do {
            System.out.print("Digite o valor de n (maior que 2): ");
            n = scan.nextInt();
            if (n <= 2) {
                System.out.println("O valor de n deve ser maior que 2. Tente novamente.");
            }
        } while (n <= 2);

        int termo = 8;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(termo);
                if (i < n) {
                    System.out.print(", ");
                }
            } else {
                System.out.print(termo + 2);
                termo *= 2;
                if (i < n) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
        scan.close();
    }
}
