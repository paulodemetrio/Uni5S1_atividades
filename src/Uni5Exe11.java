// Uma máquina de biscoito está com problemas. Quando ligada, após 1 hora ela quebra 1 biscoito, na segunda hora ela quebra 3 biscoitos, na hora seguinte ela quebra 3 vezes a quantidade de biscoitos quebrados na hora anterior, e assim por diante. Faça um algoritmo que calcule quantos biscoitos são quebrados no final de cada dia (a máquina opera 16 horas por dia).

public class Uni5Exe11 {
    public static void main(String[] args) {
        int quebraHora = 0;
        int quebraAntes = 0;
        for (int i = 1; i <= 16; i++) {
            if (i == 1) {
                quebraHora += 1;
            } else if (i == 2) {
                quebraHora += 3;
                quebraAntes = quebraHora;
            } else {
                quebraHora = quebraHora + (quebraAntes * 3);
            }
        }
        int totalQuebrados = quebraHora + quebraAntes;
        System.out.println("A quantidade de biscoitos quebrados será: " + totalQuebrados);
    }
}
