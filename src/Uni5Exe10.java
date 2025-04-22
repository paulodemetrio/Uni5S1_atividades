/* 
    O número 3025 possui a seguinte característica:

    30 + 25 = 55 -> 55^2 = 3025

    Escreva um programa que pesquise e imprima os 10 primeiros números naturais que apresentam tal propriedade. Outros exemplos:

    20 + 25 = 45 -> 45^2 = 2025

*/
public class Uni5Exe10 {
    public static void main(String[] args) {
        for (int i = 1; i < 999999999; i++) {
            int a = i / 100;
            int b = i % 100;
            int c = a + b;
            if (c * c == i) {
                System.out.println(i);
            }
        }
    }
}
