/* Implemente o problema da mochila. Tendo-se uma sequência decrescente de números inteiros positivos que inicia em N, com decremento inteiro positivo K, deseja-se empacotá-los em uma mochila com tamanho M, de forma que se coloque dentro dela preferencialmente os maiores valores, até que ela esteja cheia. N e K são inteiros e devem ser definidos pelo usuário. Faça um algoritmo que imprima:

os elementos a serem colocados na mochila;
os elementos que entraram na mochila;
os que ficaram fora da mochila;
qual é a soma dos elementos que entraram na mochila;
qual a soma dos elementos que não entraram na mochila.
*/

import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor inicial N: ");
        int N = scan.nextInt();

        System.out.print("Digite o decremento K: ");
        int K = scan.nextInt();

        System.out.print("Digite o tamanho da mochila M: ");
        int M = scan.nextInt();

        int somaDentro = 0;
        int somaFora = 0;
        String elementos = "";
        String dentroMochila = "";
        String foraMochila = "";

        while (N > 0) {
            elementos += N + " ";
            if (somaDentro + N <= M) {
                dentroMochila += N + " ";
                somaDentro += N;
            } else {
                foraMochila += N + " ";
                somaFora += N;
            }
            N -= K;
        }

        System.out.println("Elementos a serem colocados na mochila: " + elementos);
        System.out.println("Elementos que entraram na mochila: " + dentroMochila);
        System.out.println("Elementos que ficaram fora da mochila: " + foraMochila);
        System.out.println("Soma dos elementos que entraram na mochila: " + somaDentro);
        System.out.println("Soma dos elementos que não entraram na mochila: " + somaFora);

        scan.close();
    }
}