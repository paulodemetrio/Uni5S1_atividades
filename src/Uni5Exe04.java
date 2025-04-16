/* Descreva um algoritmo para calcular o valor de S dado por:

S = 3/2 + 5/6 + 7/12 + 9/20 + 11/30 + ...

Considere os 20 primeiros termos da série.

*/

public class Uni5Exe04 {
    public static void main(String[] args) {
        double s = 0;
        for (int i = 1; i <= 20; i++) {
            double numerador = 2 * i + 1;
            double denominador = i * (i + 1);
            s += numerador / denominador;
        }
        System.out.println("O valor de S com os 20 primeiros termos é: " + s);
    }
}
