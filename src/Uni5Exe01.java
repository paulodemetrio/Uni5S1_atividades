//Descreva um algoritmo que leia 20 números inteiros e escreva, para cada número lido, se o mesmo é par ou ímpar.

import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i < 21; i++) {
            System.out.println("Digite o valor:");
            int valor = scan.nextInt();
            if (valor % 2 == 0) {
                System.out.println("Par.");
            } else {
                System.out.println("Ímpar.");
            }
        }
        scan.close();
    }    
}
