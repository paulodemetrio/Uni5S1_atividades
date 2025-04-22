//Escreva um programa que leia um número inteiro positivo n e em seguida imprima n linhas do chamado Triangulo de Floyd:

public class Uni5Exe12 {
    public static void main(String[] args) {
        int linha = 6;
        int num = 1;

        for (int i = 1; i <= linha; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
