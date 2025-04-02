import java.util.Scanner;

public class Frete {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o tipo de embalagem desejada?");
        System.out.println("1 - Caixa");
        System.out.println("2 - Cilindro");
        int op = scan.nextInt();
        switch (op) {
            case 1:
                System.out.println("Altura da caixa: ");
                double altCaixa = scan.nextInt();
                System.out.println("Largura da caixa: ");
                double largCaixa = scan.nextInt();
                System.out.println("Comprimento da caixa: ");
                double compCaixa = scan.nextInt();
                System.out.println("Peso da caixa: ");
                double pesoCaixa = scan.nextInt();
                
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
