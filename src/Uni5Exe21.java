//Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metros e cresce 3 centímetros por ano. Construa um algoritmo que calcule e imprima quantos anos serão necessários para que Zé seja maior que Chico.

public class Uni5Exe21 {
    public static void main(String[] args) {
        double alturaChico = 1.50;
        double alturaZe = 1.10;
        int anos = 0;

        while (alturaZe <= alturaChico) {
            alturaChico += 0.02;
            alturaZe += 0.03;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para que Zé seja maior que Chico.");
    }
}