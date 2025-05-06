//Os regulamentos de uma competição de pesca impõem um limite no peso total de pesca de um dia. Descreva um algoritmo que leia o limite diário (em quilogramas) e então leia o peso (em gramas) de cada peixe e escreva o peso total da pesca obtido até aquele ponto. Quando o limite diário for excedido escreva uma mensagem e encerre a execução do algoritmo. Para prosseguir com a entrada de dados de pesos de cada peixe o algoritmo deve apresentar a seguinte mensagem: “deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?”.

import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o limite diário de pesca (em Kg): ");
        double limiteDiario = scan.nextDouble() * 1000;

        double pesoTotal = 0;
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Digite o peso do peixe (em gramas): ");
            double pesoPeixe = scan.nextDouble();

            pesoTotal += pesoPeixe;

            if (pesoTotal > limiteDiario) {
                System.out.println("Limite diário excedido! Peso total: " + pesoTotal + " gramas.");
                break;
            }

            System.out.println("Peso total até agora: " + pesoTotal + " gramas.");
            System.out.print("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)? ");
            scan.nextLine();
            continuar = scan.nextLine();
        }

        scan.close();
    }
}
