//Um determinado material radioativo perde metade de sua massa a cada 50 segundos. Dada a sua massa inicial em Kg, descreva um algoritmo que determine o tempo necessário para que essa massa se torne menor que 0,5 gramas. Escreva a massa inicial, a massa final e o tempo.

import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a massa inicial do material (em Kg): ");
        double massaInicial = scan.nextDouble();
        double massaFinal = massaInicial;
        int tempo = 0;

        while (massaFinal >= 0.0005) {
            massaFinal /= 2;
            tempo += 50;
        }

        System.out.println("Massa inicial: " + massaInicial + " Kg");
        System.out.println("Massa final: " + massaFinal + " Kg");
        System.out.println("Tempo necessário: " + tempo + " segundos");

        scan.close();
    }
}
