// Uma máquina de biscoito está com problemas. Quando ligada, após 1 hora ela quebra 1 biscoito, na segunda hora ela quebra 3 biscoitos, na hora seguinte ela quebra 3 vezes a quantidade de biscoitos quebrados na hora anterior, e assim por diante. Faça um algoritmo que calcule quantos biscoitos são quebrados no final de cada dia (a máquina opera 16 horas por dia).

public class Uni5Exe11 {
    public static void main(String[] args) {
        int quebraHora = 1;
        int totalQuebrados = quebraHora;
        int quebraAntes = quebraHora;

        for (int i = 2; i <= 16; i++) {
            quebraHora = quebraAntes * 3;
            totalQuebrados += quebraHora;
            quebraAntes = quebraHora;
        }

        System.out.println("A quantidade de biscoitos quebrados será: " + totalQuebrados);
    }
}
