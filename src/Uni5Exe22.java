//Um funcionário recebe aumento anual. Em 1995 foi contratado por 2000 reais. Em 1996 recebeu aumento de 1.5%. A partir de 1997, os aumentos sempre correspondem ao dobro do ano anterior. Faça programa que determine o salário atual do funcionário.

public class Uni5Exe22 {
    public static void main(String[] args) {
        double salario = 2000.0;
        double aumento = 0.015;
        int ano = 1996;

        while (ano <= 2025) {
            salario += salario * aumento;
            aumento *= 2;
            ano++;
        }

        System.out.println("O salário atual do funcionário é: R$ " + salario);
    }
}
