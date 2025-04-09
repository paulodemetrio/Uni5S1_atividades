/* Descreva um algoritmo para calcular o valor de S dado por:

S = 3/2 + 5/6 + 7/12 + 9/20 + 11/30 + ...

Considere os 20 primeiros termos da série.

*/

public class Uni5Exe04 {
    public static void main(String[] args) {
        for (int i = 0; i <= 20 ; i++) {
            int numerador = 0;
            int denominador = 0;
            if (i % 2 != 0) {
                numerador = i;
                //System.out.println(numerador);
                // FALTA IMPLEMENTAR OS DENOMINADORES PARA FAZER A DIVISÃO

                double s = numerador / denominador;
                System.out.println("S = " + s);
            }
        }
    }
}
