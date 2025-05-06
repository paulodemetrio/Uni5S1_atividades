/* Em uma disputa de pingue-pongue os pontos são anotados como D, ponto para o jogador do lado direito, e E, ponto para o jogador do lado esquerdo da mesa. Descreva um algoritmo que leia o código do ponto de cada jogada e determine o vencedor. A partida encerra quando:

um dos jogadores chegar a 21 pontos e a diferença de pontos entre os jogadores for maior ou igual a dois;
o jogador com mais de 21 pontos conseguir uma diferença de dois pontos sobre o adversário, caso a primeira condição não seja atendida.
*/

import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pontosDireita = 0;
        int pontosEsquerda = 0;
        boolean partidaEncerrada = false;

        while (!partidaEncerrada) {
            System.out.print("Digite o ponto (D para direita, E para esquerda): ");
            char ponto = scan.next().toUpperCase().charAt(0);

            if (ponto == 'D') {
                pontosDireita++;
            } else if (ponto == 'E') {
                pontosEsquerda++;
            } else {
                System.out.println("Entrada inválida. Digite D ou E.");
                continue;
            }

            if ((pontosDireita >= 21 || pontosEsquerda >= 21) && 
                Math.abs(pontosDireita - pontosEsquerda) >= 2) {
                partidaEncerrada = true;
            }
        }

        if (pontosDireita > pontosEsquerda) {
            System.out.println("Jogador da direita venceu com " + pontosDireita + " pontos.");
        } else {
            System.out.println("Jogador da esquerda venceu com " + pontosEsquerda + " pontos.");
        }

        scan.close();
    }
}
