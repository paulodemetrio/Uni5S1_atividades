//Descreva um algoritmo que leia a altura de 20 pessoas e calcule a média de altura das mesmas.

import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double somaAlturas = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.print("Altura da pessoa " + i + ": ");
            double alt = scan.nextDouble();
            somaAlturas += alt;
        }
        double media = somaAlturas / 20;
        System.out.println("A média das alturas é: " + media);
        scan.close();
    }
}
