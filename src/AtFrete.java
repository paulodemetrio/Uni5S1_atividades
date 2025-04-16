import java.util.Scanner;

public class AtFrete {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o tipo de embalagem desejada?");
        System.out.println("1 - Caixa");
        System.out.println("2 - Cilindro");
        int op = scan.nextInt();
        switch (op) {
            case 1:
                System.out.println("Altura da caixa (cm): ");
                double altCaixa = scan.nextInt();
                System.out.println("Largura da caixa (cm): ");
                double largCaixa = scan.nextInt();
                System.out.println("Comprimento da caixa (cm): ");
                double compCaixa = scan.nextInt();
                double pesoCubico = compCaixa * largCaixa * altCaixa / 6000;
                if (pesoCubico <= 300) {
                    String sla = "sla";
                    System.err.println(sla);
                }
                break;
            case 2:
                System.out.println("Altura do cilindro: ");
                double altCilindro = scan.nextInt();
                System.out.println("Largura do cilindro: ");
                double largCilindro = scan.nextInt();
                System.out.println("Comprimento do cilindro: ");
                double compCilindro = scan.nextInt();
                System.out.println("Peso do cilindro: ");
                double pesoCilindro = scan.nextInt();

            default:
                System.out.println("Opção inválida!");
                break;
        }
        scan.close();
    }
}
